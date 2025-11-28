package com.OthersException;

public class First extends RuntimeException{
	
	 public void met() {
		try{
			System.out.println(4/0);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
	 }
	     
}  
