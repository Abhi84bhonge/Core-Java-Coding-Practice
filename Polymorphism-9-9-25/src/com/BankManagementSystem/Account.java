package com.BankManagementSystem;

public class Account {

	private String accountNumber;
	private String accountHolder;
	private static double balance;
	private  Card card;

	Account() {
        this.accountHolder="";
        this.accountNumber="";
		
	}

	Account(String accountholder, String accountnumber, double balance) {

			this.accountHolder = accountholder;
			this.accountNumber = accountnumber;
			Account.setBalance(balance);

	}

	

//	 deposit method

	public static void deposit(double amount) {

		if (amount > 0) {

			Account.setBalance(Account.getBalance() + amount);
			System.out.println("Deposited Amount RS. " + amount);
			System.out.println("Available Balance RS. " + Account.getBalance());

		} else {
			System.out.println("Invalid deposit amount");

		}
	}

//	 deposit method

//	current account method
	public  void withdraw(double amount) {

		if (amount <= Account.getBalance()) {
			Account.setBalance(Account.getBalance() - amount);

		} else {
			System.out.println("Insufficient Balance");
		}
	}

//	saving account method
	public void withdraw(double amount, String accountType) {

		if (amount <= getBalance()) {

			setBalance(getBalance() - amount);
			System.out.println("After withdraw balance " + getBalance());

		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void displayAccountInfo() {
		
		System.out.println("Account Holder Name " + accountHolder);
		System.out.println("Account Number " + accountNumber);
		System.out.println("Available Balance RS. " + Account.getBalance());
		
	}
	

	public static double setBalance(double balance) {
		Account.balance = balance;
		return Account.balance;
	}

	public static double getBalance() {
		return Account.balance;
	}

	public void setCard(Card card) {
		this.card=card;
	}
	
	public void withdraw(long cardNumber,int cvv,long otp) {
		if(this.card==null) {
			System.out.println("No card is linked With this Account!!");
		 return;
		}
		if(this.card.getCardNumber()==card.getCardNumber()&&this.card.getCvv()==card.getCvv()&&this.card.getOtp()==card.getOtp()) {
			
		}
	}

//	Main Method 
	public static void main(String[] args) {
		System.out.println("|______________________________________________|");
		System.out.println("| ------->>>>State Bank of India<<<<<--------- |");
		System.out.println("|______________________________________________|");

  	Account acc = new CurrentAccount("abhijeet", "SBI34343", CurrentAccount.setBalance(1000), 10000, "Current Account");
//  	CurrentAccount.deposit(1000);
		acc.withdraw(9000);
//
//		CurrentAccount.deposit(8000);
//
//		CurrentAccount.deposit(2000);

		Account acc1 = new SavingsAccount("Sadanand", "SBI900000", SavingsAccount.setBalance(500), "Saving Account");
  
//         Account.deposit(1000);
//         acc1.withdraw(100, null);
//        

	}
}