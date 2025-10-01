package org.proghax333.class_15sept;

import java.util.Iterator;

class DoublyLinkedNode<T> {
    public T data;
    public DoublyLinkedNode<T> prev, next;

    public DoublyLinkedNode(T data) {
        this.data = data;
    }

    public DoublyLinkedNode(T data, DoublyLinkedNode<T> prev, DoublyLinkedNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class DoublyLinkedList<T> implements Iterable<T> {
    private DoublyLinkedNode<T> head, tail;

    public void insertFront(T data) {
        DoublyLinkedNode<T> node = new DoublyLinkedNode<>(data);

        if(head == null) {
            head = node;
            tail = head;

            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    public void insertBack(T data) {
        DoublyLinkedNode<T> node = new DoublyLinkedNode<>(data);

        if(head == null) {
            head = node;
            tail = head;

            return;
        }

        node.prev = tail;
        tail.next = node;
        tail = node;
    }

    public int length() {
        var it = head;

        int size = 0;

        while(it != null) {
            ++size;
            it = it.next;
        }

        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator<>(head);
    }

    static class DoublyLinkedListIterator<T> implements Iterator<T> {
        DoublyLinkedNode<T> it;

        public DoublyLinkedListIterator(DoublyLinkedNode<T> head) {
            it = head;
        }

        @Override
        public boolean hasNext() {
            return it != null;
        }

        @Override
        public T next() {
            T data = it.data;
            it = it.next;

            return data;
        }
    }
}

