package org.proghax333.class_17sept;

import java.util.Stack;

public class BrowserGoBackStack {
    public static boolean goBack(Stack<String> historyStack) {
        if(historyStack.isEmpty()) {
            return false;
        }

        historyStack.pop();
        return true;
    }

    public static String getCurrentSite(Stack<String> historyStack) {
        if(historyStack.isEmpty()) {
            return null;
        }

        return historyStack.peek();
    }

    public static void main(String[] args) {
        Stack<String> historyStack = new Stack<>();

        historyStack.push("website1");
        historyStack.push("website2");
        historyStack.push("website3");

        System.out.println("Current site: " + getCurrentSite(historyStack));

        goBack(historyStack);
        goBack(historyStack);

        System.out.println("Went back 2 times.");

        System.out.println("Current site: " + getCurrentSite(historyStack));
    }
}
