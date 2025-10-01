package org.proghax333.class_25sept;

import java.util.HashSet;
import java.util.Set;

interface Copyable<T> {
    T copy();
}

class Person implements Copyable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Person copy() {
        Person p = new Person(name, age);
        return p;
    }
}

public class HashSetDeepCopy {
    static <T> Set<T> hashSetDeepCopy(Set<? extends Copyable<T>> set) {
        HashSet<T> copySet = new HashSet<>();

        for(var x : set) {
            copySet.add(x.copy());
        }

        return copySet;
    }

    public static void main(String[] args) {
        Person aditya = new Person("Aditya", 25);
        Person atmanand = new Person("Atmanand", 25);
        Person sameer = new Person("Sameer", 25);

        Set<Person> people = new HashSet<>();

        people.add(aditya);
        people.add(atmanand);
        people.add(sameer);

        Set<Person> cloned = hashSetDeepCopy(people);

        Person sameerCopy = null;
        for(Person it : cloned) {
            if(it.getName().equals("Sameer")) {
                sameerCopy = it;
                break;
            }
        }

        if(sameerCopy != null) {
            sameerCopy.setName("Sameer Copy Modified");

            System.out.println("Sameer's name: " + sameer.getName());
            System.out.println("Sameer's copy's name: " + sameerCopy.getName());
        }
    }
}
