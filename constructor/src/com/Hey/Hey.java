package com.Hey;

import java.util.Scanner;

public class Hey {
	
	static int a=32;
	
	Hey(int a){
		this.a=a;
	}
	
	public void show() {
   int age=34;
   System.out.println(age);
   
	}
   static int add() {
	    return 2000;
	  
   }
   
   public void mainn() {
	   System.out.println("_________ere_______________");
   }
   
   public static void main(String[] args) {
	  
	 int a=  Hey.add();
	    		System.out.println("teh a is "+a);

   
	    		 Scanner sc=new Scanner(System.in);
	    		 System.out.println("enter the value of a ");
     int a1=sc.nextInt();
     System.out.println("the value of a is "+a1);
      sc.close();
   }
	
	
	
}

