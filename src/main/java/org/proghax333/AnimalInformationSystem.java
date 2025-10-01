package org.proghax333;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private Integer id;
    private String name;
    private Double age;
    private String type;

    public Animal(Integer id, String name, Double age, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}

public class AnimalInformationSystem {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal(1, "Bruno", 10D, "Dog -> Bulldog"));
        animalList.add(new Animal(2, "Bessie", 10D, "Cow -> Devon Cow"));
        animalList.add(new Animal(3, "Brad", 10D, "Monkey -> Gorilla"));

        for(Animal animal : animalList) {
            System.out.println(animal);
        }
    }
}
