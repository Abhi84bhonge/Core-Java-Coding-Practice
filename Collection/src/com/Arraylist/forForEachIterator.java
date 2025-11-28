package com.Arraylist;

import java.util.*;


public class forForEachIterator {

	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		for(int i=0;i<at.size();i++) {
			System.out.println(at.get(i));
		}
		
//		lABMBDA EXPRESSION
		
		at.forEach((x)->System.out.println(x));
		System.out.println("____________________");
		
//		for each loop 
		for (Integer integer : at) {
			System.out.println(integer);
		}
//		for(Object ar: at) {
//			System.out.println(ar);
//		}
	System.out.println("___________________________");
		
//		Iterator class 
		
      Iterator <Integer> it=at.iterator();
     while(it.hasNext()) {
    	
    	 System.out.println(it.next());
}
     
     
	}
}
