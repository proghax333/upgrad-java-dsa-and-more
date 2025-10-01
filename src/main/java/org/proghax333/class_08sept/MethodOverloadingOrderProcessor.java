package org.proghax333.class_08sept;

class OrderProcessor {
    public void processOrder(String itemName, int quantity) {
        System.out.println("Item name = " + itemName + ", Quantity = " + quantity + " | Processed");
    }
    public void processOrder(int quantity, String itemName) {
        System.out.println("[Processed] Item name = " + itemName + ", Quantity = " + quantity);
    }
}

public class MethodOverloadingOrderProcessor {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        String itemName = "Apple";
        int quantity = 10;

        orderProcessor.processOrder(itemName, quantity);
        orderProcessor.processOrder(quantity, itemName);
    }
}
