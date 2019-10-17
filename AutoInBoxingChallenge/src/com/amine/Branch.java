package com.amine;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customer;

    public ArrayList<Customer> getCustomers() {
        return customer;
    }

    public String  getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>()  ;
    }

    public boolean newCustomer(String customerName, double initialAmount)
    {
        if(findCustomer(customerName) == null)
        {
            this.customer.add(new Customer(customerName, initialAmount));
            return true;
        }else{
            return false;
        }
    }

    public boolean addTransaciton(String customerName, double initialAmount){
        Customer existingCustomer = findCustomer(customerName);
        // check if customer exist to add a initial amount to his Acount
        if(existingCustomer != null){
            existingCustomer.addCustomerTransaciton(initialAmount);
            return true;
        }else {
            return false;
        }
    }
        private Customer findCustomer(String name){
        for(int i=0; i<= this.customer.size(); i++){
            Customer checkCustomer = this.customer.get(i);
            System.out.println(checkCustomer);
            if(checkCustomer.equals(name))
            {
                return checkCustomer;
            }
           }
        return null;
        }
}
