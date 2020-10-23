# Prepare image which dependencies
FROM ruby:2.7.1 AS builder-dependencies
ENV PAGES_REPO_NWO=test_repo/repo

WORKDIR /src

COPY docs/Gemfile /src/
COPY docs/Gemfile.lock /src/

RUN bundle install --path /src/../vendor/bundle

# Use builder-dependencies to actualy build Jekyll
FROM builder-dependencies as builder

COPY docs /src/

RUN bundle exec jekyll build

# Run proxy to show Jekyll site
FROM nginx

EXPOSE 80

COPY --from=builder /src/_site/ /usr/share/nginx/html
