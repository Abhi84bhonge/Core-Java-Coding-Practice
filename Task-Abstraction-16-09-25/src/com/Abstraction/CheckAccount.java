package com.Abstraction;

public class CheckAccount extends BankAccount{
     protected static int  overdraftlimit;
     
	CheckAccount(String accountNumber,String accountHolderName,double balance,int overdraftlimit){
		super(accountNumber,accountHolderName,balance);
		CheckAccount.overdraftlimit=overdraftlimit;
	}
	
	@Override
	public void getAccountNumber() {
		System.out.println("The AccountNumber  "+accountNumber);
	}
	
	@Override
    public void getAccountHolderName() {
        System.out.println("Account Holder: " + accountHolderName);
    }

    @Override
    public void getBalance() {
        System.out.println("Balance: Rs. " + balance);
    }
    
    @Override
    public void deposit(double amount) {
    	if(amount>0) {
    		this.balance+=amount;
    		System.out.println("Deposti Amount RS."+amount);
    		System.out.println("After deposit Available Balance RS. "+this.balance);
    	}
    	else {
    		System.out.println("Sorry Invalid Amount Entered RS. "+amount);
    	}
    }
    
    @Override
    public void withdraw(double amount) {
    	
    	if(CheckAccount.overdraftlimit+balance>=amount) {
    		this.balance-=amount;
    		System.out.println("Withdraw Amount RS. "+amount);
    		System.out.println("After Withdraw Available Balance RS."+this.balance);
    	}
    	else {
    		System.out.println("Sorry!! Overdraft limit Reached RS."+CheckAccount.overdraftlimit);
    	}
    }
}
