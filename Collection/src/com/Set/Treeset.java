package com.Set;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		
		TreeSet<Integer> tt=new TreeSet<>();
		tt.add(884);
		tt.add(45);
		tt.add(34);
		tt.add(88);
		for(Integer it: tt) {
			System.out.println(it);
		}
	}
}
