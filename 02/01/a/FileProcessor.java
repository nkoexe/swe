package a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    /**
     * Example for Sequential Cohesion (Sequenzielle Bindung)
     */

    // Sequenzielle Bindung: Die Ausgabe einer Methode ist die Eingabe der nächsten
    // Der Ablauf: openFile() -> readContent() -> closeFile()
    // Jede Methode nutzt das Ergebnis der vorherigen

    private BufferedReader reader = null;
    private String content = null;

    // 1. Open the file
    public void openFile(String filename) throws IOException {
        this.reader = new BufferedReader(new FileReader(filename));
    }

    // 2. Read content using the reader from openFile()
    public void readContent() throws IOException {
        if (this.reader == null) {
            throw new IOException("Reader is not initialized.");
        }

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = this.reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        this.content = sb.toString();
    }

    // 3. Close the reader
    public void closeFile() throws IOException {
        if (this.reader != null) {
            this.reader.close();
        }
    }

    // Helper method to get the stored content
    public String getContent() {
        return this.content;
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        try {
            processor.openFile("Entity.java");
            processor.readContent();
            processor.closeFile();

            String content = processor.getContent();
            System.out.println(content);

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
