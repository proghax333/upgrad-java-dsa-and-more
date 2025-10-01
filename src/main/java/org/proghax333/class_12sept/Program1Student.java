package org.proghax333.class_12sept;

import java.util.Arrays;

class Student {
    private String id;
    private String name;
    private double[] marks;

    public Student(String id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}

public class Program1Student {
    public static void main(String[] args) {
        Student atmanand = new Student(
                "1",
                "Atmanand Nagpure",
                new double[] { 70, 80, 90, 80, 80 }
        );

        System.out.println(atmanand);
    }
}
