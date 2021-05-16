---
---
Automatizované testování - Lekce 5
----------------------------------

V poslední, páté lekci se podíváme na domácí úkol, sémantické metody a jako bonus - návrhový vzor Page Object.


### Prezentace

[Online](https://drive.google.com/file/d/1JR7-UoojCenqvvBuydg4ldJQf_JzGFfP/view?usp=sharing)



### Špeky

*   [ScreenshotOnFail](/data/2021-jaro/da-java-brno/ScreenshotOnFail.java)
*   [XPathClassNameCondition](/data/2021-jaro/da-java-brno/XPathClassNameCondition.java)



### Příklady pro tento workshop

Archív je zde:
[Java-Training--Projects--DA-Testovani-8.zip](/data/2021-jaro/da-java-brno/Java-Training--Projects--DA-Testovani-8.zip)


Příklady si rozbalte do:

<table class="column-1-right-align">
    <tr>
        <td>Windows</td>
        <td>C:\Java-Training\Projects\DA-Testovani</td>
    </tr>
    <tr>
        <td>macOS</td>
        <td>/Users/<i>YOUR_USERNAME</i>/Java-Training/Projects/DA-Testovani</td>
    </tr>
    <tr>
        <td>Linux</td>
        <td>/home/<i>YOUR_USERNAME</i>/Java-Training/Projects/DA-Testovani</td>
    </tr>
</table>


Pokud jste archív rozbalili správně, měli byste tyto složky:

#### Windows

<ul class="filesystem-tree">
    <li>C:</li>
    <ul>
        <li>Java-Training</li>
        <ul>
            <li>Projects</li>
            <ul>
                <li>DA-Testovani</li>
                <ul>
                    <li>Java-Automatizace-5</li>
                    <ul>
                        <li>10-Editace_prihlasky</li>
                        <li>...</li>
                    </ul>
                </ul>
            </ul>
        </ul>
    </ul>
</ul>


#### macOS

<ul class="filesystem-tree">
    <li>/</li>
    <ul>
        <li>Users</li>
        <ul>
            <li><i>YOUR_USERNAME</i></li>
            <ul>
                <li>Java-Training</li>
                <ul>
                    <li>Projects</li>
                    <ul>
                        <li>DA-Testovani</li>
                        <ul>
                            <li>Java-Automatizace-5</li>
                            <ul>
                                <li>10-Editace_prihlasky</li>
                                <li>...</li>
                            </ul>
                        </ul>
                    </ul>
                </ul>
            </ul>
        </ul>
    </ul>
</ul>


#### Linux

<ul class="filesystem-tree">
    <li>/</li>
    <ul>
        <li>home</li>
        <ul>
            <li><i>YOUR_USERNAME</i></li>
            <ul>
                <li>Java-Training</li>
                <ul>
                    <li>Projects</li>
                    <ul>
                        <li>DA-Testovani</li>
                        <ul>
                            <li>Java-Automatizace-5</li>
                            <ul>
                                <li>10-Editace_prihlasky</li>
                                <li>...</li>
                            </ul>
                        </ul>
                    </ul>
                </ul>
            </ul>
        </ul>
    </ul>
</ul>



### Úkoly

*   Opravte testy ze svého domácího úkolu, aby bežely proti webappce:<br/>
    https://cz-test-dva.herokuapp.com/

    Vylepšete svůj úkol tak, aby se dala změnit bázová adresa webappky na jednom místě programu.
    Inspirujte se v demo řešení úkolu a udělejte to pomocí konstanty.

    Poznámka:
    *   Pokud nechcete nebo nemůžete použít svůj domácí úkol, použijte můj.
    *   Pokud nechcete ani nemůžete použít ani můj úkol (například proto, že jste domácí úkol zatím nestihli udělat),
        proveďte úpravy nad projektem `10-Editace_prihlasky`.


*   Webappka `cz-test-dva` obsahuje sémantické třídy v HTML začínající `qa-`.
    Upravte svůj domácí úkol, aby také využíval sémantické třídy v HTML (`qa-*`)
    místo dosavadních křehkých XPath zacílených na pozici elementu nebo jeho text.

    Poznámka: Platí stejné pravidlo ohledně domácího úkolu, jako výše.


*   Upravte scenář vytváření přihlášky z vašeho domácího úkolu tak,
    aby se pokaždé vytvořila pro dítě s unikátním jménem.

    Ideální je pro to použít časové razítko, dostatečně velké náhodné číslo nebo kombinaci obojího.


*   Opravte testy ze svého domácího úkolu, aby používaly sémantické metody (tzv. "stepy")
    a teprve tyto sémantické metody budou používat Selenium.


### Další scénáře

Pokud vše budete mít hotové, můžete zkusit tvořit další scénáře.

#### Login

1. Rodič, přihlášený do aplikace, se musí být schopen odhlásit.
2. Rodič si musí být schopen nechat zaslat zapomenuté heslo.
3. Neplatný email při zapomenutém hesle musí být zkontrolován a ohlášen jako chyba.
4. Prázdný email při zapomenutém hesle musí být zkontrolován a ohlášen jako chyba.

#### Přihlášky na kurz

0. (Z domácího úkolu) Rodič s existujícím účtem musí být schopen přihlásit svoje dítě na kurz.
1. Rodič musí být schopen zobrazit detail přihlášky.
2. Rodič musí být schopen upravit existující přihlášku ze seznamu přihlášek.
3. Rodič musí být schopen upravit existující přihlášku z detailu přihlášky.
4. Rodič musí být schopen zrušit existující přihlášku ze seznamu přihlášek.
5. Rodič musí být schopen zrušit existující přihlášku z detailu přihlášky.
6. Rodič nesmí být schopen upravit zrušenou přihlášku ze seznamu přihlášek.
7. Rodič nesmí být schopen upravit zrušenou přihlášku z detailu přihlášky.
8. Rodič nesmí být schopen upravit zrušenou přihlášku přímým přístupem na adresu upravovací stránky.
