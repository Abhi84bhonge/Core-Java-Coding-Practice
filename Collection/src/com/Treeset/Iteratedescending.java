package com.Treeset;
import java.util.*;
public class Iteratedescending {

	
	public static void main(String[] args) {
		TreeSet<Integer> tt=new TreeSet<>();
		tt.add(33);
		tt.add(3);
		tt.add(33);
		tt.add(98);
		
		Iterator<Integer> it= tt.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
