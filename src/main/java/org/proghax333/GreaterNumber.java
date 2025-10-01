package org.proghax333;

public class GreaterNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a > b) {
            System.out.println(a + " > " + b);
        } else if(b > a) {
            System.out.println(b + " > " + a);
        } else {
            System.out.println(a + " = " + b);
        }

        int c = 30;
        int d = 40;

        if(c > d) {
            System.out.println(c + " > " + d);
        } else if(d > c) {
            System.out.println(d + " > " + c);
        } else {
            System.out.println(c + " = " + d);
        }


        int e = 100;
        int f = 80;

        if(e > f) {
            System.out.println(e + " > " + f);
        } else if(f > e) {
            System.out.println(f + " > " + e);
        } else {
            System.out.println(e + " = " + f);
        }

    }
}
