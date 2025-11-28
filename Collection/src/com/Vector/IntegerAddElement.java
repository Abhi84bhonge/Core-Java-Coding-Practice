package com.Vector;
import java.util.*;
public class IntegerAddElement {

	public static void main(String[] args) {
	 Vector<Integer> v=new Vector<>();
	 v.add(34);
	 v.add(45);
	 v.add(98);
	for(Integer it: v) {
		System.out.println(it);
	}
	 v.addElement(99);
	 for(Integer it1: v) {
		 System.out.println(it1);
	 }
	}
}
