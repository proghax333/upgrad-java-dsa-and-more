package org.proghax333.class_19sept;

public class CheckBalancingParenthesis {
    public static boolean isBalancedParenthesis(String s) {
        MyStack<Character> stack = new DynamicStack<>();

        int n = s.length();
        char c;
        for(int i = 0; i < n; ++i) {
            c = s.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("(()) = " + isBalancedParenthesis("(())"));
        System.out.println(")(()) = " + isBalancedParenthesis(")(())"));
        System.out.println("()()(()) = " + isBalancedParenthesis("()()(())"));
        System.out.println("(())) = " + isBalancedParenthesis("(()))"));
    }
}
