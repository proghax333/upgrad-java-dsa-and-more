package org.proghax333.extra_array_questions;

public class TotalHandshakes {
    public static int getHandshakes(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Total handshakes (n=1): " + getHandshakes(1));
        System.out.println("Total handshakes (n=3): " + getHandshakes(2));
        System.out.println("Total handshakes (n=3): " + getHandshakes(3));
    }
}
