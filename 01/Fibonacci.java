public class Fibonacci {

    // Return the n-th Fibonacci number 
    public static int fib(int n) {
        // Hard-coded base cases
        if (n <= 0) {
            return 0;
        } else if (n <= 2) {
            // fib(2) = 1
            return 1;
        }

        // Iterative calculation for n > 2
        // n2 is the previous number, n1 is two before
        // fn is the current number being calculated
        int n1 = 1, n2 = 1, fn = 2;
        // loop n-2 times (base cases already handled)
        for (int i = 2; i < n; i++) {
            // New Fibonacci number is sum of previous two
            fn = n1 + n2;
            // Update previous two numbers
            n1 = n2;
            n2 = fn;
        }

        return fn;
    }

    public static void main(String[] args) {
        // print first 20 Fibonacci numbers
        for (int i = 0; i < 20; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }
    
}
