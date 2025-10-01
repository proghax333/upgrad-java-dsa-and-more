package org.proghax333.class_19sept;

import javax.management.RuntimeMBeanException;

class StackNode<T> {
    T data;
    StackNode<T> next;

    public StackNode(T data) {
        this.data = data;
    }

    public StackNode(T data, StackNode<T> next) {
        this.data = data;
        this.next = next;
    }
}

public class DynamicStack<T> implements MyStack<T> {
    private StackNode<T> top = null;
    private int size = 0;

    public DynamicStack() { }

    @Override
    public void push(T data) {
        if(top == null) {
            top = new StackNode<>(data);
            size = 1;
            return;
        }

        StackNode<T> node = new StackNode<>(data);
        node.next = top;
        top = node;
        ++size;
    }

    @Override
    public T pop() {
        if(top == null) {
            throw new RuntimeException("Stack is empty.");
        }
        T data = top.data;
        top = top.next;
        --size;
        return data;
    }

    @Override
    public T peek() {
        if(top == null) {
            throw new RuntimeException("Stack is empty.");
        }

        return top.data;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        StackNode<T> it = top;

        while(it != null) {
            System.out.print(it.data + " < ");
            it = it.next;
        }

        System.out.println("END");
    }
}
