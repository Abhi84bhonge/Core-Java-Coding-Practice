package com.LibrarySystem;

public class LibraryItem {

	private String title;
	private String author;
	private String location;
	
	public LibraryItem(){
		System.out.println("------->>LIBRARY SYSTEM<<--------");
		this.title="";
		this.author="";
		this.location="";
	}
	
       LibraryItem(String title,String author,String location) {
		this.title=title;
		this.author=author;
		this.location=location;
		
	}
	
	public void displayInfo() {
		System.out.println("Title of Book "+this.title);
		System.out.println("Author of Book "+this.author);
		System.out.println("Location of Book "+this.location);
		
	}
	
//	Book method
	public void displayInfo(String title,String author,String location,String genre,int pages) {
		System.out.println("Title of Book "+this.title);
		System.out.println("Author of Book "+this.author);
		System.out.println("Location of Book "+this.location);
		System.out.println("Generation of Book "+genre);
		System.out.println("Location of Book "+pages);
		
	}
	
	
//	DVD method
	
	public void displayInfo(int runTime,String author,String title,String location,String director ) {
		System.out.println("Title of Book "+this.title);
		System.out.println("Author of Book "+this.author);
		System.out.println("Location of Book "+this.location);
		
	
	
	
	}
	
	
	
	
	
}
