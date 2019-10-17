package com.amine;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    /**
     *
     * @param myNumber
     */
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        // initialiser une liste de tableau (ArrayList) dans le constructeur
        this.myContact = new ArrayList<Contact>();
    }

    /**
     *
     * @param contact
     * @return
     */
    public boolean addNewContact(Contact contact){

        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already onfile");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    /**
     *
     * @param oldContact
     * @param newContact
     * @return
     */

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition =findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found !");
            return false;
        }// si le contact rentre pour le mettre a jour est déja dans la liste
        else if(findContact(newContact.getName() )!= -1){
            System.out.println("Contact with name "+ newContact.getName() + " already exist, update was not successufl");
            return false;
        }
        /**
         * if existe so update it
         */
        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + "was replaced by" + newContact.getName());

        return true;
    }

    /**
     *
     * @param contact
     * @return
     */
    public boolean remove(Contact contact){
        int foundPosition =findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found !");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.printf(contact.getName() + "Was deleted!");
        return true;
    }

    /**
     *
     * @param contact
     * @return
     */
    private int findContact(Contact contact){
        /***
         * retrun l'index ou se trouve le contact detecter
         */
        return this.myContact.indexOf(contact);
    }

    /**
     *
     * @param contactName
     * @return
     */
    private int findContact(String contactName){
        for(int i= 0; i<this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param contact
     * @return
     */
    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
           return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContact.get(position);
        }
        return null;
    }
    /**
     *
     */
    public void printContacts(){
        System.out.println("Contact list");
        for(int i=0; i<this.myContact.size(); i++){
            System.out.printf( i+1 + "." + this.myContact.get(i).getName() + "->" + this.myContact.get(i).getPhoneNumber()+"\n");
        }
    }
}
