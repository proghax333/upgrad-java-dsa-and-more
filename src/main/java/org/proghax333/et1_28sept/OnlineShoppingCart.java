package org.proghax333.et1_28sept;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Cart {
    private final List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public boolean add(Product p) {
        if(products.contains(p)) {
            return false;
        }

        products.add(p);
        return true;
    }

    public boolean remove(int id) {
        Product p = null;
        for(Product x : products) {
            if(x.getId() == id) {
                p = x;
                break;
            }
        }

        if(p == null) {
            return false;
        }

        products.remove(p);
        return false;
    }

    public double getBill() {
        double bill = 0;

        for(Product p : products) {
            bill += p.getPrice();
        }

        return bill;
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Guitar", 100);
        Product p2 = new Product(2, "Piano", 200);
        Product p3 = new Product(3, "Phone", 1000);

        Cart cart = new Cart();
        cart.add(p1);
        cart.add(p2);
        cart.add(p3);

        cart.remove(p2.getId());

        System.out.println("Total bill = " + cart.getBill()); // 100 + 1000 = 1100
    }
}
