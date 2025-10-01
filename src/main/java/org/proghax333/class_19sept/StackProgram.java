package org.proghax333.class_19sept;

public class StackProgram {
    public static void main(String[] args) {
        MyStack<Integer> stack = new DynamicStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("HI!");
        stack.display();
    }
}
