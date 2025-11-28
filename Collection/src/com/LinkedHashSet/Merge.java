package com.LinkedHashSet;

import java.util.*;

public class Merge {
	public static void main(String[] args) {
		
//	LinkedHashSet<Integer> ls=new LinkedHashSet<>();
//	ls.add(45);
//	ls.add(98);
//	ls.add(4545);
//	ls.add(45);
//	LinkedHashSet<Integer> ls1=new LinkedHashSet<>();
//	ls1.add(4335);
//	ls1.add(958);
//	ls1.add(4545);
//	ls1.add(465);
//	ls1.add(465);
//	
//	ls.addAll(ls1);
//	
//	for(Integer it: ls) {
//		System.out.println(it);
//	}
	
	String str="Good hello friends";
	for(char t=97;t<122;t++) {
		char ch=t;
		int counter=0;
		for(int i=0;i<str.length();i++) {
		if(ch==str.charAt(i)) {
			++counter;
		}
		
	}
		if(counter!=0) {
			System.out.println(ch+" "+counter);
		}
	}
	
	}
}
