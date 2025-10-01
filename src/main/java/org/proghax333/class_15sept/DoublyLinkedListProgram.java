package org.proghax333.class_15sept;

public class DoublyLinkedListProgram {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.insertFront(100);
        list.insertFront(50);
        list.insertBack(200);
        list.insertBack(300);

        for(int x : list) {
            System.out.println(x);
        }

        System.out.println("Length of the list = " + list.length());
    }
}
