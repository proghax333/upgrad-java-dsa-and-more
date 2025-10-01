package org.proghax333.et1_28sept;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTotalSalary() {
        return this.salary;
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getTotalSalary() {
        return this.getSalary() + this.bonus;
    }
}

class Developer extends Employee {
    double overtimePay;

    public Developer(int id, String name, double salary, double overtimePay) {
        super(id, name, salary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double getTotalSalary() {
        return this.getSalary() + this.overtimePay;
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "emp", 100);
        Employee e2 = new Manager(2, "manager", 1000, 100);
        Employee e3 = new Developer(3, "developer", 200, 10);

        System.out.println("Employee salary: " + e1.getTotalSalary());
        System.out.println("Manager salary: " + e2.getTotalSalary());
        System.out.println("Developer salary: " + e3.getTotalSalary());

        int[] arr = new int[10];

        int x = arr.length;
        System.out.println(x);
    }
}
