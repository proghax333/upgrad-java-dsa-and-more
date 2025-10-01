package org.proghax333.class_15sept;

public class LinkedListProgram {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        list.insert(10);
        list.insert(92);
        list.insert(100);

        // 100 92 10

        System.out.println("Find 10: " + list.find(10));
        System.out.println("Find 92: " + list.find(92));


//
//        CustomLinkedList<Integer> list2 = new CustomLinkedList<>();
//        list2.insert(40);
//        list2.insert(30);
//        list2.insert(20);
//        list2.insert(10);
//
//        // 10 20 30 40
//
//        System.out.println(list2.midpoint());
//
//        list2.insert(300);
//        list2.insert(200);
//        list2.insert(100);
//
//        // 100 200 300 10 20 30 40
//
//        System.out.println(list2.midpoint());
    }
}
