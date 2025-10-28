### Erstellen eines neuen Repositorys (Kommando optional. Bei Verwendung der Platform GitLab oder GitHub reicht eine Erklärung wie auf der Webseite vorgegangen wurde)

- Lokales Verzeichnis als Git repo initilaisieren mittels `git init -b main` (`-b` bestimmt den Names des Standardbranches)
- Evtl. existierende Dateinen mit `git add *` und `git commit -m "Commitmessage"` hinzufügen. 
- Neues repo auf Github erstellen (mit dem UI) und die remote repository URL als remote origin des gerade nich lokalen git repos hinzufügen mit `git remote add origin REMOTE-URL`
- changes pushen mit `git push origin main`

Wenn kein lokales repo besteht einfach mit dem Github UI eines erstellen und clonen mit `git clone` und der präferierten Methode (ssh / http).

Ich habe mit zum Bespiel dieses repo dass ich mir mit Nico teile mit `git clone` auf den Rechner geholt.

### Arbeiten mit Arbeitsverzeichnissen

@nico ich bin mir nicht ganz sicher was hier gemeint ist

Man kann mit denen mit git getrackten Verzeichnissen arbeiten wie normalerweise auch, aber sollte sich vor dem Arbeiten mit `git pull` die aktuelle remote Version lokal herstellen und nach dem Arbeiten mit `git add`,`git commit`und `git push` die remote Version um die lokale Version updaten. 

Bespiel:
Nach dem clonen habe ich den Ordner für diese

### Dateien zur Versionskontrolle hinzufügen

### Änderungen rückgängig machen

### Änderungen synchronisieren

### Verschieben, Löschen und Umbenennen von Dateien und Verzeichnissen

### Arbeiten mit Branches

### Zusammenführen eines Branches mit dem Hauptentwicklungspfad mit unterschiedlichen Änderungen in derselben Datei (Merge Konflikt)