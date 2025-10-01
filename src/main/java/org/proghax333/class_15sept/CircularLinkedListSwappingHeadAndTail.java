package org.proghax333.class_15sept;

public class CircularLinkedListSwappingHeadAndTail {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.swapHeadAndTail();

        for(int x : list) {
            System.out.println(x);
        }

        System.out.println("----");

        // 30 20 10 100 200

        list.add(100);
        list.add(200);

        list.swapHeadAndTail();

        for(int x : list) {
            System.out.println(x);
        }

        System.out.println("----");
    }
}
