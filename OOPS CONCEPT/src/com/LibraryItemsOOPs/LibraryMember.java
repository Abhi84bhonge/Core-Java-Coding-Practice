package com.LibraryItemsOOPs;

public abstract class LibraryMember {

	protected int memberID;
	protected String name;
	
	LibraryMember(String name,int memberID){
		this.memberID=memberID;
		this.name=name;
	}
	
	public abstract void borrowItem(LibraryItem item);
	
	
	
}
