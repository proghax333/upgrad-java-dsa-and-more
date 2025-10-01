package org.proghax333.class_08sept;

class NumberService {
    public void displayEvenOrOdd(int n) {
        if(n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}

public class MethodOddEven {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        int n = 12;
        numberService.displayEvenOrOdd(n);
    }
}
