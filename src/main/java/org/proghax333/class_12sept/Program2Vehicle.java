package org.proghax333.class_12sept;

abstract class Vehicle {
    abstract public void drive();
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a bike.");
    }
}

public class Program2Vehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();

        Vehicle bike = new Bike();
        bike.drive();
    }
}
