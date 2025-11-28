package com.LibrarySystem;

public class DVD extends LibraryItem{
    private String director;
    private int runTime;
    
	public DVD(){
		super();
	this.director="";
	this.runTime=0;
	}
	
	public DVD(String title,String author , String location,String director, int runTime) {
		super(title,author,location);
		this.director=director;
		this.runTime=runTime;
		
	}
	
	
	@Override
	public void displayInfo(int runTime,String author,String title,String location,String director ) {
		System.out.println("Title of Book "+title);
		System.out.println("Author of Book "+author);
		System.out.println("Location of Book "+location);
		System.out.println("Director of DVD "+director);
		System.out.println("Runtime of DVD "+runTime+" Hours ");
		System.out.println("+++++++++++++++++++++++++++++");
		
	}
	
	
//	 DVD consturctor display
	void display() {
		super.displayInfo();
		System.out.println("Book director "+director);
		System.out.println("Runtime "+runTime+" Hours");
		System.out.println("++++++++++++++++++++++++++++++");
	}
	 
	public static void main(String[] args) {
		LibraryItem lbritm=new LibraryItem("C++","BJARNE","Rack NO 6");
	      
		lbritm.displayInfo();
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		DVD dvd=new DVD("python","ritchie","Rack No 5","Dennis",6);
     	 dvd.display();
		dvd.displayInfo(5, "ddd", "c", "rack no 4", "ritche");
		
	}
	
	
	
	
	
	
}
