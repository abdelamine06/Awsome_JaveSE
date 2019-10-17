package com.amine;


/***
 *  a revoir tout ça parceque ça compile pas
 */
public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("National bank algerie");
	bank.addBranch("branch");
	bank.addCustomer("branch","Amine" , 50);
	bank.addCustomer("branch", "mimo", 40);
	bank.addCustomer("branch", "lamine", 20);


    bank.listCustomer("branch", false);

    }
}
