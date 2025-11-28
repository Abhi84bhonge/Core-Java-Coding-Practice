package com.Interface;
import java.util.Scanner;
public class Contracter extends Employee {
      protected int workingHours;
      
	Contracter(String name,int paymentperHours,int workingHours){
		super(name,paymentperHours);
		this.workingHours=workingHours;
	}
	
	
	@Override
	public int calculateSalary() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter how many days employee work :- ");
			int days=sc.nextInt();
			System.out.println("Contracter Name "+this.name);
			System.out.println("Working hours "+this.workingHours);
			int salary=(this.paymentPerHour * this.workingHours)*days;
			 return salary;
		}
		
	}
	
	
}
