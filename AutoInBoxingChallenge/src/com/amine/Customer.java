package com.amine;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addCustomerTransaciton(initialAmount);
    }
    public void addCustomerTransaciton(double amount){
        this.transactions.add(amount);
    }
}
