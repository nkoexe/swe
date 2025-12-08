class Thermomix {
    void koche(String gericht){
        if(gericht == "reis"){
            System.out.println("Ich koche 10 min");
        }

    }
}

// FIX

interface Thermomix2 {
    public void koche();
}

class ReisKochen implements Thermomix2{
    public void koche(){ //warum geht nicht doppelt nur void
        System.out.println("Ich koche 10 min");
    }
}

