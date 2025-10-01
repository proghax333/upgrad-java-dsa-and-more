package org.proghax333.class_19sept;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new ArrayQueue<>(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Before reversing: ");
        queue.display();

        MyStack<Integer> stack = new DynamicStack<>();

        while(!queue.isEmpty()) {
            stack.push(queue.dequeue());
        }

        while(!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        System.out.println("After reversing: ");
        queue.display();
    }
}
