package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {

        locations.put(0, new Location(0, "amine\n"));
        locations.put(1, new Location(1, "mimo\n"));
        locations.put(2, new Location(2, "lamine\n"));
        locations.put(3, new Location(3, "abdel\n"));

        int loc = 1;
        while (true)
        {
            System.out.printf(locations.get(loc).getDescription());
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
