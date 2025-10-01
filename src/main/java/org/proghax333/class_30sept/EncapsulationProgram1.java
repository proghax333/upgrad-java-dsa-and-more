package org.proghax333.class_30sept;

import java.util.Arrays;

class Coffee {
    private int id;
    private String type;
    private String owner;
    private double quantity;

    public Coffee(int id, String type, String owner, double quantity) {
        this.id = id;
        this.type = type;
        this.owner = owner;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Coffee ☕{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

class InstagramReel {
    private int id;
    private String author;
    private long likes;
    private String[] comments;

    public InstagramReel(int id, String author) {
        this.id = id;
        this.author = author;
        this.likes = 0;
        this.comments = new String[0];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "InstagramReel{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", likes=" + likes +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }
}

class UPIPayment {
    private int id;
    private String UTR;
    private String from;
    private String to;

    public UPIPayment(int id, String UTR, String from, String to) {
        this.id = id;
        this.UTR = UTR;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUTR() {
        return UTR;
    }

    public void setUTR(String UTR) {
        this.UTR = UTR;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "UPIPayment{" +
                "id=" + id +
                ", UTR='" + UTR + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}

public class EncapsulationProgram1 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(1, "espresso", "Atmanand", 250);
        System.out.println(coffee + "\n");

        InstagramReel instagramReel = new InstagramReel(1, "@atmanandnagpure");
        instagramReel.setLikes(100);
        instagramReel.setComments(new String[] { "Great!", "Okay!!", "This rocks!" });

        System.out.println(instagramReel + "\n");

        UPIPayment upiPayment = new UPIPayment(1, "123123123", "atmanand@okicici", "aditya@okicici");
        System.out.println(upiPayment + "\n");
    }
}
