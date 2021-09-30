Nepovinný úkol - Seznam obrázků
-----------------

### Seznam obrázků profesorů / bezdomovců

Vytvořte jednoduchou webovou aplikaci zobrazující seznam obrázků profesorů / bezdomovců podobně, jako jsou na stránce <http://proforhobo.com> (bez formulářových prvků). Pro její vytvoření můžete použít obrázky, které najdete ve složce `podklady/Bezdomovci` v archivu čtvrté lekce.

K vykreslení obrázků můžete použít některý z následujících postupů:
* vytvoření seznamu názvů obrázků bez přípon ("man1", "man2", .., "man3") v controlleru a následné sestavení plné cesty k obrázku v šabloně
* vytvoření seznamu čísel od 1 do 8 v controlleru a následné sestavení plné cesty i s názvem obrázku v šabloně
* dynamické načtení seznamu názvů všech obrázků z konkrétní složky, například 'static/images/obliceje', v controlleru a následné sestavení plné cesty k obrázku v šabloně, a to pomocí následující nápovědy:

```java
...
ResourcePatternResolver prohledavacSlozek = new PathMatchingResourcePatternResolver();
List<Resource> resources = Arrays.asList(
        prohledavacSlozek.getResources("classpath:/static/images/obliceje/*"));	
...
```

U třetí možnosti záměrně neuvádím kompletní řešení, aby to nebylo tak jednoduché :). Na lekci si pak toto třetí řešení ukážeme.

### Odevzdání domácího úkolu

Nejprve appku/appky zbavte přeložených spustitelných souborů.
Zařídíte to tak, že v IntelliJ IDEA vpravo zvolíte
Maven Projects -> Lifecycle -> Clean.
Úspěch se projeví tak, že v projektové složce zmizí
podsložka `target`.
Následně složku s projektem
zabalte pomocí 7-Zipu pod jménem `Ukol-CISLO-Vase_Jmeno.7z`.
(Případně lze použít prostý zip, například na Macu).
Takto vytvořený archív nahrajte na Google Drive do Odevzdávárny.

Vytvořte snímek obrazovky spuštěného programu (webové stránky) a vložte jej
do galerie `Ukol CISLO` ve skupině našeho kurzu na Facebooku.

Pokud byste chtěli odevzdat revizi úkolu (např. po opravě),
zabalte ji a nahrajte ji na stejný Google Drive znovu,
jen tentokrát se jménem `Ukol-CISLO-Vase_Jmeno-verze2.7z`.

Termín odevzdání je v neděli před další lekcí, nejpozději 23:59.
Pokud úkol nebo revizi odevzdáte později,
prosím pošlete svému opravujícímu kouči/lektorovi email nebo zprávu přes FB.
