public class MathUtilsTests {
    // variables for test tracking
    private int testCount = 0;
    private int passCount = 0;

    public void testAdd() {
        // Table containing test cases: { a, b, expectedResult }
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

            // First two elements are addends
            double a = testCase[0];
            double b = testCase[1];
            // Third is expected result
            double expected = testCase[2];
            double result = MathUtils.add(a, b);

            if (result == expected) {
                passCount++;
                System.out.println("Test " + testCount + " passed.");
            } else {
                // fail count will be derived at the end
                System.out.println("Test " + testCount + " failed: add(" + a + ", " + b + ") expected " + expected
                        + " but got " + result);
            }
        }
    }

    public void testFactorial() {
        // Test data covers base cases (0, 1)
        // structured as { n, expectedResult }
        int[][] results = {
                { 0, 1 },
                { 1, 1 },
                { 2, 2 },
                { 3, 6 },
                { 4, 24 },
                { 5, 120 }
        };

        // Factorial of negative number should throw exception
        // Without the JUnit framework we have check this case manually
        testCount++;
        try {
            MathUtils.factorial(-1);
            // No error? fail
            System.out.println("Test " + testCount + " failed: factorial(-1) should have thrown an exception.");

        } catch (IllegalArgumentException e) {
            passCount++;
            System.out.println("Test " + testCount + " passed.");
        }

        for (int[] testCase : results) {
            testCount++;

            // expected result: factorial(n) = expected
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
    }

    public static void main(String[] args) {
        MathUtilsTests tests = new MathUtilsTests();
        System.out.println("Running tests...\n");
        tests.testAdd();
        tests.testFactorial();

        int failures = tests.testCount - tests.passCount;

        // In the CI pipeline the string 'Failed = 0' is checked to
        // verify that all tests passed
        System.out.println("\nTests run: " + tests.testCount +
                ", Passed: " + tests.passCount + ", Failed: " + failures);

        // Exit with non-zero status if any test failed
        if (failures != 0) {
            System.exit(1);
        }
    }
}
