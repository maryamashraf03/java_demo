package com.maryam.animal;

public class Console {

    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d.talk());
        System.out.println(d.getColor());

        Cat c = new Cat();
        System.out.println(c.talk());
    }
}
