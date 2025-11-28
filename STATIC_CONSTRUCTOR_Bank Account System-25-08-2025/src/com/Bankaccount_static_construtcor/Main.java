package com.Bankaccount_static_construtcor;


public class Main {

	public static void main(String[] args) {
		System.out.println("\t\t------<<<Welcome to Our SBI Bank>>>-----\n");
		
		BankAccount BnkAcc1 = new BankAccount("Abhijeet", "ddfe3", 30000.00);
		
		
	     System.out.println("\t\t-----------------------------");
		BnkAcc1.Display();
		
		

		System.out.println("\t\t_________________________________________");
		System.out.println("\t\tthe total balance is RS." + BankAccount.totalBalance);
		System.out.println("\t\t_________________________________________");
	}
}
