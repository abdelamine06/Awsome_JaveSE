package com.amine;

public class Gearbox {

    private boolean clushIsIn;
    public void operateClush(String InOrOut){
        this.clushIsIn = InOrOut.equalsIgnoreCase("in"); 
    }
}
