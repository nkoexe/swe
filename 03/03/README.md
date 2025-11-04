# Continuous Integration Pipeline

https://github.com/nkoexe/swe/actions

## Source Code

Im Folder `src/`
Einfache addition und factorial Funktionen, nur zur Demo.
Eine Main Datei ist da, aber wird nicht für Tests benutzt.

Tests sind im Folder `tests/`
Insgesamt 13 Tests, 1 Test wird absichtlich fehlschlagen (wegen `0.1 + 0.2 != 0.3`, Problem mit floating-point precision)

## CI Configuration

Platform: GitHub Actions
Konfigurationsdatei: `/.github/workflows/assignment03.yml`
Läuft nur bei push auf den main branch

### Schritte:

* Setzt Variablen `COMPILE_OUTPUT` und `TEST_OUTPUT`, um Output zu speichern
* Nimmt den 'pushed' Code aus dem Repository
* Richtet Java environment ein
* Kompiliert den Code in den Folder `bin/`
  * Output geht in `$COMPILE_OUTPUT`
* Führt die Tests aus
  * Output geht in `$TEST_OUTPUT`
* Prüft, ob die letzte Zeile von `$TEST_OUTPUT` "Failed: 0" enthält
  * wenn true: alle Tests passed, zeigt success message im `$GITHUB_STEP_SUMMARY`
  * wenn false: zeigt Failure Message und die Test Outputs

