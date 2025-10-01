package org.proghax333.class_19sept;

public interface MyQueue<T> extends IDisplay {
    void enqueue(T data);
    T dequeue();
    T peek();

    int size();

    boolean isEmpty();
    boolean isFull();
}
