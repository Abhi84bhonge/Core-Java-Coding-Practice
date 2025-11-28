package com.Arraylist;

import java.util.*;

public class CopyElement {

	public static void main(String[] args) {
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		
		ArrayList<Integer> at1=new ArrayList<>();
		at1.addAll(at);
		for(Integer ar: at1) {
			System.out.println(ar);
		}
		
		System.out.println("_______________________");
		TreeSet<Integer> ts=new TreeSet<>();
		ts.addAll(at1);
		for(Integer ar: ts) {
			System.out.println(ar);
		}
	}
}
