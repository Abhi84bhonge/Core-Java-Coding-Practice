package com.OnlineLibrarySystem;

    class StudentMember extends Member {
    private  int borrowcount=0;
	  private static final int Maxborrowlimit=3;
	  
	  StudentMember(String memberId,String name){
		  super(memberId,name);
	  
	  }
	  
	  @Override
	  void borrowBook(Book b) {
		  if(!b.isAvailable()) {
			  System.out.println("Sorry "+b.getTitle()+"is already borrowed!!!");
		   return;
		  }
		  if(borrowcount>=StudentMember.Maxborrowlimit) {
			  System.out.println("Borrowing limit reached Student borrow only "+StudentMember.Maxborrowlimit+" books.");
		   return;
		  }
		  borrowcount++;
		  b.setAvailable(false);
		  System.out.println(name +" borrowed"+b.getTitle());
	  }
	  
	  @Override
	  void returnBook(Book b) {
		 if(!b.isAvailable()) {
			b.setAvailable(true);
		    borrowcount--;
		    System.out.println(name+" returned"+b.getTitle());
		  }
		 else {
			 System.out.println(b.getTitle() +" was not borrowed by "+name);
		 }
	  }
   }
