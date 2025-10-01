package org.proghax333.class_12sept;

class Greeting {
    public String sayHello() {
        return "Hello!";
    }

    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

    public String sayHello(String name, int age) {
        return "Hello, " + name + "! Your age is " + age + ".";
    }
}

public class Program10Greeting {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        System.out.println("greeting(): " + greeting.sayHello());
        System.out.println("greeting(name): " + greeting.sayHello("Atmanand"));
        System.out.println("greeting(name, age): " + greeting.sayHello("Aditya", 30));
    }
}
