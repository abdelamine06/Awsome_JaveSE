package com.amine;

public class Main {

    public static void main(String[] args) {
	Gearbox amineGearBox  = new Gearbox(6);
        /**
         * l'instanciation d'une inner class est un peu particulier voyons voir!
         */
	Gearbox.Gear gearInnerClass = amineGearBox.new Gear(6, 3.4);
        //Gearbox.Gear second = new Gearbox.Gear(6,3.2);
        //Gearbox.Gear third = new gearInnerClass.Gear(6,3.2);
        System.out.println(gearInnerClass.driveSpeed(1000));
    }
}
