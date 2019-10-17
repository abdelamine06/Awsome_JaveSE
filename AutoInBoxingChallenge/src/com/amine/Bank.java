package com.amine;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
            Branch branch = findBranch(branchName);
            if(branch != null){
                return branch.newCustomer(customerName, initialAmount);
            }
            return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaciton (customerName, amount);
        }
        return false;
    }


    private Branch findBranch(String branchName){
        for(int i=0; i< this.branches.size(); i++){
            Branch checkbranch = this.branches.get(i);
            System.out.println(checkbranch);
            if(checkbranch.equals(branchName))
            {
                return checkbranch;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName, boolean showTrans){
        Branch branch = findBranch(branchName);

        if(branch != null){
            System.out.printf("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for(int i=0; i< branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer : " + branchCustomer.getName()     + "[" + (i+1) + "]") ;
                if(showTrans)
                {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j< transactions.size(); i++){
                        System.out.println("[" + (j+1) + "] Amount " +transactions.get(j));

                    }
                }
            }
            return true;
        }else{
            return false;
        }

    }
}
