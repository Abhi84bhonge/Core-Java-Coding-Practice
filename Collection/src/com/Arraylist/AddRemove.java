package com.Arraylist;

import java.util.ArrayList;

public class AddRemove {

	public static void main(String[] args) {
		
	ArrayList<Integer> at=new ArrayList<>();
	at.add(34);
	at.add(43);
	at.add(43);
	at.add(1);
	at.add(99);
	at.add(92);
	
	
	try {
	at.remove(2);
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("array out of bound ");
	}
	for(Integer itr:at) {
		System.out.println(itr);
	}
}
}