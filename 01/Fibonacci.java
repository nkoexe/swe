public class Fibonacci {
    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }

        int n1 = 1, n2 = 1, fn = 2;
        for (int i = 2; i < n; i++) {
            fn = n1 + n2;
            n1 = n2;
            n2 = fn;
        }

        return fn;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }
    
}
