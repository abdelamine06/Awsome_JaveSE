package com.amine;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNbr= 0;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0,0);
        this.gears.add(neutral);

    }
    public class Gear{
        private int gearNbr;
        private double ration;

        public Gear(int gearNbr, double ration) {
            this.gearNbr = gearNbr;
            this.ration = ration;
        }
        public double driveSpeed(int revs){
            return ;
        }
    }
}
