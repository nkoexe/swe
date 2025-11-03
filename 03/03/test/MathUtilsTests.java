public class MathUtilsTests {
    private int testCount = 0;
    private int passCount = 0;

    public void testAdd() {

        // table containing test cases: {a, b, expectedResult}
        double[][] results = {
                { 2, 3, 5 },
                { 0, 0, 0 },
                { -1, 1, 0 },
                { -2, -3, -5 },
                { 1.5, 2.5, 4.0 },
                { 0.1, 0.2, 0.3 }
        };

        for (double[] testCase : results) {
            testCount++;

            double a = testCase[0];
            double b = testCase[1];
            double expected = testCase[2];
            double result = MathUtils.add(a, b);

            if (result == expected) {
                passCount++;
                System.out.println("Test " + testCount + " passed.");
            } else {
                System.out.println("Test " + testCount + " failed: add(" + a + ", " + b + ") expected " + expected
                        + " but got " + result);
            }
        }
    }

    public void testFactorial() {
        // table containing test cases: {n, expectedResult}
        int[][] results = {
                { 0, 1 },
                { 1, 1 },
                { 2, 2 },
                { 3, 6 },
                { 4, 24 },
                { 5, 120 }
        };

        // Special test for negative input
        testCount++;
        try {
            MathUtils.factorial(-1);
            System.out.println("Test " + testCount + " failed: factorial(-1) should have thrown an exception.");

        } catch (IllegalArgumentException e) {
            passCount++;
            System.out.println("Test " + testCount + " passed.");
        }

        for (int[] testCase : results) {
            testCount++;

            int n = testCase[0];
            int expected = testCase[1];
            int result = MathUtils.factorial(n);

            if (result == expected) {
                passCount++;
                System.out.println("Test " + testCount + " passed.");
            } else {
                System.out.println("Test " + testCount + " failed: factorial(" + n + ") expected " + expected
                        + " but got " + result);
            }
        }

        // Test for negative input
        testCount++;
        try {
            MathUtils.factorial(-1);
            System.out.println("Test " + testCount + " failed: factorial(-1) should have thrown an exception.");
        } catch (IllegalArgumentException e) {
            passCount++;
            System.out.println("Test " + testCount + " passed.");
        }
    }

    public static void main(String[] args) {
        MathUtilsTests tests = new MathUtilsTests();
        System.out.println("Running tests...\n");
        tests.testAdd();
        tests.testFactorial();
        System.out.println("\nTests completed: " + tests.testCount + ", Passed: " + tests.passCount + ", Failed: "
                + (tests.testCount - tests.passCount));
    }
}
