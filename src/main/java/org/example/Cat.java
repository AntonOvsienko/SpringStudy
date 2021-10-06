package org.example;

public class Cat implements Pets{

    public Cat (){
        System.out.println("Создаём кошку");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
