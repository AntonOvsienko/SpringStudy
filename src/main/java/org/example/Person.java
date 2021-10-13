package org.example;

public class Person {
    private Pets pet;
    private String name;
    private int age;

    Person(){
    }

    Person (Pets pet){
        this.pet=pet;
    }

    public void say(){
        System.out.println("Привет дружок");
        pet.say();
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
