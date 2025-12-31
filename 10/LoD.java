class Hund {
    private String name;

    public Hund(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Halter {
    private Hund hund;

    public Halter(Hund hund){
        this.hund = hund;
    }
    
    public Hund getHund(){
        return hund;
    }

    // FIX: getHund ersetzten durch:

    public String getHundename(){
        return hund.getName();
    }
}

class Hundesitter {
    private Halter eingestelltVon;

    public Hundesitter(Halter eingestelltVon){
        this.eingestelltVon = eingestelltVon;
    }

    public void rufHund(){
        System.out.printf("Bei Fuß, %s\n", eingestelltVon.getHund().getName());
    }

    // FIX: rufHund ersetzten durch:
    public void rufHundFixed(){
        System.out.printf("Bei Fuß, %s\n", eingestelltVon.getHundename());
    }
}

public class LoD {
    public static void main(String[] args) {
        System.out.println("Verstoß gegen LoD \n");
        Hund wauzi = new Hund("Wauzi");
        Halter arnold = new Halter(wauzi);
        Hundesitter terminator = new Hundesitter(arnold);
        terminator.rufHund();

        System.out.println("Verstoß gegen LoD behoben \n");
        terminator.rufHundFixed();
    }
}