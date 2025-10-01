package org.proghax333.test_20sept;

import org.proghax333.class_19sept.DynamicStack;
import org.proghax333.class_19sept.MyQueue;
import org.proghax333.class_19sept.MyStack;

class StackBasedQueue<T> implements MyQueue<T> {
    private int size;
    private MyStack<T> stack;

    public StackBasedQueue() {
        stack = new DynamicStack<>();
        size = 0;
    }

    @Override
    public void enqueue(T data) {
        ++size;
        stack.push(data);
    }

    @Override
    public T dequeue() {
        if(stack.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }

        MyStack<T> temp = new DynamicStack<>();
        while(!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        T result = temp.pop();
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        --size;

        return result;
    }

    @Override
    public T peek() {
        throw new RuntimeException("Method not implemented.");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        MyStack<T> temp = new DynamicStack<>();
        while(!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        while(!temp.isEmpty()) {
            System.out.print(temp.peek() + " <-");
            stack.push(temp.pop());
        }

        System.out.println("END");
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new StackBasedQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();
        queue.display();
    }
}
