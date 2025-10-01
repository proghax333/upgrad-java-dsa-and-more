package org.proghax333.class_19sept;

public interface MyStack<T> extends IDisplay {
    void push(T data);
    T pop();
    T peek();

    boolean isFull();
    boolean isEmpty();

    int size();

}
