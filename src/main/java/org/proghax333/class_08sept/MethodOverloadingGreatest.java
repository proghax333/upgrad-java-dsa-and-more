package org.proghax333.class_08sept;

class GreatestNumberService {
    public int greatest(int a, int b) {
        return Math.max(a, b);
    }

    public int greatest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

public class MethodOverloadingGreatest {
    public static void main(String[] args) {
        GreatestNumberService greatestNumberService = new GreatestNumberService();

        int a = 10, b = 20, c = 30;

        System.out.println("Greatest amongst " + a + ", " + b + " = " + greatestNumberService.greatest(a, b));
        System.out.println("Greatest amongst " + a + ", " + b + ", " + c + " = "
                + greatestNumberService.greatest(a, b, c));
    }
}
