package com.LibraryItemsOOPs;

public interface Reservable {

	    
	 
	 public static void reservable(LibraryItem item) {
		 if(LibraryItem.isavailable==false) {
		 System.out.println("Book name "+item.gettitle());
		 System.out.println("Book id "+item.getitemID());
		 System.out.println("Book is Reserved !!");
	 }
}
}