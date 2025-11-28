package com.Vector;
import java.util.*;
public class InsertElement {
public static void main(String[] args) {
	
	Vector<Integer> vt=new Vector<>();
	vt.add(45);
	vt.add(23);
	vt.add(98);
	vt.add(44);
	System.out.println("add element at 1 index");
	vt.add(1, 3444);
	for(Integer it: vt) {
		System.out.println(it);
	}
	System.out.println("replace 1 index element");
	vt.setElementAt(4333,1);
	for(Integer it1: vt) {
		System.out.println(it1);
	}
}
}
