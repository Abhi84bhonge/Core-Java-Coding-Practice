


package com.BankManagementSystem;

public class SavingsAccount extends Account {
	private int withdrawinthisMonth;
	private int withdrawlimit = 3;

	public SavingsAccount() {
		super();
		withdrawinthisMonth = 0;
	}

	public SavingsAccount(String accountholder, String accountnumber, double balance, String accountType) {
		super(accountholder, accountnumber, Account.getBalance());
		this.withdrawinthisMonth = 0;

		System.out.println("---------->>>>Account Type " + accountType + "<<<<<<------------- ");
		displayAccountInfo();
		System.out.println("==================================================================");
	
	}

	@Override
	public void withdraw(double amount, String transactionType) {

		double minimumBalance = Account.getBalance() - 500;
		if (minimumBalance > 500) {
			System.out.println("Amount you want to withdraw " + amount);
			if (amount % 100 == 0) {

				if (this.withdrawinthisMonth < withdrawlimit) {

					if (amount <= getBalance()) {
						this.withdrawinthisMonth++;
						System.out.println("Transaction Type " + transactionType);
						System.out.println("Withdraw Amount " + amount);
						System.out.println("Withdraw Remain " + (withdrawlimit - this.withdrawinthisMonth));

						Account.setBalance(getBalance() - amount);

						System.out.println("Withdraw this month " + withdrawinthisMonth);
						System.out.println("!!!!Withdraw successfully!!!!  \n");
						displayAccountInfo();
						System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					} else {
						System.out.println("Insufficient Balance ");
					}

				} else {
					System.out.println("!!! Withdraw limit is reached !!!!");
				}

			} else {
				System.out.println("!!! Invalid Amount !!!");
			}
		} else {
			System.out.println("!!!!!Add Amount for Withdrawal!!!!");
		}
	}

}
