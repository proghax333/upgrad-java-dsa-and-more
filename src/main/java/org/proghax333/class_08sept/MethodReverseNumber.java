package org.proghax333.class_08sept;

class ReverseNumberService {
    public int reverseNumber(int n) {
        int result = 0;

//        int length = (int) Math.log10(n);
//        int t = n, x, c = length;
//
//        while(t > 0) {
//            x = t % 10;
//            result += (int) (x * Math.pow(10, c));
//            t /= 10;
//            c--;
//        }

        int t = n, x;
        while(t > 0) {
            x = t % 10;
            result = result * 10 + x;
            t /= 10;
        }

        return result;
    }
}

public class MethodReverseNumber {
    public static void main(String[] args) {
        ReverseNumberService reverseNumberService = new ReverseNumberService();

        int n = 1234;
        int result = reverseNumberService.reverseNumber(n);
        System.out.println("Reverse of " + n + " = " + result);
    }
}
