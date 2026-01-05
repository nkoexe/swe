//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Panem {
    protected static final double RADIUS = 1.5;
    protected static final int BEREICHE = 12;
    protected static final int BEREICH_GROESSE = 30; // GRAD

    //Benötige Funktionen
    //1: In welchem Bereich ist gegebener Punkt?
        //1a: Ist der Punkt außerhalb?
        //1b: Falls innerhalb, in Welchem Bereich
            //1b Hilfs: Berechne Winkel

    
    //1a: Ist der Punkt außerhalb der Arena?
    protected boolean withinArena(double x, double y){
        return (Math.sqrt(x*x+y*y) <= RADIUS);
    }


    //1b Hilfs: Berechne Winkel
    protected double punktWinkel(double x, double y){
        double winkelRadian = Math.atan2(x, y);
        double winkelGrad = Math.toDegrees(winkelRadian);

        // Normalisieren auf [0, 360)
        if (winkelGrad < 0) {
            winkelGrad += 360;
        }

        return winkelGrad;
    }

    //1b: Berechne Bereich
    protected int evalBereich(double winkelGrad){
        // int casting always truncates!
        int bereich = (int) (winkelGrad/BEREICH_GROESSE) +1; //wir zählen ab 1
        
        if(winkelGrad == 360){bereich=1;}

        return bereich;
    }

    public int getArena(double x, double y){
        if(!withinArena(x, y)){
            return -1;
        } else {
            return evalBereich(punktWinkel(x, y));
        }
    }
    

}
