package com.amine;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf(getName() + " is eating! \n");
    }

    @Override
    public void breathe() {
        System.out.printf("breathe in, breathOut! \n");
    }
}
