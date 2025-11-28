package com.Set;
import java.util.*;
public class HashAddelement {

	
	public static void main(String[] args) {
		
	HashSet<String> ht=new HashSet<>();
	ht.add("abhijeet");
	ht.add("abhijeet");
	ht.add("sadanand");
	ht.add("ganesh");
	ht.add("yash");
	System.out.println("duplicate element not allow");
	for(String str: ht) {
		System.out.println(str);
	}
	
	
	System.out.println("_____________________________");
	System.out.println("remove an element");
	ht.remove("abhijeet");
	 
	for(String str1: ht) {
		System.out.println(str1);
	}
	
System.out.println("________________________");
	System.out.println("element is exist");
	System.out.println(ht.contains("sadanand"));
	System.out.println("________________________");

	//	ht.clear();
//	System.out.println(ht);
	}
}
