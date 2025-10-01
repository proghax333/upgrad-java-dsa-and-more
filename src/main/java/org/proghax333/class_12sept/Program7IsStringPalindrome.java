package org.proghax333.class_12sept;

public class Program7IsStringPalindrome {
    public static boolean isStringPalindrome(String input) {
        int length = input.length();
        int halfLength = length / 2;

        for(int i = 0; i < halfLength; ++i) {
            if(input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(": " + isStringPalindrome(""));
        System.out.println("abcba: " + isStringPalindrome("abcba"));
        System.out.println("aabbcc: " + isStringPalindrome(""));
        System.out.println("abcdb: " + isStringPalindrome("abcdb"));
    }
}
