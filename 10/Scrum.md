# a) Typischer Ablauf eines Scrum Projekts

## 1. Product Backlog (Grooming)
- Startpunkt: Produkt Backlog 
- Priorisierte Liste aller Anforderungen in Form von "Backlog Items" 
- (Der Product Owner ist für die Erstellung und fortlaufende Pflege verantwortlich. Die Einträge im Product Backlog werden als User Stories formuliert und nach ihrem Geschäftswert priorisiert.)

## Sprint Zyklus
 Festgelegte Zeitspanne von typischerweise 2-4 Wochen, in der ein potenziell auslieferbares Produktinkrement erstellt wird
### 2. Sprint Planning (max. 8h)
- Zu Beginn jedes Sprints findet die Planung desselben statt, in dem das Scrum-Team:    
    - Das Sprint Goal definiert
    - Entsprechende Items (zu erfüllende Anforderungen) aus  dem Product Backlog auswählt -> Sprint Backlog
    - Und damit einen umsetztbaren Plan für die Arbeit im Sprint erstellt
    - Ziel des Sprints ist die Erarbeitung eines "Increments" - eine iterative Verbesserung des zu erarbeitenden Produkts

### 3. Sprint 
- Sprints sind Kern der Scrum-Arbeitsweise, während der Sprints
    - Arbeitet das Team an den Sprint Backlog Items
    - Daily Scrum (tägliche Meetings von max. 15 Min.), bei dem Entwickler den Fortschritt inspizieren und den Plan anpassen

### 4. Increment (Produktinkrement)
- Am Ende jedes Sprints entsteht ein oder mehrere Increments (potenziell auslieferbare Produktbestandteile) die:
    - Der Definition of Done entsprechen (es wird vorher festgelegt, wann ein Increment als "fertig" gilt)
    - Additiv zu allen vorherigen Increments sind

### 5. Sprint Review (max. 4 Stunden)
- Das Team präsentiert das fertige Increment und holt Feedback von Stakeholdern ein.

### 6. Sprint Retrospective (max. 3 Stunden)

Das Team reflektiert über den abgelaufenen Sprint und identifiziert Verbesserungsmöglichkeiten für den nächsten Sprint.

### Danach beginnt der Zyklus von vorne

Scerum ist ein Iterativer Prozess, nach der Retrospektive und erneutem Grooming des Product Backlogs wird ein weiterer Sprint geplant und ausgeführt, um ein weiteres Increment zu erarbeiten. Dieser Zyklus wiederholt sich, bis das Produkt fertiggestellt ist oder das Projekt aus anderen Gründen beendet wird. Mit jedem Sprint wächst das Produkt inkrementell, und das Product Backlog wird kontinuierlich angepasst (basierend auf gewonnenen Erkenntnissen und sich ändernden Anforderungen).

# b) Wodurch und an welchen Stellen Scrum genügt dem Wertesystem, welches die Agile Alliance herausgearbeitet hat

Das „Agile Manifesto“:
1. Individuals and interactions over processes and tools
    - Wird erfüllt, da keine konkreten Entwicklungsprozesse im Fokus stehen, sonder die Zusammenarbeit im Team durch Scrum definiert wird
    - Sprint Retrospektive gibt dem Team Raum, über ihre Zusammenarbeit zu reflektieren und Verbesserungen anzustoßen
    - Keine Hierarchien
2. Working software comprehensive over 
documentation
    - Wird erfüllt, da das Ziel immer ein "Done"/lauffähiges Inkrement des Gesamtprodukts und keine ausführlich Dokumentiertes Feature ist 
3. Customer collaboration over contract negotiation
    - Wird erfüllt, da nach jedem Sprint mit den Stakeholden kollaboriert wird, und der Vetrag nicht nur ein mal ausgehandelt wird
4.  Responding to change over following a plan
    - Es wird zwar einen Plan für den jeweiligen Sprint gefolgt, aber da die SPrints sehr kurz sind ist die Anpassung an veränderungen in nächsten SPrint leicht möglich
    - Auch mittels des Daily Sprints sind Plananpassungen möglich

# c) In der Vorlesung haben Sie 15 Best Practices bei agiler Software Entwicklung kennengelernt. Welche davon unterstützt Scrum automatisch? Wodurch werden diese unterstützt?

- Entwickle iterativ: JA, Sprints
- Modelliere graphisch
-  Überwache Erfüllung der Anforderungen: JA, Product Backlog
-  Verfolge Änderungen
-  Schließe jeden Schritt mit Qualitätsprüfung ab: JA, Sprint Review
-  Verwende eine komponentenbasierte Version
-  Entwickle nur was zur Lösung notwendig ist: JA, Product Backlog,  kurze Sprints mit Imkrement-Ziel
-  Konzentriere Dich auf die wesentlichen Ergebnisse und weniger darauf, wie 
sie erzielt werden: Implizit, kurze Sprints mit Imkrement-Ziel
-  Vermeide unnötige Dokumente
-  Passe Dich an den Entwicklungsstand an: JA, Nach jedem Sprint Review kann das Product Backlog basierend auf neuen Erkenntnissen angepasst werden
-  Lerne von Fehlern: JA, Sprint Retrospektive
-  Überprüfe regelmäßig die Risiken des Projektes: Können nbesprochen werden, aber nicht explizit
-  Entwickle objektivierbare Kriterien zur Messung des Projektfortschrittes: JA, "Definition of Done"
-  Versuche Routinearbeit zu automatisieren
-  Arbeite nach Plan: JA, Sprintplan

# d) Erklären Sie die Begriffe Product Backlog, Burndown Chart sowie Definition of Done und erklären Sie, wie diese in Scrum zum Einsatz kommen.

## Product Backlog

- priorisierte Liste aller bekannten Anforderungen ie für das Produkt gewünscht oder notwendig sind
- zentrale Dokument, das beschreibt, was am Produkt noch zu tun ist
- dynamisch, verändert sich, wenn neue Anforderungen hinzukommen, Prioritäten verschieben oder Items aufgrund neuer Erkenntnisse überflüssig werden
- nach Geschäftswert priorisiert
- Einsatz: Product Owner pflegt es, Items werden in Sprints vom Entwicklungsteam abgearbeitet, dynamische Änderung nach SPrint Review/Retrospektive

## Burndown Chart
- graphisches Diagramm, das den verbleibenden Arbeitsaufwand über die Zeit darstellt
- visualisiert, wie viel Arbeit noch zu erledigen ist und wie schnell das Team arbeitet (Arbeitsaufwand, gemessen in Story Points, Stunden oder Anzahl offener Aufgaben)
- Einsatz: Hilft dem Team bei der Fortschrittvisualisierung

## Definition of Done (DoD)
- formale, vom Team vereinbarte Liste von Kriterien, die erfüllt sein müssen, damit ein Produktinkrement als "fertig" gilt
- definiert einen gemeinsamen Qualitätsstandard
- Einsatz: wird zu Projektbeginn vom Entwicklungsteam gemeinsam definiert und bei Bedarf in der Sprint Retrospektive überarbeitet
- wird im Sprint Review genutzt um Produktqualität zu prüfen