package com.amine;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Player tim = new Player("amine", 20, 15);
        System.out.println(tim.toString());
        saveObject(tim);
        ISaveable amine = new Monster("amine", 10,15);
        System.out.println( ((Monster) amine).getStrength()); // caster l'objet de la classe or do directly Monster amine = new Monster() et faire amine.getStrength()
         // System.out.println(amine);
        saveObject(amine);
    }


    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner= new Scanner(System.in);
        boolean quit = false;
        int index=0;
        System.out.println("Choose \n" + "1- To enter a String\n"+"O- To quit\n");
        while (!quit){
            System.out.println("choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string :");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave)
    {
        for(int i=0; i< objectToSave.write().size(); i++)
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(ISaveable objetToLoad)
    {
        List<String> values = readValues();
        objetToLoad.read(values);
    }
}
