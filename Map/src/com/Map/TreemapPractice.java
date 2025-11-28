package com.Map;

import java.util.*;

public class TreemapPractice {

	public static void main(String[] args) {

 HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(3, "ganesh");
		hmap.put(4, "ram");
		hmap.put(1, "abhijeet");
		hmap.put(2, "abhijeet");
		hmap.put(5, "rameshwar");
		hmap.put(6, "ram");
		  
		TreeMap<Integer, String> tmap=new TreeMap<>(hmap);
		tmap.forEach((x,y)->System.out.println(x+" "+y));;
     System.out.println("___________________________");
		for(String str: hmap.values()) {
    	  if(str.endsWith("ar")) {
    		  System.out.println(str);
    	  }
      }
		 
		 
		   
		   //		   System.out.println(tmap);
//			for(String str: tmap.values()) {
//		       if(str.contains("ram")) {
//		    	   if(str.endsWith("m")) {
//		    	   System.out.println(str);
//		       }
//			}
//			}
//			
//			System.out.println(tmap);
//        
//			
//        for(Integer it: tmap.keySet()) {
//        	if(it>=2&&it<=5) {
//        		System.out.println(it);
//        	}
//        }
         
//		for (String str : tmap.values()) {
//			tmap.put(1, "dfd");
//			System.out.println(str);
//		}
//
//		LinkedHashMap<Integer, String> str = new LinkedHashMap<>(tmap);
//		for (Integer it : str.keySet()) {
//			if (it == 2) {
//				it = 5;
//			}
//
//			System.out.println(it);
//		}
//		for (String st : str.values()) {
//			System.out.println(st);
//		}
//
//		LinkedHashMap<Integer, String> tt = new LinkedHashMap<>(str);
//		tt.put(3, "dhdh");
//		System.out.println(tt);
//
	}
}

