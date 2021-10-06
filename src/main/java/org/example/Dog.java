package org.example;

public class Dog implements Pets{

    public Dog (){
        System.out.println("Создаём собаку");
    }
    @Override
    public void say() {
        System.out.println("Гав-гав");
    }
}
