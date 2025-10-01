package org.proghax333.class_12sept;

public class Program6CountVowels {
    public static int[] countVowelsAndConsonants(String input) {
        int[] result = { 0, 0 };
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        int length = input.length();
        boolean isVowel = false;

        for(int i = 0; i < length; ++i) {
            char c = Character.toLowerCase(input.charAt(i));
            isVowel = false;

            // search for it in vowels
            for(char x : vowels) {
                if(x == c) {
                    result[0] += 1;
                    isVowel = true;
                    break;
                }
            }

            if(!isVowel) {
                result[1] += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String x = "abcdefghijklmnopqrstuvwxyz";

        int[] result = countVowelsAndConsonants(x);
        int vowels = result[0], consonants = result[1];

        System.out.println("Input string: " + x);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
