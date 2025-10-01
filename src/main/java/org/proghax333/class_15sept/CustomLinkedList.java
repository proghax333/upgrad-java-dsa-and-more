package org.proghax333.class_15sept;

public class CustomLinkedList<T> {
    public static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    Node<T> head;

    public boolean insert(T data) {
        Node<T> node = new Node<>(data);
        node.next = head;
        head = node;

        return true;
    }

    public boolean insert(T data, int index) {
        if(index == 0) {
            return insert(data);
        }

        int i = 0;
        Node<T> prev = null;
        Node<T> it = head;

        while(i < index) {
            if(it == null) {
                return false;
            }

            prev = it;
            it = it.next;

            ++i;
        }

        if(it == null || prev == null) {
            return false;
        }
        Node<T> node = new Node<>(data);
        node.next = prev.next;
        prev.next = node;

        return true;
    }

    public int find(T data) {
        Node<T> it = head;

        int index = 0;

        while(it != null) {
            if(it.data == data) {
                return index;
            }

            it = it.next;
            ++index;
        }

        return -1;
    }

    public T midpoint() {
        Node<T> slow = head, fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow != null) {
            return slow.data;
        }

        return null;
    }
}
