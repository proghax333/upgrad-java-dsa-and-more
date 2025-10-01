package org.proghax333.class_19sept;

public class ArrayStack<T> implements MyStack<T> {
    private T[] data;
    int size;
    int top = -1;

    public ArrayStack(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
    }

    public void push(T data) {
        if(isFull()) {
            throw new RuntimeException("The stack is full.");
        }

        this.data[++top] = data;
    }

    public T pop() {
        if(isEmpty()) {
            throw new RuntimeException("The stack is empty.");
        }

        T data = this.data[top];
        --top;

        return data;
    }

    public T peek() {
        if(isEmpty()) {
            throw new RuntimeException("The stack is empty.");
        }

        return this.data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return size;
    }

    @Override
    public void display() {
        for(int i = size - 1; i >= 0; --i) {
            System.out.print(data[i] + " < ");
        }

        System.out.println("END");
    }
}
