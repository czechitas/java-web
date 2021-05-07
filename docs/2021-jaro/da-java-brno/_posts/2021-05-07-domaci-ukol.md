---
---
Automatické testy - Domácí úkol
-------------------------------

Po třetí lekci následuje domácí úkol: <br/>
Bude třeba napsat několik automatizovaných testů reálné aplikace,
se kterou jste se už setkali: <br/>
<https://cz-test-jedna.herokuapp.com/>



### Zadání

Vytvořte automatizované testy:

1.  Rodič s existujícím účtem se může přihlásit do webové aplikace.

    Poznámka: Nepište automatizovaný test na zakládání nového účtu rodiče.
    Účet si připravte dopředu ručně nebo použijte svůj již existující z kurzu manuálního testování.


2.  Rodič s existujícím účtem může přihlásit svoje dítě na kurz tak,
    že nejprve vybere kurz a potom se přihlásí ke svému účtu.


3.  Rodič s existujícím účtem může přihlásit svoje dítě na kurz tak,
    že se nejprve přihlásí ke svému účtu a potom vybere kurz.


4.  Jeden další scénář dle své úvahy.



### Výchozí projekt

V reálném světě se jen zřídka zakládá nový projekt od začátku.
Většinou se postupuje tak, že se zkopíruje už existující,
dobře nakonfigurovaný projekt z minula,
přejmenuje se,
"vykostí se"
(smažou se nadbytečné javové třídy a metody)
a může se programovat.

Postupujte takto:
1.  Ve správci souborů (File Explorer, Finder, Total Commander, ...)
    zkopírujte složku existujícího projektu ze třetí lekce.
    Může to být například `10-JUnit_demo`.


2.  Otevřete kopii projektu v IntelliJ IDEA a opravte v něm v souboru `pom.xml`
    text v elementu `<artifactId>` z `junit-demo` na `domaci-ukol-jmeno-prijmeni`.


3.  Po změně aktivujte vpravo nahoře v IntelliJ IDEA malou bublinku Mavenu pro občerstvení konfigurace.

    ![Refresh Maven](img/maven-refresh.png)


4.  Přejmenujte třídu `TestyTabulek` na `TestyPrihlasovaniNaKurzy`.

    Buď můžete přepsat název třídy a v souladu s tím přejmenovat soubor,
    ale jednodušší je na soubor v levém stromě `Projekt` v IntelliJ IDEA
    kliknout pravým tlačítkem a zvolit `Refactor` -> `Rename`.


### Odevzdání

Termín odevzdání je **čtvrtek 13. 5. 23:59**.

Preferovaný způsob odevzdání je takový, že založíte repository na Githubu
a projekt tam nahrajete (*push*).
V IntelliJ IDEA to jde dokonce udělat téměř na jeden klik:
`Menu` -> `Git` -> `Github` -> `Share project on Github`.

Každou změnu v projektu je potom vždy potřeba nástrojem Git na vašem počítači commitnout
a pushnout opět na Github.
Adresu repository na Githubu vložte do `moje.czechitas.cz` při odevzdávání úkolu.


Pokud se na Github necítíte (což by byla škoda), lze alternativně nahrát zip projektu
na Google Drive a odkaz na soubor vložit do `moje.czechitas.cz` při odevzdávání úkolu.
Před zazipováním je ale nutné projekt zbavit přeložených souborů
se strojovým kódem, protože posílání strojového kódu mohou antivirové programy
nebo Google Drive vyhodnotit jako riziko a zablokovat to.
Provedete to tak, že v IntelliJ IDEA vpravo zvolíte
`Maven` -> `domaci-ukol-jmeno-prijemni` -> `Lifecycle` -> `Clean`.
Úspěch se projeví tak, že v projektové složce zmizí
podsložka `target`.
Následně složku s projektem
zabalte pomocí 7-Zipu (nebo jiného zipu) pod jménem `Automatizované-testy-ukol-Vase_Jmeno.zip`.
