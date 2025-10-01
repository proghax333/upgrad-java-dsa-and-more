package org.proghax333.upgrad_modules.java.java2.oops2.take_home;

class ShapeArea {
    double areaOfRectangle(double length, double width) {
        return length * width;
    }


    double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
    // using a "double" value for diameter is impossible
    // as it would create ambiguity for the type system.


    double areaOfTriangle(double a, double b, double c) {
        // s = semi perimeter
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class CodingProblem1 {
    public static void main(String[] args) {
        ShapeArea c = new ShapeArea();

        System.out.println(c.areaOfRectangle(10, 20));
        System.out.println(c.areaOfCircle(10));
        System.out.println(c.areaOfTriangle(10, 10, 10));
    }
}
