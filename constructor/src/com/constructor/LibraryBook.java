package com.constructor;

public class LibraryBook  {
	String title;
	String author;
	String isbn;
	boolean available;

	public LibraryBook(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = true;
	}

	public void Displaybook() {
		System.out.println("*****************Display Book**************************");
		System.out.println("the book name is :- " + this.title);
		System.out.println("the author name is :- " + this.author);
		System.out.println("the isbn number is :- " + this.isbn);
		System.out.println("the book is available:- " + this.available);
		System.out.println("     ");
		
	}

	public void returnBook() {
		this.available = true;
		System.out.println("*******************************************");
		System.out.println("the book is " + this.title + "return  !!successfully!");
		System.out.println("the book is available :-" + available);
		System.out.println("*******************************************");

	}

	public void borrowBook() {
		this.available = false;
		System.out.println("*******************************************");
		
		System.out.println("the book " + this.title + " is borrowed..");
		System.out.println("the book is available:-  " + available);
		System.out.println("*******************************************");

	}

	public static void main(String[] args) {
		LibraryBook lb = new LibraryBook("Java Programming", "James Gosling", "123-04544-434");
		LibraryBook lb1=new LibraryBook("Python Basics", "Guido van Rossum", "343-4848-4456");
		lb.Displaybook();
		lb1.Displaybook();
		lb1.borrowBook();
		lb1.returnBook();
		
		
	}
}