Tato složka slouží pro *globální* soubory,
které mohou být includovány z Jekyllových stránek.
Globální soubory pro include jsou takové, které nepatří konkrétnímu kurzu.
Jekyllové stránky, které je mohou odkazovat, jsou soubory `html` s *front matter*
nebo soubory `markdown` s i bez *front matter*.

Poznámka 1: V souboru `/_config.yml` bylo překonfigurováno nastavení `includes_dir` z výchozího `/_includes` na `/`,
aby se umožnilo souboru `/_layouts/default_post.html` includovat soubory
ze složek kurzů (např. `/2019-jaro/java-1/`).
Includovaná cesta totiž nesmí obsahovat `..` a pokud bychom `includes_dir` nepřekonfigurovali,
`/_layouts/default_post.html` by neměl šanci includovat žádné soubory odjinud
než ze složky `/_layouts` (pomocí `{{ include }}`) nebo složek `_posts` ( pomocí `{{ include_relative }}`).
Konkrétně by tedy nedosáhl například na `menu.html` ani `breadcrumb.html`.

Poznámka 2: Protože byl `includes_dir` překonfigurován, je třeba includovat soubory s plnou cestou z kořene webové aplikace.
Např. pokud chceme includovat soubor `/_includes/header.html`, místo standardního `{{ include header.html }}`
je třeba uvést plnou cestu `{{ include _includes/header.html }}`.
