package com.maryam.animal;

public class Cat extends Animal {

    @Override
    public String getColor() {
        return "brown";
    }

    @Override
    public String talk() {
        return "meow meow";
    }
}
