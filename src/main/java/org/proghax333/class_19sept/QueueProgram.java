package org.proghax333.class_19sept;

public class QueueProgram {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new ArrayQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();

        queue.display();
    }
}
