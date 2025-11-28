package com.LinkedLIST;
import java.util.*;
public class LinkedListtoArraylist {

	
	public static void main(String[] args) {
		LinkedList<String> lt=new LinkedList<>();
		lt.add("abhijeet");
		lt.add("sadanand");
		lt.add("ganesh");
		for(String str1: lt) {
			System.out.println(str1);
		}
		System.out.println("______________________");
	      lt.reversed();
	      
		ArrayList<String> at=new ArrayList<>(lt);
		for(String str: at) {
			System.out.println(str);
		}
	}
}
