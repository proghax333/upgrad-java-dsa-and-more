package org.proghax333.practice_12nov;

import java.util.LinkedList;

interface Classroom {
    void show();
}

class ScienceClassroom implements Classroom {
    @Override
    public void show() {
        System.out.println("This is a science classroom!");
    }
}


class MathClassroom implements Classroom {
    @Override
    public void show() {
        System.out.println("This is a math classroom!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Classroom science1 = new ScienceClassroom();
        Classroom math1 = new MathClassroom();

        LinkedList<Integer> x = null;

        x.listIterator();

        science1.show();
        math1.show();
    }
}
