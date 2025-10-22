public class Fraction {
    private int numerator;
    private int denominator;

    // CONSTRUCTORS
    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        // Normalize sign: move negative sign to numerator
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;

        // simplify the fraction upon creation, this is called also as
        // result of fraction operations, since they create new Fraction instances
        this.simplify();
    }

    // GETTERS
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    // Greatest Common Divisor used for fraction simplification
    private int gcd(int a, int b) {
        // use the Euclidean algorithm
        // (https://en.wikipedia.org/wiki/Euclidean_algorithm#Implementations)
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void simplify() {
        // simplify the fraction by dividing both numerator and denominator by their GCD
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fraction multiply(int factor) {
        // multiply just numerator by factor, return a new Fraction
        // will be simplified in the constructor
        return new Fraction(this.numerator * factor, this.denominator);
    }

    public Fraction multiply(Fraction factor) {
        // multiply numerators and denominators, return a new Fraction
        return new Fraction(this.numerator * factor.numerator, this.denominator * factor.denominator);
    }

    public Fraction multiply(Fraction... factors) {
        // start mupliplication with this current
        Fraction result = this;
        // multiply all factors one after the other
        for (Fraction factor : factors) {
            result = result.multiply(factor);
        }

        return result;
    }

    public Fraction divide(int divisor) {
        // divide by multiplying denominator by divisor, simplify in constructor
        return new Fraction(this.numerator, this.denominator * divisor);
    }

    public Fraction divide(Fraction divisor) {
        // divide by multiplying reciprocal factors
        return new Fraction(this.numerator * divisor.denominator, this.denominator * divisor.numerator);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public static void main(String[] args) {
        Fraction fraction = new Fraction(-4, -8);
        System.out.println(fraction);
    }
}
