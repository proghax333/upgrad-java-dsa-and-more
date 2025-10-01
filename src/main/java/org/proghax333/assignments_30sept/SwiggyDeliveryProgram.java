package org.proghax333.assignments_30sept;

class SwiggyDelivery {
    public void trackOrder() {
        System.out.println("Your order is on it's way. It's near your location");
    }
}

class SwiggySuperDelivery extends SwiggyDelivery {
    public void prioritySupport(String message) {
        System.out.println("Your message has been received. Message is: " + message);
    }
}

public class SwiggyDeliveryProgram {
    public static void main(String[] args) {
        SwiggyDelivery d1 = new SwiggyDelivery();
        d1.trackOrder();

        SwiggySuperDelivery d2 = new SwiggySuperDelivery();
        d2.trackOrder();
        d2.prioritySupport("My order is missing some items in it. The sauce is missing.");
    }
}
