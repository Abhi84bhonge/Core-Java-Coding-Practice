package com.Interface;

public abstract class Employee {

	   String name;
	  protected int paymentPerHour;
	  
	  Employee(String name,int paymentPerHour){
		  this.name=name;
		  this.paymentPerHour=paymentPerHour;
	  }
	  
	public abstract int calculateSalary();
}