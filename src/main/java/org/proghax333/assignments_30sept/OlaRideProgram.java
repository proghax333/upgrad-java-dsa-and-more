package org.proghax333.assignments_30sept;

abstract class Ride {
    abstract public void bookRide();
}

class BikeRide extends Ride {
    @Override
    public void bookRide() {
        System.out.println("Bike ride has been booked.");
    }
}

class CarRide extends Ride {
    @Override
    public void bookRide() {
        System.out.println("Car ride has been booked.");
    }
}

public class OlaRideProgram {
    public static void main(String[] args) {
        Ride ride1 = new BikeRide();
        Ride ride2 = new CarRide();

        ride1.bookRide();
        ride2.bookRide();
    }
}
