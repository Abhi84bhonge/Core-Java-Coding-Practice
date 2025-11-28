package com.OnlineLibrarySystem;

abstract class Member  {
     
	protected String memberId ;
	protected String name;
	
	Member(String memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	
	abstract void borrowBook(Book b);
	
	 abstract void returnBook(Book b);
	 
	
}
