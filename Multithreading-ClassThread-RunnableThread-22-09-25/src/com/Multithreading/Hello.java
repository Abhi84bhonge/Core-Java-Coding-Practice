package com.Multithreading;

public class Hello  {

 public static void main(String[] args) {
	
	 ThrdClass tc=new ThrdClass();
	
		tc.start();
		tc.setName("abhijeet thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(tc.getPriority());
	 for(int i=0;i<5;i++) {
		 System.out.println("sadanand");
	 }
	 tc.met();
		
	  
		
 }
	 
}