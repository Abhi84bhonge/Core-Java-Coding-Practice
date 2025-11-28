package com.Vector;
import java.util.*;
public class Practice {

	
	 public static void main(String[] args) {
		
		
		
		 Stack<Integer> st=new Stack<>();
		 st.add(34);
		 st.add(554);
		 st.add(34);
		 st.add(98);
		 for(Integer it: st) {
			 System.out.println(it);
		 }
		 
		 System.out.println("__________");
		st.add(4, 88);
		for(Integer it: st) {
			 System.out.println(it);
		 }
		System.out.println("______");
		st.removeFirst();
		for(Integer it: st) {
			 System.out.println(it);
		 }
	 }
}
