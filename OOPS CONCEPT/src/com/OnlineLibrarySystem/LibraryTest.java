package com.OnlineLibrarySystem;

public class LibraryTest {

	
	public static void main(String[] args) {
        // Create book objects
        Book b1 = new Book();
        b1.setTitle("Java Basics");
        b1.setAuthor("James Gosling");
        b1.setIsbn("ISBN101");
        
        
        StudentMember s1 = new StudentMember("S101", "Ravi");

        // Borrow books
        s1.borrowBook(b1);
        s1.borrowBook(b1);
        s1.borrowBook(b1);
        s1.borrowBook(b1);
}
}