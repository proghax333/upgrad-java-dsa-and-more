package org.proghax333.practice_12nov;

class Employee {
    private int id;
    private String name;
    private String department;
    private String password;

    public Employee(int id, String name, String department, String password) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}

public class EncapsulationProgram {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Atmanand", "CSE", "1234");


        System.out.println("ID: " + employee1.getId());

        System.out.println(employee1.checkPassword("badpass"));
        System.out.println(employee1.checkPassword("1234"));
    }
}
