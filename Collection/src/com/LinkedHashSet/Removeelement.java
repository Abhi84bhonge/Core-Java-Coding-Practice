package com.LinkedHashSet;
import java.util.*;


public class Removeelement {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		ls.add(45);
		ls.add(98);
		ls.add(4545);
		ls.add(45);
		
		Iterator<Integer> it=ls.iterator();
		while(it.hasNext()) {
			int num=(int )it.next();
			if(num==45) {
				it.remove();
			}
		}
		System.out.println(ls);
	}
}
