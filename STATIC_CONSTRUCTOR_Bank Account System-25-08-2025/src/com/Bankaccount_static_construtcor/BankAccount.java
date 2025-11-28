package com.Bankaccount_static_construtcor;

import java.util.Random;
import java.util.Scanner;
public class BankAccount {

	String accountHolder;
	String password;
	double balance;
	static double totalBalance;
	

	public BankAccount(String accountHolder, String password, double balance) {
     
		if ("Abhijeet".equals(accountHolder) && "ddfe3".equals(password)) {
			 Random random = new Random();
		       long randomOtp = 100000 + random.nextLong(900000); 
		        System.out.println("\t\tYour OTP is: " + randomOtp);
              System.out.println("\t\t------------------------------------------");
		        System.out.println("\t\tEnter the OTP you receive");
		       
		        Scanner sc=new Scanner(System.in);
            long usrOtp=sc.nextLong();
      
				 
				if(usrOtp==randomOtp) {
			this.password = password;
			this.accountHolder = accountHolder;
			this.balance = balance;
			BankAccount.totalBalance = BankAccount.totalBalance + balance;
			}
				else {
					System.err.println("\t\tSorry You Entered Wrong OTP  !!!!");
				}
			
		} else {
			System.err.println("\t\tSorry Your Account not Found in OUR SBI BANK !!!");
			System.out.println("\t\t_________________________________________");
		}
	}

	   
		

	

	void Depostimoney(double addmoney) {
		System.out.println("\t\t__________________________________________");
		System.out.println("\t\tAfter add money RS." + addmoney);
		this.balance = this.balance + addmoney;
		BankAccount.totalBalance = BankAccount.totalBalance + addmoney;
		System.out.println("\t\t___________________________________________");
	}

	void Withdrawmoney(double removemoney) {
		if (balance > removemoney) {
			System.out.println("\t\t__________________________________________");
			System.out.println("\t\tafter remove money RS." + removemoney);
			this.balance = balance - removemoney;
			BankAccount.totalBalance = BankAccount.totalBalance - removemoney;
		} else {
			System.out.println("\t\t______________________________________");
			System.out.println("\t\tYou have not enough balance!!!");
		}
		System.out.println("\t\t__________________________________________");
	}

	void Display() {

		System.out.println("\t\tAccount Holder Name:- " + this.accountHolder);
		System.out.println("\t\tBalance RS.:- " + this.balance);
	}
}
