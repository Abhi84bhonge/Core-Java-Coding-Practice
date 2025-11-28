package com.Arraylist;

import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		System.out.println("size of element "+at.size());
		System.out.println(at.contains(99));
	}
}
