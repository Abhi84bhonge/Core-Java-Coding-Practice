package com.Arraylist;

import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) {
		
	ArrayList<Integer> at=new ArrayList<>();
	at.add(34);
	at.add(43);
	at.add(43);
	at.add(1);
	at.add(99);
	at.add(92);
	
	System.out.println(at.reversed());
	
	for(int i=at.size()-1;i>=0;i--) {
		System.out.println(at.get(i));
	}
	}
}
