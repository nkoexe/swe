### Erstellen eines neuen Repositorys (Kommando optional. Bei Verwendung der Platform GitLab oder GitHub reicht eine Erklärung wie auf der Webseite vorgegangen wurde)
- Lokales Verzeichnis als Git repo initilaisieren mittels `git init -b main` (`-b` bestimmt den Names des Standardbranches)
- Evtl. existierende Dateinen mit `git add :` und `git commit -m "Commitmessage"` hinzufügen. 
- Neues repo auf Github erstellen (mit dem UI) und die remote repository URL als remote origin des gerade nich lokalen git repos hinzufügen mit `git remote add origin REMOTE-URL`
- changes pushen mit `git push origin main`

Wenn kein lokales repo besteht einfach mit dem Github UI eines erstellen und clonen mit `git clone` und der präferierten Methode (ssh / https).

Ich habe mit zum Bespiel dieses repo dass ich mir mit Nico teile mit `git clone` (und https - ich würde im testat gerne noch eine Frage zu ssh stellen) auf den Rechner geholt.

### Arbeiten mit Arbeitsverzeichnissen

@nico ich bin mir nicht ganz sicher was hier gemeint ist

Man kann mit denen mit git getrackten Verzeichnissen arbeiten wie normalerweise auch, aber sollte sich vor dem Arbeiten mit `git pull` die aktuelle remote Version lokal herstellen und nach dem Arbeiten mit `git add`,`git commit`und `git push` die remote Version um die lokale Version updaten. 

Bespiel:
Nach dem clonen habe ich den Ordner für diese Aufgabe mit `mkdir 02`erstellt, eine Datei hinzugefügt und mit `git add *`getrackt, `git commit -m "test Commit Pia"` durchgeführt und `git push` gemacht. 

### Dateien zur Versionskontrolle hinzufügen
Mit `git add`: entweder `git add dateiname.java`eine einzelne Datei hinzufügen, oder mit `git add .` alle geänderten und neuen Dateien im aktuellen Verzeichnis hinzuzufügen (es gibt auch `git add *`, welches zb.B. .gitignore im Hauptverzeichnis nicht mit "staged").

Alle jetzt mit `git add` in die "stage" phase verschobenen Dateien werden mit `git commit`zu einem commit hinzugefügt, der einen einigartigen identifier und eine Mesage hat. 

### Änderungen rückgängig machen
- zusätzliche Änderungen mit `git commit --amend`: vorherigen commit "wiederholen"

```
$ git commit -m 'Initial commit'
$ git add forgotten_file
$ git commit --amend
```
- unstagen von Dateien: `restore --staged datei.java`, bzw `git reset HEAD datei.java`
- Datei in Ursprungszustand zurücksetzen, so wie sie beim letzten Commit ausgesehen hat `git restore datei.java` 
- `git checkout datei.java` funktioniert auf dateiebene ähnlich wie restore
- mit `git revert` wird ein neuer Commit erstellt, der den angegebenen Commit umkehrt
- hierbei besteht die Gefahr, dass Dateien im Arbeitsverzeichnis überschrieben werden. Änderungen, die während des "revert"-Vorgangs verloren gehen könnten, müssen daher committed oder stashed werden
- Nur Commit rückgängig, Änderungen behalten mit: `git reset --soft HEAD~1` ( es gibt auch --mixed welches auch stagen rückgänig macht, und --hard was alle Änderungen verwirft)


### Änderungen synchronisieren
- mit `git pull` Änderungen vom remote holen
- mit `git pull` Änderungen zum remote laden
- dazwischen Änderungen merken mit `git add .` und
`git commit -m "Meine Änderungen"`

### Verschieben, Löschen und Umbenennen von Dateien und Verzeichnissen
- so wie bei Linux nur mit git davor
- Verschieben: `git mv alter/pfad/datei.txt neuer/pfad/datei_neu.txt`
- Umbennenen `git mv alter_name.txt neuer_name.txt`
- Löschen: `git rm datei.txt`

### Arbeiten mit Branches
- neuer branch mit `git branch neuer-branch`
- zwischen branches wechseln `git checkout anderer-branch` bzw `git switch anderer-branch`
- Kombination: `git checkout -b neuer-branch` bzw mit switch
- lokalen branch pushen mit `git push -u origin neuer-branch`
- zum Hauptbranch wechseln mit `git checkout main`
- Änderungen aus dem anderen Branch holen: `git merge neuer-branch`
- branch löschen lokal ``git branch -d alter-branch``
- löschen remote ``git push origin --delete alter-branch``




### Zusammenführen eines Branches mit dem Hauptentwicklungspfad mit unterschiedlichen Änderungen in derselben Datei (Merge Konflikt)
- `git merge branch-name` ausführen
- Git markiert Konflikte im Code:
```md
<<<<<<< HEAD
eigene Änderungen
=======
Änderungen aus branch-name
>>>>>>> branch-name
```
- Konflikte manuell im Editor lösen und speichern.
- Änderungen als gelöst markieren: `git add file.java`
- Merge abschließen: `git commit`
- Ergebnis pushen: `git push`
