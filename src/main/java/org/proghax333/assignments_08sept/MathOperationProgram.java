package org.proghax333.assignments_08sept;

class MathOperation {
    // Square root
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    // Cube root
    public double cbrt(double x) {
        return Math.cbrt(x);
    }

    public int factorial(int n) {
        int result = 1;

        if(n == 0) {
            return result;
        }

        for(int i = 2; i <= n; ++i) {
            result *= i;
        }

        return result;
    }

    public long factorial(long n) {
        long result = 1;

        if(n == 0) {
            return result;
        }

        for(long i = 2; i <= n; ++i) {
            result *= i;
        }

        return result;
    }
}

public class MathOperationProgram {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();

        double n1 = 9, n2 = 27;
        System.out.println("Square root of " + n1 + " = " + mathOperation.sqrt(n1));
        System.out.println("Cube root of " + n2 + " = " + mathOperation.cbrt(n2));

        int n3 = 4;
        System.out.println("Factorial of " + n3 + " = " + mathOperation.factorial(n3));

        long n4 = 5;
        System.out.println("(long) Factorial of " + n4 + " = " + mathOperation.factorial(n4));
    }
}
