package com.Practice;

public interface Abst {
	
	  int a =20;
	  
	  public static void det() {
		  System.out.println("det");
	  }
	  
        void dd();
	 default void type() {
		 System.out.println("default method");
		 }
	
}
