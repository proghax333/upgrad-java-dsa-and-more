package org.proghax333.class_12sept;

abstract class Shape {
    abstract public double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Program4Area {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("Area of circle: " + circle.area());

        Shape rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}
