package org.proghax333.class_12sept;

class Area {
    public static int calculateArea(int side) {
        return side * side;
    }

    public static int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Program9AreaOverloading {
    public static void main(String[] args) {
        System.out.println("area(10) = " + Area.calculateArea(10));
        System.out.println("area(10, 20) = " + Area.calculateArea(10, 20));
        System.out.println("area(100.0) = " + Area.calculateArea(100.0));
    }
}
