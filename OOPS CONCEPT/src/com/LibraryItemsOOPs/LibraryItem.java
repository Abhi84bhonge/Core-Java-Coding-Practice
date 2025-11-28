package com.LibraryItemsOOPs;

public class LibraryItem {

	private  String title;
	private  int itemID;
    protected static boolean isavailable;
	
	protected void borrowBook(String title) {
		isavailable=false;
		System.out.println("Borrow Book Successfully "+title);
	}
	
	protected void returnBook(String title) {
		isavailable=true;
		System.out.println("Book Return Successfully "+title);
	}
	
	protected void settitle(String title) {
		this.title=title;
	}
	
	protected String gettitle() {
		return title;
	}
	
	protected void setitemID(int ID) {
		this.itemID=ID;
	}
	protected int getitemID() {
		return itemID;
	}
	
	protected void displayInfo() {
		System.out.println("Book Title "+this.title);
		System.out.println("Item ID "+this.itemID);
	}
}
