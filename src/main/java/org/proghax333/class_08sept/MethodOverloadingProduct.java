package org.proghax333.class_08sept;

class NumberProductService {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloadingProduct {
    public static void main(String[] args) {
        NumberProductService numberProductService = new NumberProductService();

        int n1 = 10, n2 = 20;
        System.out.println(n1 + " x " + n2 + " = " + numberProductService.multiply(n1, n2));

        double n3 = 12.5, n4 = 6;
        System.out.println(n3 + " x " + n4 + " = " + numberProductService.multiply(n3, n4));
    }
}
