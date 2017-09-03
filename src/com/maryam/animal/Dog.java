package com.maryam.animal;

public class Dog extends Animal{

    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public String talk() {
        return "bow bow";
    }
}
