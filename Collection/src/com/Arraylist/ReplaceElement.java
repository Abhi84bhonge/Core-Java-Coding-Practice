package com.Arraylist;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		at.set(2, 999);
		for(Integer it: at) {
			System.out.println(it);
		}
		
		System.out.println(at.get(2));
		System.out.println(at.get(3));
	}
}
