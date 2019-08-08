# Letní Škola 2018 - JavaScript

Podklady pro druhou polovinu dne výuky JavaScriptu.

Level 1 - Umístění panáčka
==========================

Umísti panáčka na pevnou pozici 400, 300 pixelů na obrazovce.

Tyto příkazy jsou povinné:
~~~
var objektPanacek;
var panacekX;
var panacekY;
var panacekSirka;
var panacekVyska;

objektPanacek = document.querySelector("#panacek");
panacekSirka = 64;
panacekVyska = 70;
~~~


Dále můžeš použít následující příkazy (ne nutně v tomto pořadí, musíš trochu přemýšlet):
~~~
objektPanacek.style.left = panacekX + "px";
~~~

~~~
panacekX = 400;
~~~

~~~
objektPanacek.style.top = panacekY + "px";
~~~

~~~
panacekY = 300;
~~~



Level 2 - Pohyb panáčka
=======================
Naprogramuj pohyb panáčka po obrazovce při stisku klávesy.

Všechny příkazy v tomto levelu budeš psát do funkce `priStiskuKlavesy()`,
proto ji musíš v programu nadefinovat:

~~~
function priStiskuKlavesy(klavesa) {

    alert("Klávesa stisknuta");

    // Sem muzes vlozit prikazy ze seznamu (2)

}
~~~

Dále je nutné tuto funkcni nastavit v HTML, aby se vyvolávala:

Původní kousek HTML:
~~~
<body>
~~~

Nový kousek HTML:
~~~
<body onkeydown="priStiskuKlavesy(event);">
~~~


Zpět v JavaScriptu je ve fuknci potřeba naprogramovat,
co se má stát při stisku.
Můžeš použít příkazy ze seznamu (2):

~~~
objektPanacek.style.left = panacekX + "px";
~~~

~~~
objektPanacek.style.top = panacekY + "px";
~~~

~~~
panacekX = panacekX + 10;
~~~

~~~
panacekX = panacekX - 10;
~~~

~~~
panacekY = panacekY + 10;
~~~

~~~
panacekY = panacekY - 10;
~~~

~~~
if (klavesa.key === "ArrowRight") {

    // Sem muzes vlozit kterekoliv prikazy
    // ze seznamu (2).
    // Prikazy zde se provedou pouze,
    // pokud byla stisknuta
    // SIPKA VPRAVO

}
~~~

~~~
if (klavesa.key === "ArrowLeft") {

    // Sem muzes vlozit kterekoliv prikazy
    // ze seznamu (2).
    // Prikazy zde se provedou pouze,
    // pokud byla stisknuta
    // SIPKA VLEVO

}
~~~

~~~
if (klavesa.key === "ArrowUp") {

    // Sem muzes vlozit kterekoliv prikazy
    // ze seznamu (2).
    // Prikazy zde se provedou pouze,
    // pokud byla stisknuta
    // SIPKA NAHORU

}
~~~

~~~
if (klavesa.key === "ArrowDown") {

    // Sem muzes vlozit kterekoliv prikazy
    // ze seznamu (2).
    // Prikazy zde se provedou pouze,
    // pokud byla stisknuta
    // SIPKA DOLU

}
~~~



Level 3 - Přidej minci
======================

Přidej minci do HTML do `<body>`.

~~~
<!-- předmět k sebrání, id="mince" -->
<img id="mince" src="obrazky/mince.png">
~~~

V JavaScriptu ji ulož do proměnné:

~~~
var objektMince;
var minceX;
var minceY;
var minceSirka;
var minceVyska;

objektMince = document.querySelector("#mince");
minceSirka = 32;
minceVyska = 32;
~~~


Nastav minci buď na pevnou nebo na náhodnou pozici.
Budou se ti hodit tyto příkazy:

~~~
minceX = 200;
~~~
~~~
minceX = Math.floor(Math.random() * (document.documentElement.clientWidth - minceSirka));
~~~
~~~
minceY = Math.floor(Math.random() * (document.documentElement.clientHeight - minceVyska));
~~~
~~~
minceX = 100;
~~~
~~~
objektMince.style.left = minceX + "px";
~~~
~~~
objektMince.style.top = minceY + "px";
~~~


Level 4 - Umožni sbírání mincí
==============================

Pro sebrání mince je nutno testovat střet objektu panáčka a objektu mince.

~~~
// zjistíme, zda docháí ke kolizi mimozemšťana a objektMince
// tj. zda se překrývají dva obdélníky o známých souřadnicích
if (!(panacekX + panacekSirka < minceX ||
      minceX + minceSirka < panacekX ||
      panacekY + panacekVyska < minceY ||
      minceY + minceVyska < panacekY)) {

    // Sem vloz prikazy, ktere se maji provest
    // pri stretu panacka a mince
    // Napr. posun minci na jine nehodne misto
    // Zvetsi pocetSkore o 1.

}
~~~

Pokud chceš přidat do stránky skóre, doplň do HTML tyto značky:

~~~
<p class="vysledek">Skóre: <span id="skore">0</span></p>
~~~

Ve svém kódu potom můžeš pomocí document.querySelector vybrat prvek s id="skore" a měnit jeho textový obsah podle toho, kolik mincí panáček sebral.


Level 5 - Změna obrázků panáčka při pohybu
==========================================

Když jde panáček doprava, nastav mu obrázek `obrazky/panacek-vpravo.png`,
když jde doleva, nastav mu `obrazky/panacek-vlevo.png`, a podobně
nahoru a dolů.

Panáčkovi nastavíš obrázek nasledujícím příkazem:
~~~
objektPanacek.src = "obrazky/panacek-vpravo.png";
~~~


Level 6 - Přehrávej zvuky při sbírání mince
===========================================

Doplň do hry zvuky. Např. cinknutí mince, když ji panáček sebere.

Nejprve musíš přidat do HTML značku pro vybraný zvuk:

~~~
<audio id="zvukmince" src="zvuky/mince.wav"></audio>
~~~

Zvuk pak v JavaScriptu vyhledáš na stránce pomocí document.querySelector a uložíš si ho např. do proměnné objektZvuk, stejně jako jsi to dělala s panáčkem, mincí nebo skóre. K přehrání zvuku pak můžeš použít následující příkaz:

~~~
objektZvuk.play();
~~~


Level 7 - Omezení pohybu panáčka
================================

Panáček se nyní může posunout mimo hranice herní plochy a vyjít ven z obrazovky. Přidej do hry kód, který v tom panáčkovi zabrání.

Šířku a výšku okna prohlížeče zjistíš pomocí:

~~~
var sirkaOkna;
var vyskaOkna;

sirkaOkna = window.innerWidth;
vyskaOkna = window.innerHeight;
~~~

Level 8 - Přidej nepřátelskou postavičku
========================================

Ve složce obrázky máš i spoustu obrázků možných nepřátel. Přidej do stránky jeden z nich a dopiš program tak, aby se nepřítel sám pohyboval. Obrázku s nepřítelem přidej id="nepritel". Umíš zjistit i srážku nepřítele s panáčkem? Inspiruj se kódem pro srážku panáčka s mincí.

