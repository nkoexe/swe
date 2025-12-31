public class Arena {
    private static final double RADIUS = 1.5; // 3km Durchmesser = 1.5km Radius
    private static final int ANZAHL_BEREICHE = 12;
    private static final double GRAD_PRO_BEREICH = 360.0 / ANZAHL_BEREICHE;
    
    public int getArea(double x, double y) {
        if (istAusserhalbDerArena(x, y)) {
            return -1;
        }
        
        double winkelGrad = berechneWinkelInGrad(x, y);
        return berechneBereich(winkelGrad);
    }
    
    protected boolean istAusserhalbDerArena(double x, double y) {
        double distanzVonMitte = Math.sqrt(x * x + y * y);
        return distanzVonMitte > RADIUS;
    }
    
    protected double berechneWinkelInGrad(double x, double y) {
        // atan2(x, y) statt atan2(y, x) damit 0° bei (0, positive) ist
        double winkelRad = Math.atan2(x, y);
        double winkelGrad = Math.toDegrees(winkelRad);
        
        // Normalisieren auf [0, 360)
        if (winkelGrad < 0) {
            winkelGrad += 360;
        }
        
        return winkelGrad;
    }
    
    protected int berechneBereich(double winkelGrad) {
        int bereich = (int) (winkelGrad / GRAD_PRO_BEREICH) + 1;
        
        // Sicherheitscheck für genau 360°
        if (bereich > ANZAHL_BEREICHE) {
            bereich = 1;
        }
        
        return bereich;
    }
    
    public static double getRadius() {
        return RADIUS;
    }
}