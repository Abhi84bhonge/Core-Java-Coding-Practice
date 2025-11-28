package com.Arraylist;

import java.util.*;
public class Arraylist {

	private static char charAt;

	public static void main(String[] args) {
	
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		System.out.println(at.reversed());
		System.out.println(at);
	 
		ArrayList<Object> list=new ArrayList<>();
		list.add(43);
		list.add("abhijet");
		list.add(343);
		System.out.println(list.indexOf(43));
		System.out.println(list.reversed());
		
		
		String str="abi";
		String re=str.replace('i', 'd');
        
	  System.out.println(re);
	  StringBuffer stb=new StringBuffer(str);
	  System.out.println(stb.reverse());
	  	 	}
}
