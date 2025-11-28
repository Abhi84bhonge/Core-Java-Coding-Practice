package com.LinkedHashSet;
import java.util.*;
public class LinkedTOArrayLIST {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		ls.add(45);
		ls.add(98);
		ls.add(4545);
		ls.add(34);
		
		ArrayList<Integer> lt=new ArrayList<>(ls);
		for(Integer ar: lt) {
			System.out.println(ar);
		}
	}
}
