package com.LinkedLIST;
import java.util.*;
public class LinkedListStrin {

	public static void main(String[] args) {
		LinkedList<String> lt=new LinkedList<>();
		lt.add("abhijeet");
		lt.add("sadanand");
		lt.add("ganesh");
		
		lt.addFirst("java");
		
		lt.addLast("oops");
		for(String str: lt) {
			System.out.println(str);
		}
	}
}
