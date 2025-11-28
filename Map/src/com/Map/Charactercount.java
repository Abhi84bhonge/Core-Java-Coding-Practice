package com.Map;
import java.util.*;
public class Charactercount {

	public static void main(String[] args) {
		String str="abhijeet";
		LinkedHashMap<Character,Integer>hmap=new LinkedHashMap<>();
		for(char ch: str.toCharArray()) {
			hmap.containsKey(hmap.put(ch, hmap.getOrDefault(ch, 0)+1));
		}
		hmap.forEach((x,y)->System.out.println(x+" "+y));
		
		
		
		
		
//		hmap.forEach((x,y)->System.out.println(x+" "+y));
//		
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(!hmap.containsKey(ch)) {
//				hmap.put(ch, 1);
//			}
//			else {
//				hmap.put(ch, hmap.get(ch)+1);
//			}
//		}
//	hmap.forEach((x,y)->System.out.println(x+" "+y));	
	
}
}