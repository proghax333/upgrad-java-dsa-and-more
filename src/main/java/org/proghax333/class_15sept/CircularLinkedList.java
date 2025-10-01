package org.proghax333.class_15sept;

import java.util.Iterator;

class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

public class CircularLinkedList<T> implements Iterable<T> {
    private Node<T> head;

    public CircularLinkedList() {
        this.head = null;
    }

    public boolean add(T data) {
        if(head == null) {
            head = new Node<T>(data);
            head.setNext(head);

            return true;
        }

        Node<T> it = head;

        while(it.getNext() != head) {
            it = it.getNext();
        }

        Node<T> node = new Node<T>(data);
        node.setNext(head);

        it.setNext(node);
        return true;
    }

    public boolean removeAt(int index) {
        if (head == null || index < 0) return false;

        // remove at head
        if (index == 0) {
            if (head.getNext() == head) {
                head = null;
            } else {
                Node<T> it = head;
                while (it.getNext() != head) {
                    it = it.getNext();
                }
                Node<T> newHead = head.getNext();
                it.setNext(newHead);
                head = newHead;
            }
            return true;
        }

        Node<T> it = head.getNext();
        Node<T> prev = head;
        int i = 1;

        while (it != head) {
            if (i == index) {
                prev.setNext(it.getNext());
                return true;
            }
            prev = it;
            it = it.getNext();
            i++;
        }

        return false;
    }

    private Node<T> findBeforeTail() {
        Node<T> it = head;

        if(it == null) {
            return null;
        }

        while(it.getNext().getNext() != head) {
            it = it.getNext();
        }

        return it;
    }

    public void swapHeadAndTail() {
        Node<T> beforeTail = this.findBeforeTail();

        if(head == null || beforeTail == null) {
            return;
        }

        if(head == beforeTail.getNext()) {
            return;
        }

        if(head.getNext() == beforeTail.getNext()) {
            head = beforeTail.getNext();
            return;
        }


        Node<T> tail = beforeTail.getNext();
        beforeTail.setNext(head);

        tail.setNext(head.getNext());
        head.setNext(tail);

        head = tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new CircularLinkedListIterator<T>(this.head);
    }

    static class CircularLinkedListIterator<T> implements Iterator<T> {
        private Node<T> head;
        private Node<T> current;
        private boolean passedHead = false;

        public CircularLinkedListIterator(Node<T> head) {
            this.head = head;
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            if(current == null) {
                return false;
            }

            if(current == head) {
                if(!passedHead) {
                    passedHead = true;
                    return true;
                } else {
                    return false;
                }
            }

            return true;
        }

        @Override
        public T next() {
            T data = current.getData();
            current = current.getNext();

            return data;
        }
    }
}