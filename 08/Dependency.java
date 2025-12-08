class Fischer {
    public void angeln(){};
}

// High-Level Klasse hängt direkt von konkreter Implementierung ab
class BootBesetzung{
    Fischer fischer1;
    Fischer fischer2;

    public void stechInSee(){
        fischer1.angeln();
        fischer2.angeln();
    };
}

// FIX

interface Person {
    public void handeln();
}

class FischerNeu implements Person{
    public void handeln(){
        System.out.println("Ich fische");
    }
}

class BootBesetzung2{
    Person person1;
    Person person2;

    public void stechInSee(){
        person1.handeln();
        person2.handeln();
    };
}
