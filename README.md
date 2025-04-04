Hier ist das gleiche Dokument für ein Gradle-Projekt:

---

# Projekt295

Dies ist ein Spring Boot-Projekt namens **Projekt295**, das im Repository [K295Projekt](https://github.com/TristanAckermann/-K295Projekt) gehostet wird. In dieser Anleitung wird beschrieben, wie man das Projekt lokal aufsetzt und ausführt.

## Voraussetzungen

Stelle sicher, dass du die folgenden Voraussetzungen installiert hast:

- **Java 23** oder höher
- **IntelliJ IDEA** (oder eine andere IDE, die Spring Boot-Projekte unterstützt)
- **Gradle** (wird in der Regel durch IntelliJ automatisch unterstützt)
- **Git** (zum Klonen des Repositories)

## 1. Projekt klonen

Klonen Sie das Repository auf deinen lokalen Computer. Öffne eine Konsole und führe den folgenden Befehl aus:

```bash
git clone https://github.com/TristanAckermann/-K295Projekt.git
```

## 2. Projekt in IntelliJ IDEA öffnen

1. Öffne **IntelliJ IDEA**.
2. Wähle **Open** und navigiere zum Ordner, in den du das Repository geklont hast.
3. Öffne das Verzeichnis und lade das Projekt in IntelliJ.

IntelliJ sollte automatisch erkennen, dass es sich um ein Spring Boot-Projekt handelt und alle Abhängigkeiten herunterladen.

## 3. Gradle-Projekt importieren

Wenn IntelliJ das Projekt nicht automatisch als Gradle-Projekt erkennt:

1. Öffne das **Gradle-Tool-Fenster** in IntelliJ (auf der rechten Seite solltest du ein Symbol mit einem kleinen Elefanten sehen).
2. Klicke mit der rechten Maustaste auf das Projekt und wähle **Reimport**. Dies lädt alle Gradle-Abhängigkeiten neu.

## 4. Spring Boot-Anwendung ausführen

Um die Anwendung zu starten, gehe folgendermaßen vor:

1. In IntelliJ, öffne das **Gradle-Tool-Fenster** (auf der rechten Seite solltest du ein Symbol mit einem kleinen Elefanten sehen).
2. Navigiere zu **Tasks** > **application**.
3. Klicke auf **bootRun**, um die Spring Boot-Anwendung zu starten.

IntelliJ startet nun den Spring Boot-Server. Du solltest in der Konsole eine Ausgabe sehen, die darauf hinweist, dass die Anwendung läuft, zum Beispiel:

```bash
Started Project295Application in 5.123 seconds (JVM running for 6.345)
```

## 5. Zugriff auf die Anwendung

Sobald die Anwendung läuft, kannst du auf sie zugreifen, indem du die folgende URL in deinem Browser aufrufst:

```
http://localhost:8080
```

## 6. Weiteres Vorgehen

- **Datenbank:** Falls du eine Datenbankkonfiguration verwendest, stelle sicher, dass du alle nötigen Umgebungsvariablen oder Konfigurationsdateien aktualisierst.
- **Endpoints:** Überprüfe die Endpunkte und API-Routen, die deine Anwendung bereitstellt, um sicherzustellen, dass sie wie erwartet funktionieren.

## Fehlerbehebung

Falls beim Starten des Projekts Probleme auftreten:

1. Stelle sicher, dass alle Gradle-Abhängigkeiten erfolgreich heruntergeladen wurden.
2. Überprüfe die Konsolenausgabe auf Fehler.
3. Stelle sicher, dass keine anderen Anwendungen bereits den Port `8080` verwenden.

## Weitere Informationen

Für detaillierte Informationen zu Spring Boot und wie man es verwendet, siehe die [Spring Boot Dokumentation](https://spring.io/projects/spring-boot).

---

Viel Erfolg bei der Verwendung von **Projekt295**! Wenn du Fragen hast, zögere nicht, das Repository zu besuchen oder ein Issue zu eröffnen.


