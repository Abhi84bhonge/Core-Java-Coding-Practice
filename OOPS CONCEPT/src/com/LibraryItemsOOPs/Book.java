package com.LibraryItemsOOPs;

public class Book  extends LibraryItem{

	protected String authorName;
protected static boolean isavailable=true;
	
	protected void borrowBook(String title) {
		
		if(isavailable==false) {
			System.out.println("Book not borrow ");
		}
		else {
			displayInfo();
			isavailable=false;
		System.out.println("Borrow Book Successfully  ");
	}
	}
	
	protected void returnBook(String title) {
		displayInfo();
		isavailable=true;
		System.out.println("Book Return Successfully ");
	}
	
	@Override
	protected void displayInfo() {
		System.out.println("Book title "+super.gettitle());
		System.out.println("Book ID "+super.getitemID());
		System.out.println("Book author Name "+this.authorName);
		System.out.println("_____________________________________");
	}
}
