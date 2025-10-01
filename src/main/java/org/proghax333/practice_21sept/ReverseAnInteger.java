package org.proghax333.practice_21sept;

public class ReverseAnInteger {
    public static int reverseInteger(int x) {
        int result = 0;

        // 1234 / 10 = 123
        // 1234
        // 123
        // 12
        // 1
        while(true) {
            // 4
            // 3
            // 2
            // 1
            int lastDigit = x % 10;

            // 123
            // 12
            // 1
            // 0
            x = x / 10;

            // 0 + 4 = 4
            // 4*10 + 3 = 43
            // 43*10 + 2 = 432
            // 432*10 + 1 = 4321
            result = result * 10 + lastDigit;

            if(x == 0) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(1234));
        System.out.println(reverseInteger(112233));
        System.out.println(reverseInteger(1579));
    }
}
