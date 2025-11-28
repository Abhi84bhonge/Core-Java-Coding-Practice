package com.LibraryItemsOOPs;

public class DVD extends LibraryItem{

	protected int durationDVD;
protected static boolean isavailable=true;
	
	protected void borrowDVD(String title) {
		
		if(isavailable==false) {
			System.out.println("DVD not borrow !!");
			System.out.println("_____________________________");
		}
		else {
			displayInfo();
			isavailable=false;
		System.out.println("DVD Borrow Successfully  ");
		System.out.println("_________________________________");
	}
	}
	
	protected void returnDVD(String title) {
		displayInfo();
		isavailable=true;
		System.out.println("DVD Return Successfully ");
		System.out.println("___________________________________");
	}
	
	
	@Override
	protected void displayInfo() {
		System.out.println("DVD title "+super.gettitle());
		System.out.println("DVD ID "+super.getitemID());
		 System.out.println("DVD Duration of Time "+this.durationDVD+" second");
		
	}
}
