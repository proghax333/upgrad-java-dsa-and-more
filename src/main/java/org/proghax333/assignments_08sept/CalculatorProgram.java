package org.proghax333.assignments_08sept;

class Calculator {
    // For `int`
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }


    // For `double`
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }
}

public class CalculatorProgram {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 20, b = 10;

        System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        System.out.println(a + " - " + b + " = " + calculator.sub(a, b));
        System.out.println(a + " x " + b + " = " + calculator.mul(a, b));

        double p = 100.5, q = 10.0;

        System.out.println(p + " + " + q + " = " + calculator.add(p, q));
        System.out.println(p + " - " + q + " = " + calculator.sub(p, q));
        System.out.println(p + " x " + q + " = " + calculator.mul(p, q));
    }
}
