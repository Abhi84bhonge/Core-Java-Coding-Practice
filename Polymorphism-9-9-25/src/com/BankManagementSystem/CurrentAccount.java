package com.BankManagementSystem;

public class CurrentAccount extends Account {

	private double overdraftlimit;
	static String accountType;

	public CurrentAccount() {
		super();

	}

	public CurrentAccount(String accountHolder, String accountNumber, double balance, double overdraftlimit,
			String accountType) {
		super(accountHolder, accountNumber, Account.getBalance());
		this.overdraftlimit = overdraftlimit;

		System.out.println("---------->>>>Account Type " + accountType + "<<<<<<------------- ");
		displayAccountInfo();
		System.out.println("==================================================================");
	}

	@Override
	public void withdraw(double amount) {
	    System.out.println("Transaction Type Withdraw");
	    System.out.println("Withdraw Amount RS." + amount);

	    double newBalance = Account.getBalance() - amount;

	   
	    if (newBalance <= -this.overdraftlimit) { 
	        System.out.println(" Transaction Declined! Overdraft limit of RS. " + this.overdraftlimit + " exceeded.");
	    } else {
	        Account.setBalance(newBalance);

	        if (Account.getBalance() < 0) {
	            System.out.println(" Overdraft in use! Current Balance: RS. " + Account.getBalance());
	        } else {
	            System.out.println("Withdrawal Successful, Balance: RS. " + Account.getBalance());
	        }

	        displayAccountInfo();
	        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	    }
	}

	}

