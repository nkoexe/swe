/**
 * Example for Common Coupling (Steuerkopplung)
 * 
 * Dies zeigt Steuerkopplung, da beide Module (ModuleA und ModuleB)
 * auf denselben globalen Datenbereich (GlobalData.counter) zugreifen.
 */

// Zentraler globaler Zustand
class GlobalData {
    public static int counter = 0;
}

// Direkter Zugriff auf globalen Zustand ohne Kapselung
class ModuleA {
    public void increment() {
        // Ändert globalen Zustand, andere Module werden implizit beeinflusst
        GlobalData.counter++;
    }
}

class ModuleB {
    public void print() {
        System.out.println("Moin from ModuleB");
        // Liest globalen Zustand
        System.out.println("Counter = " + GlobalData.counter);
    }
}

public class Common {
    public static void main(String[] args) {
        ModuleA a = new ModuleA();
        ModuleB b = new ModuleB();

        // Kopplungsproblem: ModuleB's Verhalten hängt von ModuleA ab
        a.increment();
        b.print();
    }
}
