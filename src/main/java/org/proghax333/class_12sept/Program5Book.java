package org.proghax333.class_12sept;

class Book {
    private String title;
    private double price;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Program5Book {
    public static void main(String[] args) {
        Book harryPotterChamberOfSecrets = new Book("Harry Potter and the Chamber of Secrets", 200);
        System.out.println(harryPotterChamberOfSecrets);

        Book harryPotterPrisonerOfAzkaban = new Book("Harry Potter and the Prisoner of Azkaban");
        harryPotterPrisonerOfAzkaban.setPrice(300);

        System.out.println(harryPotterPrisonerOfAzkaban);
    }
}
