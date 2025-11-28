package com.Treeset;
import java.util.*;
public class SubsetHeadset {

	public static void main(String[] args) {
		TreeSet<Integer> tt=new TreeSet<>();
		tt.add(45);
		tt.add(56);
		tt.add(45);
		tt.add(99);
		System.out.println(tt.subSet(45,99));
		System.out.println(tt.headSet(99));
	}
}
