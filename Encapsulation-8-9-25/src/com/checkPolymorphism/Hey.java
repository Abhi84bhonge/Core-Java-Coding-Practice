 package com.checkPolymorphism;

import java.io.PrintStream;

public class Hey extends Hello {
 
	
	
	public static void main(String[] args) {
		
	Hello h=new Hey();
	h.set(45);
	
	System.out.println(h.get());
	}
}