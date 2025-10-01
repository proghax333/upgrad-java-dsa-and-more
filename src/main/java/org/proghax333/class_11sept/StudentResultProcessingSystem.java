package org.proghax333.class_11sept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public double calculateTotal() {
        double total = 0;

        for(var mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / marks.length;
    }

    public String calculateGrade() {
        double average = calculateAverage();

        if(average >= 80) {
            return "A";
        } else if(average >= 60) {
            return "B";
        } else if(average >= 36) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class StudentResultProcessingSystem {
    static List<Student> calculateToppers(Student[] students) {
        List<Student> toppers = new ArrayList<>();
        double topperAverage = -1;
        for(Student s : students) {
            if(s.calculateGrade().equals("Fail")) {
                continue;
            }

            double average = s.calculateAverage();
            if(average > topperAverage) {
                topperAverage = average;
            }
        }

        if(topperAverage < 0) {
            return toppers;
        }

        for(Student s : students) {
            if(s.calculateAverage() == topperAverage) {
                toppers.add(s);
            }
        }

        return toppers;
    }

    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("1", "Atmanand", new double[] { 70, 80, 70, 80, 70 }),
                new Student("2", "Aditya", new double[] { 70, 80, 70, 80, 70 }),
                new Student("3", "Abhi", new double[] { 60, 80, 70, 80, 70 }),
                new Student("3", "Amarendra", new double[] { 60, 80, 70, 80, 70 }),
                new Student("4", "Akash", new double[] { 60, 80, 80, 80, 70 }),
        };

        for(Student topper : calculateToppers(students)) {
            System.out.println(topper.getName());
        }
    }
}
