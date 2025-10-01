package org.proghax333.class_10sept;

class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double add(double x, double y, double z) {
        return x + y + z;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double multiply(double x, double y, double z) {
        return x * y * z;
    }
}

public class CalculatorProgram {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3));
        System.out.println("1 + 2 * 3 = " + calc.add(1, calc.multiply(2, 3)));
        System.out.println("10 * 2 * 3 + 100 = " + calc.add(calc.multiply(10, 2, 3), 100));
    }
}
