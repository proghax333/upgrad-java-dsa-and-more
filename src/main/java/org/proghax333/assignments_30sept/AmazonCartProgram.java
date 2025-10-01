package org.proghax333.assignments_30sept;

class AmazonCart {
    private int itemsCount;
    private long totalPrice;

    public void addItem(int price) {
        itemsCount++;
        totalPrice += price;
    }

    public String getCartDetails() {
        return "[Cart]\n" +
                "No. of items: " + itemsCount + "\n" +
                "Total cart price: " + totalPrice + "\n";
    }
}

public class AmazonCartProgram {
    public static void main(String[] args) {
        AmazonCart cart1 = new AmazonCart();

        cart1.addItem(10);
        cart1.addItem(200);
        cart1.addItem(100);

        // 10 + 200 + 100 = 310
        System.out.println(cart1.getCartDetails());

        AmazonCart cart2 = new AmazonCart();

        cart2.addItem(1000);
        cart2.addItem(2000);

        System.out.println(cart2.getCartDetails());
    }
}
