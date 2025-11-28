package com.Treeset;
import java.util.*;
public class Createelement {

	public static void main(String[] args) {
		TreeSet<Integer> tt=new TreeSet<>();
		tt.add(45);
		tt.add(56);
		tt.add(45);
		tt.add(99);
		for(Integer it: tt) {
			System.out.println(it);
		}
		System.out.println("reversed");
		
		ArrayList<Integer> at=new ArrayList<>();
		at.addAll(tt);
	
		Collections.reverse(at);
		for(Integer it1: at) {
			System.out.println(it1);
		}
		
	}
}
