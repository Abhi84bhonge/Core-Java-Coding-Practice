package com.Vector;
import java.util.*;
public class VectortoArrayLIST {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("abhijeet");
		v.add("sadanand");
		v.add("ganesh");
	
		System.out.println("vector ");
		for(String str: v) {
		
		 System.out.println(str);
		}
			System.out.println("-------arraylist------");
		
		ArrayList<String> a=new ArrayList<>(v);
	    
		for(String str: a) {
			System.out.println(str);
		}
		System.out.println("_____reversed____________");
		Collections.reverse(a);
		for(String str: a) {
			System.out.println(str);
		}
	}
}
