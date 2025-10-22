public class FractionTest {

    public static void main(String[] args) {

        //  Konstruktor
        Fraction f1 = new Fraction(3);
        if (f1.getNumerator() == 3 && f1.getDenominator() == 1) {
            System.out.println("Konstruktor mit einem Parameter passed");
        } else {
            System.out.println("Konstruktor mit einem Paramter failed");
        }

        //  Kürzen im Konstruktor
        Fraction f2 = new Fraction(4, 8);
        if (f2.getNumerator() == 1 && f2.getDenominator() == 2) {
            System.out.println("Kürzen im Konstruktor passed");
        } else {
            System.out.println("Kürzen im Konstruktor failed");
        }

        //  Multiplikation  int
        Fraction f3 = new Fraction(2, 3).multiply(3);
        if (f3.getNumerator() == 2 && f3.getDenominator() == 1) {
            System.out.println("Multiplikation mit int passed");
        } else {
            System.out.println("Multiplikation mit int failed");
        }

        //  Multiplikation mit Fraction
        Fraction f4 = new Fraction(1, 2).multiply(new Fraction(2, 3));
        if (f4.getNumerator() == 1 && f4.getDenominator() == 3) {
            System.out.println("Multiplikation mit Fraction passed");
        } else {
            System.out.println(" Multiplikation mit Fraction failed");
        }

        //Division Fraction
        Fraction f5 = new Fraction(1, 2).divide(new Fraction(2, 3));
        if (f5.getNumerator() == 3 && f5.getDenominator() == 4) {
            System.out.println("Division mit Fraction passed");
        } else {
            System.out.println("Division mit Fraction failed");
        }

        // Multiplikation mit mehreren Brüchen
        Fraction f6 = new Fraction(1, 2).multiply(new Fraction(2, 3), new Fraction(3, 4));
        if (f6.getNumerator() == 1 && f6.getDenominator() == 4) {
            System.out.println("Multiplikation mit mehreren Brüchen passed");
        } else {
            System.out.println("Multiplikation mit mehreren Brüchen failed");
        }

        // testen vontoString
        Fraction f7 = new Fraction(5, 2);
        if (f7.toString().equals("5/2")) {
            System.out.println("toString passed");
        } else {
            System.out.println("toString failed");
        }
    }
}
