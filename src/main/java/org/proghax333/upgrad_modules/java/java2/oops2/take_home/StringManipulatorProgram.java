package org.proghax333.upgrad_modules.java.java2.oops2.take_home;

class StringManipulator {
    public String reverse(String input) {
        int n = input.length();
        char[] buf = new char[n];

        // 012345
        // abcdef
        // fedcba

        // i -> 5 - i
        // i = 0 -> 5
        // i = 1 -> 4

        for(int i = 0; i < n; ++i) {
            buf[i] = input.charAt(n - 1 - i);
        }

        return String.valueOf(buf);
    }

    public String capitalize(String input) {
        int n = input.length();
        if(n == 0) {
            return "";
        }

        char firstChar = input.charAt(0);
        firstChar = Character.toUpperCase(firstChar);

        char[] buf = new char[n];
        buf[0] = firstChar;

        for(int i = 1; i < n; ++i) {
            buf[i] = input.charAt(i);
        }

        return String.valueOf(buf);
    }

    public String append(String input, String other) {
        return input + other;
    }

    public String append(String input, char other) {
        return input + other;
    }

    public String append(String input, int other) {
        return input + other;
    }
}

public class StringManipulatorProgram {
    public static void main(String[] args) {
        StringManipulator s = new StringManipulator();

        System.out.println(s.reverse("abcdef"));
        System.out.println(s.capitalize("abcdef"));

        System.out.println(s.append("Hello", 1));
        System.out.println(s.append("Hello", '!'));
        System.out.println(s.append("Hello", ", World!"));
    }
}
