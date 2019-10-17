package com.amine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Customer customer = new Customer("amine", 23.3);
	Customer anotherCustomer;
	anotherCustomer = customer;
	anotherCustomer.setBalance(12.3);
	System.out.println("Balance for customer " + customer.getName() + " is "  + customer.getBalance() );

	ArrayList<Integer> intList = new ArrayList<Integer>();
	intList.add(1);
	intList.add(4);
	intList.add(12);
	for(int i = 0; i< intList.size(); i++)
	{
		System.out.printf( i +"==>" + intList.get(i) +"\n");
	}

	intList.add(1,2);

	for(int i=0; i<intList.size(); i++){
		System.out.printf( i +"==>" + intList.get(i) +"\n");
	}

    }
}
