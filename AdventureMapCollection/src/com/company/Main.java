package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//adeventure challenge pas encore fait vidéo 8 collections

public class Main {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {

        locations.put(0, new Location(0, "You are seeting in the front of a computer learning\n"));
        locations.put(1, new Location(1, "You are standing at the end of round\n"));
        locations.put(2, new Location(2, "You are at the top of hill\n"));
        locations.put(3, new Location(3, "You are inside of building\n"));
        locations.put(4, new Location(4, "You are in vally beside \n"));
        locations.put(5, new Location(5, "You are in the forest\n"));

        locations.get(1).addExits("W",2);
        locations.get(1).addExits("E",3);
        locations.get(1).addExits("S",4);
        locations.get(1).addExits("N",5);
        locations.get(1).addExits("Q",0);


        locations.get(2).addExits("N",5);
        locations.get(2).addExits("Q",0);

        locations.get(3).addExits("W",1);
        locations.get(3).addExits("Q",0);

        locations.get(4).addExits("N",1);
        locations.get(4).addExits("W",2);
        locations.get(4).addExits("Q",0);

        locations.get(5).addExits("S",1);
        locations.get(5).addExits("W",2);
        locations.get(5).addExits("Q",0);



        int loc = 1;
        while (true)
        {
            Map<String, Integer> exists = locations.get(loc).getExits();
            System.out.println("Available exits ");
            System.out.print(locations.get(loc).getDescription());
            for(String exist: exists.keySet())
            {
                System.out.println(exist + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if(exists.containsKey(direction))
            {
                loc = exists.get(direction);
            }else{
                System.out.println("You can not go in that direction");
            }
            loc = scanner.nextInt();
            if(!locations.containsKey(loc)){
                System.out.println("We can not go in to the direction");
            }
            if(loc==0)
            {
                break;
            }
        }



    }
}
