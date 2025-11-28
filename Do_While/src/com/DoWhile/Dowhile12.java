package com.DoWhile;


import java.util.*;


public class Dowhile12 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> it=new ArrayList<>();
		it.add(34);
		it.add(34);
		it.add(98);
		it.add(87);
		for(Integer itr:it) {
			System.out.println(itr);
		}
		
		
		
		
		
		TreeSet<Integer> tst=new TreeSet<>();
		tst.addAll(it);
		
		System.out.println(tst);
		Map<Integer,String> str=new HashMap<>();
		str.put(1, "ram");
		str.put(2, "shyam");
		str.put(3, "krishna");
		str.forEach((x,y)->System.out.println(x+" "+y));;
	
		String st="abhijeet have good time to show";
	    String [] s=st. split(" ");
	   for(int i=s.length-1;i>=0;i--) {
		   System.out.print(s[i]+" ");
	    }
	    
	    int a=0;
	    for(int i=0;i<st.length();i++) {
	    	if(st.contains("a")) {
	    		a++;
	    	}
	    }
	    System.out.println(a);
		
	}
}
