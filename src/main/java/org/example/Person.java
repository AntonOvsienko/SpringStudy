package org.example;

public class Person {
    Pets pet;

    Person (Pets pet){
        System.out.println("Создаём человека");
        this.pet=pet;
    }

    public void say(){
        System.out.println("Привет дружок");
        pet.say();
    }
}
