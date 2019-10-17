package com.amine;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }


    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powerd up !");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing " + phoneNumber + " in deskphone");
        }else{
            System.out.printf("Mobile phone is swiched off");
        }

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.printf("Answering the Mobile phone");
            isRinging = false; // il a déja repondu
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(myNumber == phoneNumber && isOn){
            isRinging = true;
            System.out.printf("Melody ring");
        }else{
            System.out.printf("Mobile phone is not On or nbr different");
            isRinging = false;
        }
        return isRinging;
    }


    @Override
    public boolean isRining() {
        return isRinging;
    }
}
