package org.proghax333.class_09sept;

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println(
                "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'
        );
    }
}

public class PersonProgram {
    public static void main(String[] args) {
        Person person1 = new Person("Jane Doe", 25);
        person1.displayDetails();

        Person person2 = new Person("Jack Doe", 24);
        person2.displayDetails();
    }
}
