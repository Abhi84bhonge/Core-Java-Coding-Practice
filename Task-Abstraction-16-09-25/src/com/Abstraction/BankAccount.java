package com.Abstraction;

public abstract class BankAccount {

	 protected String accountNumber;
	 protected String accountHolderName;
     protected double balance;
     
    public BankAccount(String accountNumber,String accountHolderName,double balance) {
    	this.accountNumber=accountNumber;
    	this.accountHolderName=accountHolderName;
    	this.balance=balance;
    }
    
    
    abstract void getAccountNumber();
     
     abstract void getAccountHolderName();
     
     abstract void getBalance();
     
     abstract void deposit(double amount);
    	 
     abstract void withdraw(double amount);
}
