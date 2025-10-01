package org.proghax333.class_19sept;

public class ArrayQueue<T> implements MyQueue<T> {
    private T[] data;
    private int size = 0;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.data = (T[]) new Object[capacity];
    }

    @Override
    public void enqueue(T data) {
        if(isFull()) {
            throw new RuntimeException("The queue is full.");
        }

        this.data[size] = data;
        ++size;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("The queue is empty.");
        }

        T item = data[0];
        for(int i = 1; i < size; ++i) {
            data[i - 1] = data[i];
        }
        --size;

        return item;
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new RuntimeException("The queue is empty.");
        }

        return data[0];
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
        return size == capacity;
    }

    @Override
    public void display() {
        for(int i = 0; i < size; ++i) {
            System.out.print(data[i] + " < ");
        }

        System.out.println("END");
    }
}
