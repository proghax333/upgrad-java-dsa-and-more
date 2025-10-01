package org.proghax333.class_09sept;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c = new Circle(1.0);

        System.out.println("Area of circle = " + c.area());
    }
}
