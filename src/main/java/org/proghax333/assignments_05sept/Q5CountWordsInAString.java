package org.proghax333.assignments_05sept;

public class Q5CountWordsInAString {
    public static int countWords(String str) {
        int count = 0;
        int length = str.length();

        boolean wordBegan = false;
        for(int i = 0; i < length; ++i) {
            char c = str.charAt(i);

            if(c == ' ') {
                wordBegan = false;
            } else if(!wordBegan) {
                wordBegan = true;
                ++count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "A quick brown fox, jumps over a lazy dog.";

        System.out.println("Words count: " + countWords(str));
    }
}
