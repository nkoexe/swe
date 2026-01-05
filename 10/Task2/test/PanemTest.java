import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PanemTest {
    Panem arena;
            // Angenommen BEREICH_GROESSE = 30 (360° / 12 Bereiche)
    static double BEREICH_GROESSE = 30.0;
    static int ANZAHL_BEREICHE = 12;
    
    @BeforeEach
    public void testSetup(){
        arena = new Panem();

    }

    @Test
    public void testWithinArena(){
        // within radius of 1.5 around (0,0)

        assertTrue(arena.withinArena(0,0));
        assertTrue(arena.withinArena(0,1.5));

        // Test 5 random points INSIDE the arena (within radius 1.5)
        for (int i = 0; i < 5; i++) {
            // Generate random angle and random radius within 1.5
            double angle = Math.random() * 2 * Math.PI; //full circle; random angle between 0 and 2π radians
            double radius = Math.random() * 1.5; // 0 to 1.5
            
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);
            
            assertTrue(arena.withinArena(x, y), 
                "Point (" + x + ", " + y + ") should be inside arena");
        }
        
        // Test 5 random points OUTSIDE the arena (beyond radius 1.5)
        for (int i = 0; i < 5; i++) {
            // Generate random angle, random radius beyond 1.5
            double angleRad = Math.random() * 2 * Math.PI;
            double radius = 1.5 + Math.random()* 3; // 1.5 to 4.5
            
            //VERTAUSCHTES KOORDINATENSYSTEM
            double x = radius * Math.sin(angleRad); //radians, not degrees!!!
            double y = radius * Math.cos(angleRad);
            
            assertFalse(arena.withinArena(x, y), 
                "Point (" + x + ", " + y + ") should be outside arena");
        }
    }

    @Test 
    public void testWinkelBerechnung(){
        // 4 Rcihtungen
        assertEquals(0, arena.punktWinkel(0, 1), 0.01, "Point (0,1) should be 0°");
        assertEquals(90, arena.punktWinkel(1, 0), 0.01, "Point (1,0) should be 90°");
        assertEquals(180, arena.punktWinkel(0, -1), 0.01, "Point (0,-1) should be 180°");
        assertEquals(270, arena.punktWinkel(-1, 0), 0.01, "Point (-1,0) should be 270°");
        // Teste undef Ursprung
        double originAngle = arena.punktWinkel(0, 0);
        assertTrue(originAngle >= 0 && originAngle < 360, 
            "Angle at origin should be in range [0, 360)");

        // Teste kleinen Winkel
        double smallAngle = arena.punktWinkel(0.0001, 0.0001);
        assertTrue(smallAngle >= 0 && smallAngle < 360, 
            "Small values should produce valid angle");

        // Test normalisierung ( atan gibt werte von -180 bis 180 zurück)
        // Quadrant III: x < 0, y < 0 (should be 180° to 270°)
        double q3 = arena.punktWinkel(-1, -1);
        assertTrue(q3 >= 180 && q3 < 270, 
            "Quadrant III angle should be [180°, 270°), got " + q3);
        
        // Quadrant IV: x < 0, y > 0 (should be 270° to 360°)
        double q4 = arena.punktWinkel(-1, 1);
        assertTrue(q4 >= 270 && q4 < 360, 
            "Quadrant IV angle should be [270°, 360°), got " + q4);
    }

    @Test
    public void testBereichsBerechnung(){
        //edge cases
        assertEquals(1, arena.evalBereich(0));
        assertEquals(1, arena.evalBereich(360));

        
        // Teste alle Bereiche
        for (int bereich = 1; bereich <= ANZAHL_BEREICHE; bereich++) {
            // Berechne Grenzen für diesen Bereich
            double untergrenze = (bereich - 1) * BEREICH_GROESSE;
            double obergrenze = bereich * BEREICH_GROESSE - 0.001; // knapp unter der nächsten Grenze
            
            // Teste Untergrenze
            assertEquals(bereich, arena.evalBereich(untergrenze), 
                "Untergrenze " + untergrenze + "° should be Bereich " + bereich);
            
            // Teste Obergrenze
            assertEquals(bereich, arena.evalBereich(obergrenze), 
                "Obergrenze " + obergrenze + "° should be Bereich " + bereich);
            
            // Teste einen zufälligen Punkt im Bereich
            double randomWinkel = untergrenze + Math.random() * (BEREICH_GROESSE - 0.01);
            assertEquals(bereich, arena.evalBereich(randomWinkel), 
                "Random angle " + randomWinkel + "° should be Bereich " + bereich);
        }
    }

    @Test
    public void testGetArena(){
        // Zu Testen:
        // innerhalb arena, außerhalb der arena (radius der arena 1.5) -> 2 (1 reich da innerhalb abgedeckt)
            //hier: je 5 zufällige Punkte mit Math.random durch testWithinArena abgedeckt
            // Grenzfall Kreisgrenze ist durch testWithinArena abgedeckt
            // also reicht ein test für korrekte ausgabe von -1
        // 12 Tests, 1 für jeden Bereich
            // Grenzfälle für die Bereichsgrenznweden schon in testBereichsBerechnung abgedeckt
       
        assertEquals(arena.getArena(3, 3), -1);

        for(int bereich = 1; bereich <= ANZAHL_BEREICHE; bereich++ ){
            // Generate random angle for this bereich and random radius within 1.5
            double angleDeg = ((bereich-1)* 30 +  Math.random()*30);
            double angleRad = angleDeg * Math.PI / 180;
            double radius = Math.random() * 1.5; // 0 to 1.5
            
            //VERTAUSCHTES KOORDINATENSYSTEM
            double x = radius * Math.sin(angleRad); //radians, not degrees!!!
            double y = radius * Math.cos(angleRad);
            
            assertEquals(bereich, arena.getArena(x, y),
                "Point (" + x + ", " + y + ") with angle " + angleDeg + "should be inside bereich " + bereich);
        }

    }

}
