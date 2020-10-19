---
display_full: false
---
Git - Instalační instrukce
---------------------------------------------------

Před lekcí (17.10.2020) prosím nainstalujte a připravte si následující:

* Naintalujte IntelliJ IDEA (postupujte dle instrukcí https://javainstall.czechitas.cz/2020-jaro/community/).
* Založte si účet na [https://github.com/join](https://github.com/join)
* Nainstalujte si Git (viz. níže)

Instalačku Gitu naleznete na https://git-scm.com/downloads.
Tato stránka obsahuje instalační media a instrukce pro Windows, MacOS a Linux.

Níže naleznete instalační postup pro všechny tyto platformy.

### Windows 

1\. Stahněte instalaci Gitu z https://git-scm.com/downloads:
  
<img alt="Git Windows Instalace - Stránka s downloadem" src="img/git_windows_wizard_2020-10-11_18-46-24.png" width="500px"/>

<img alt="Git Windows Instalace - Stránka s downloadem pro Windows" src="img/git_windows_wizard_2020-10-11_19-45-55.png" width="500px"/>

2\. Po stažení spusťte instalaci:

<img alt="Git Windows Instalace - Edge Run Download" src="img/git_windows_wizard_2020-10-11_19-46-06.png" width="500px"/>

<img alt="Git Windows Instalace - Windows kontrola práv" src="img/git_windows_wizard_2020-10-11_19-46-41.png" width="500px"/>

3\. Jedná se o běžný instalační wizard. Postupně jej projdětě dle níže uvedených obrázků
 
<img alt="Git Windows Instalace - EULA" src="img/git_windows_wizard_2020-10-11_19-47-00.png" width="500px"/>

<img alt="Git Windows Instalace - Installation Destination " src="img/git_windows_wizard_2020-10-11_19-47-15.png" width="500px"/>

<img alt="Git Windows Instalace - Výběr komponent" src="img/git_windows_wizard_2020-10-11_19-47-31.png" width="500px"/>

<img alt="Git Windows Instalace - Start menu" src="img/git_windows_wizard_2020-10-11_19-47-44.png" width="500px"/>

<img alt="Git Windows Instalace - Editor" src="img/git_windows_wizard_2020-10-11_19-47-59.png" width="500px"/>

<img alt="Git Windows Instalace - Path" src="img/git_windows_wizard_2020-10-11_19-48-18.png" width="500px"/>

<img alt="Git Windows Instalace - OpenSSL" src="img/git_windows_wizard_2020-10-11_19-48-27.png" width="500px"/>

<img alt="Git Windows Instalace - LineEndings" src="img/git_windows_wizard_2020-10-11_19-48-37.png" width="500px"/>

<img alt="Git Windows Instalace - TTY" src="img/git_windows_wizard_2020-10-11_19-48-47.png" width="500px"/>

<img alt="Git Windows Instalace - Git Pull" src="img/git_windows_wizard_2020-10-11_19-48-56.png" width="500px"/>

<img alt="Git Windows Instalace - Credential manager" src="img/git_windows_wizard_2020-10-11_19-49-05.png" width="500px"/>

<img alt="Git Windows Instalace - Caching" src="img/git_windows_wizard_2020-10-11_19-49-16.png" width="500px"/>

<img alt="Git Windows Instalace - " src="img/git_windows_wizard_2020-10-11_19-49-29.png" width="500px"/>

<img alt="Git Windows Instalace - " src="img/git_windows_wizard_2020-10-11_19-51-27.png" width="500px"/>

**Po instalaci**

Po úspěšné instalaci by jste měli mít nově v kontektuálním menu (pravé tlačko myši - ve složce) dvě nové položky:

* Git GUI
* Git Bash 

<img alt="Git Windows Instalace - " src="img/git_windows_wizard_2020-10-11_19-52-17.png" />

### MacOS

Postupujte dle instrukcí na [https://git-scm.com/download/mac](https://git-scm.com/download/mac)

1. Nainstalujte [homebrew](https://brew.sh/)
2. Nainstalujte Git

Měly by tedy stačit následující příkazy:
 
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)" 
brew install git
```

### Linux

Postupujte dle [https://git-scm.com/download/linux](https://git-scm.com/download/linux).
Příkaz pro instalaci se dle distribuce může lišit.
Nejčastěji by měl vyhovovat příkaz pro Debian/Ubuntu distribuce:

```
sudo apt-get install git
```
