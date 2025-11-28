package com.LibrarySystem;

public class Book extends LibraryItem {
    private String genre;
    private int numberOfPages;
    
	
	Book(){
		super();
		this.genre="";
	
	}
	
	 Book(String title,String author,String location,String genre,int numberOfPages){
		super(title,author,location);
		this.genre=genre;
		this.numberOfPages=numberOfPages;
		
	}
	
	
	@Override
	public void displayInfo(String title,String author,String location,String genre,int numberOfPages) {
		System.out.println("Title of Book "+title);
		System.out.println("Author of Book "+author);
		System.out.println("Location of Book "+location);
		System.out.println("Genration of Book "+genre);
		System.out.println("Pages in Book "+numberOfPages);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
	}

	
	
//	Book Constructor METHOD
	void display() {
		super.displayInfo();
		System.out.println("Genration of Book "+genre);
		System.out.println("Pages in Book "+numberOfPages);
	}
	public static void main(String[] args) {
		LibraryItem libitm=new LibraryItem("JAVA","James Gosling","Rack No 1");
		libitm.displayInfo();
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
	
	   
		Book bk=new Book("PYTHON","ROSSUM","Rack No 2","First Edition",400);
//           bk.display();
       bk.displayInfo("C Language", "Dennis Ritchie","Rack No 3","Second Edition", 700);
	

	}
}
