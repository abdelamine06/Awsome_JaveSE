package com.amine;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear= 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
        for(int i=0; i<maxGears; i++){
            addGear(i, i*5.3);
        }
    }

    public void operatingClutch(boolean in){
        this.clutchIsIn = in;
    }
    public void addGear(int nbr, double ration){
        if((nbr> 0 ) && (nbr<= maxGears)){
            this.gears.add(new Gear(nbr, ration));
        }
    }
    public void changeGear(int newGear){
        if((newGear>0) && (newGear <= this.gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " is selected");
        }else{
            System.out.println("GRIND!");
            this.currentGear = 0;

        }
    }
    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Screaam!");
            return 0.0;
        }else{
            return revs * gears.get(currentGear).getRation();
        }
    }
    /**
     * ------------------------------------------------------Inner class ----------------------------------------------*
     */
    /**
     * une inner class c'est a dire une classe dans une autre
     * this.gearNbr ici refere a celui de Gear class n'est pas à GearBox bien evidement
     */
    //public
     private class Gear{
        private int gearNbr;
        private double ration;

        public Gear(int gearNbr, double ration) {
            this.gearNbr = gearNbr;
            this.ration = ration;
        }

        public double driveSpeed(int revs){
            return revs *(this.ration);
        }
        public double getRation(){
            return ration;
        }
    }
}
