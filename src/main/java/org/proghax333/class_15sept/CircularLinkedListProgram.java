package org.proghax333.class_15sept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CircularLinkedListProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        String choice = "";

        while(true) {
            System.out.println("[Circular Linked List Manager]\n" +
                    "1. Add\n" +
                    "2. Remove At\n" +
                    "3. Print list\n" +
                    "4. Exit\n");

            System.out.print("> ");
            choice = sc.nextLine();

            if(choice.equals("1")) {
                System.out.print("Enter the element: ");
                int x = Integer.parseInt(sc.nextLine());

                if(list.add(x)) {
                    System.out.println(x + " added to the list.");
                } else {
                    System.out.println("Could not add the element.");
                }
            } else if(choice.equals("2")) {
                System.out.println("Enter the index of the element: ");
                int index = Integer.parseInt(sc.nextLine());

                if(list.removeAt(index)) {
                    System.out.println("Removed element successfully.");
                } else {
                    System.out.println("Could not remove the element.");
                }
            } else if(choice.equals("3")) {
                System.out.println();
                int index = 0;
                for(int x : list) {
                    System.out.println(index + ") " + x);
                    ++index;
                }

                System.out.println("-------------");
            } else if(choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice.\n");
            }
        }
    }
}
