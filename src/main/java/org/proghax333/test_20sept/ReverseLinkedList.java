package org.proghax333.test_20sept;

import org.proghax333.class_19sept.IDisplay;

interface MyLinkedList<T> extends IDisplay {
    void insertFront(T data);
    T removeFront();

    void reverse();
}

class TheNode<T> {
    T data;
    TheNode<T> next;

    public TheNode(T data) {
        this.data = data;
    }

    public TheNode(T data, TheNode<T> next) {
        this.data = data;
        this.next = next;
    }
}

class TheLinkedList<T> implements MyLinkedList<T> {
    protected TheNode<T> head;

    public TheLinkedList() {
        head = null;
    }

    @Override
    public void insertFront(T data) {
        head = new TheNode<>(data, head);
    }

    @Override
    public T removeFront() {
        if(head == null) {
            throw new RuntimeException("List is empty.");
        }

        T data = head.data;
        head = head.next;

        return data;
    }

    @Override
    public void display() {
        TheNode<T> it = head;

        while(it != null) {
            System.out.print(it.data + " -> ");
            it = it.next;
        }

        System.out.println("X");
    }

    @Override
    public void reverse() {
        if(head == null) {
            return;
        }

        TheNode<T> front = head, it = head.next;

        while(it != null) {
            TheNode<T> temp = it.next;
            it.next = front;
            front = it;
            it = temp;
        }

        head.next = null;
        head = front;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new TheLinkedList<>();

        list.insertFront(40);
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);

        System.out.println("Before reversing:");
        list.display();

        list.reverse();
        System.out.println("After reversing: ");
        list.display();
    }
}
