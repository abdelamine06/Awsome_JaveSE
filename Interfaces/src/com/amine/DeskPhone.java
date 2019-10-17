package com.amine;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }


    @Override
    public void powerOn() {
        System.out.println("\n No action taking , deskPhone not a button power \n");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " in deskphone \n");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.printf("Answering the deskphone \n");
            isRinging = false; // il a déja repondu
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(myNumber == phoneNumber){
            isRinging = true;
            System.out.printf("Ring ring \n");
        }else{
            isRinging = false;
        }
        return isRinging;
    }


    @Override
    public boolean isRining() {
        return isRinging;
    }
}
