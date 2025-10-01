package org.proghax333.assignments_30sept;

class FoodOrder {
    private int orderId;
    private int totalAmount;
    private boolean isOrderPayed = false;

    public FoodOrder(int orderId, int totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    public boolean payOrder(int enteredAmount) {
        if(isOrderPayed) {
            return false;
        }

        if(enteredAmount == totalAmount) {
            isOrderPayed = true;
            return true;
        }

        return false;
    }
}

public class ZomatoOrderSystemProgram {
    public static void main(String[] args) {
        FoodOrder pizza = new FoodOrder(1, 100);

        System.out.println(pizza.payOrder(20));
        System.out.println(pizza.payOrder(100));
        System.out.println(pizza.payOrder(100));
    }
}
