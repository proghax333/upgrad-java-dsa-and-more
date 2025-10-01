package org.proghax333.assignments_05sept;

public class Q10LongestPalindromeSubstring {

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindrome (center at i)
            int len1 = expandAroundCenter(s, i, i);
            // Case 2: Even length palindrome (center between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                // Update start and end indices
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Expand around center and return palindrome length
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of palindrome
    }

    // Main method for testing
    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Input: " + str);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));

        str = "cbbd";
        System.out.println("Input: " + str);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));

        str = "forgeeksskeegfor";
        System.out.println("Input: " + str);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));
    }
}
