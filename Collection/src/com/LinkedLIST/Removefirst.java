package com.LinkedLIST;

import java.util.LinkedList;

public class Removefirst {

	public static void main(String[] args) {
		LinkedList<String> lt=new LinkedList<>();
		lt.add("abhijeet");
		lt.add("sadanand");
		lt.add("ganesh");
		for(String str: lt) {
			System.out.println(str);
		}
		System.out.println("_______________________________");
		lt.removeFirst();
		for(String str1: lt) {
			System.out.println(str1);
		}
	}
}
