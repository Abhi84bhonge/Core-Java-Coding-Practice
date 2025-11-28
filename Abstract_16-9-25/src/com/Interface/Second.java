package com.Interface;


 public class Second extends First{
	 
	 Second(int a){
		 super(a);
	 }
	 
	 @Override
	 public void add() {
		 System.out.println(Second.a);
		 System.out.println("withou body method");
	 }
	 public void normal() {
		System.out.println("normal method override"); 
		super.stat();
	 }
	 
	 public static void main(String[] args) {
		 Second.stat();
		First f=new Second(453);
	    f.add();
	    f.normal();
	    
	    
	}
	 
 }
 