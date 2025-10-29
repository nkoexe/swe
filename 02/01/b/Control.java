/*
 * Example for Steuerkopplung (Control Coupling)
 * 
 * Steuerkopplung liegt vor, wenn ein Modul das Verhalten eines anderen
 * durch die Übergabe von Steuerinformationen (z. B. eines Flags oder Moduswerts)
 * beeinflusst. Hier bestimmt der Aufrufer, ob TaskHandler im "detailed" oder
 * im "simple" Modus ausgeführt wird.
 */

class TaskHandler {
    // Behavior changes depending on external control flag
    public void executeTask(boolean detailedMode) {
        if (detailedMode) {
            System.out.println("Running in detailed mode...");
        } else {
            System.out.println("Running in simple mode...");
        }
    }
}

public class Control {
    public static void main(String[] args) {
        TaskHandler handler = new TaskHandler();
        // control flag determines behavior
        handler.executeTask(true);
        handler.executeTask(false);
    }
}