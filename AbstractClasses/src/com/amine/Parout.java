package com.amine;

public class Parout extends Bird {
    public Parout(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
