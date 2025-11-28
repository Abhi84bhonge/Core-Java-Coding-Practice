package com.LibraryItemsOOPs;

public class Main implements Reservable {

	
	public static void main(String[] args) {
		
		Book b=new Book();
		b.settitle("java");
		b.setitemID(33);
		b.authorName="James Gosling";
		
		Reservable.reservable(b);
		
		DVD dvd=new DVD();
	   dvd.settitle("Java");
	   dvd.setitemID(99);
	   dvd.durationDVD=34;
	   dvd.borrowDVD("java");
	   dvd.borrowDVD("java");
	}
}
