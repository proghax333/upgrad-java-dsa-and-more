package org.proghax333.class_09sept;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}

public class CalculatorProgram {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        double a = 20, b = 10;

        System.out.println(a + " + " + b + " = " + c.add(a, b));
        System.out.println(a + " - " + b + " = " + c.sub(a, b));
        System.out.println(a + " * " + b + " = " + c.mul(a, b));
        System.out.println(a + " / " + b + " = " + c.div(a, b));
    }
}
