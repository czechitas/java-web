.PHONY: help build watch

ROOT_DIR:=$(shell dirname $(realpath $(firstword $(MAKEFILE_LIST))))
IMAGE_NAME=czechitas-web-java-1
NGINX_IMAGE_NAME="$(IMAGE_NAME)-nginx"


help: ## Print this help message.
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

build:	## Build the docker image Jekyll Blog
	docker build -t $(IMAGE_NAME) .

run: build ## Run the build Jekyll blog server
	docker run -d -p 80:80 $(IMAGE_NAME)

stop: ## Stop Jekyll Blog server
	docker stop `docker ps -a -q --filter ancestor=$(IMAGE_NAME) --format="{{.ID}}"`

watch: ## Continuous build with running Jekyll server
	docker build --target builder -t $(IMAGE_NAME) .
	docker run --rm -d -p 80:80 -v '$(ROOT_DIR)/docs/_site/:/usr/share/nginx/html' --name $(NGINX_IMAGE_NAME)  nginx
	docker run --rm -v "$(ROOT_DIR)/docs:/src" -w /src "$(IMAGE_NAME):latest" bash -c 'bundle install --path /src/../vendor/bundle && bundle exec jekyll build --watch'
