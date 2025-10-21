public class Fraction {
    private int numerator;
    private int denominator;

    // Constructors
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        //todo simplify inside constructor
    }

    // Greatest Common Divisor for fraction simplification
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fraction multiply(int factor) {
        return new Fraction(this.numerator * factor, this.denominator);
    }

    public Fraction multiply(Fraction factor) {
        return new Fraction(this.numerator * factor.numerator, this.denominator * factor.denominator);
    }

    public static void main(String[] args) {
        Fraction fraction = new Fraction(4, 8);
    }
}
