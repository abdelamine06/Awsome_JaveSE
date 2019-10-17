package com.amine;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone  mobilePhone = new MobilePhone("0676554212");

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean quit= false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter action: (6 to show available actions:)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shuting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                case 6:
                    printActions();
                    break;
            }
        }
    }



    /**
     *
     */
    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    /**
     *
     */
    private static void printActions(){
        System.out.printf("\n Available actions:\n Press \n");
        System.out.printf(" 0 - To shutdown \n"+
                          " 1 - To print contacts \n"+
                          " 2 - To add a new contact\n"+
                          " 3 - To update existing an existing contact\n" +
                          " 4 - To remove an existing contact \n" +
                          " 5 - Query if an existing contact exists\n" +
                          " 6 - To print a list of available actions \n");
        System.out.println("Choose your Action: ");

    }

    /**
     *
     */
    private static void addNewContact(){
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter a new phoneNumber");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact added name = " + name + " phone=" + phoneNumber);
        }else{
            System.out.println("Cannot add " + name + "already on file");
        }
    }

    /**
     *
     */
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found !");
            return;
        }
        System.out.println("Enter the new name contact");
        String newName = scanner.nextLine();
        System.out.println("Enter the new contact phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, phoneNumber);
        if( mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfuly updating record !");
        }else{
            System.out.println("Error updating record !");
        }
    }

    /**
     *
     */
    private static void removeContact(){
        System.out.println("Enter contact name to remove");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact does not exist !");
        }
        if(mobilePhone.remove(existingContactRecord)){
            System.out.printf("Successufly deleted! ");
        }else{
            System.out.println("Error deleting !");
        }

    }

    private static void queryContact(){
        System.out.println("Enter contact name to remove");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact does not exist !");
        }
        System.out.println("Name = " + existingContactRecord.getName() + " phoneNumber= " + existingContactRecord.getPhoneNumber());
    }
}
