package com.Map;
import java.util.*;

public class Map {

	
	public static void main(String [] args) {
//		Duplicate Key not allowed 
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "abhijeet");
		hm.put(2,"abhijeet");
		hm.put(3, "ganesh");
//	    there are two ways to get data from map
//	  
		
		hm.forEach((key,value)->System.out.println(key+" "+value));
		
		
//	  2
//	  for(Integer it: hm.keySet()) {
//			System.out.println(it+" "+hm.get(it));
//		}
//	  
//	  for(String data: hm.values()) {
//		  System.out.println(data);
//	  }
		
		
		HashMap<String,Double> str=new HashMap<>();
		str.put("abhijeet", 10000.00);
		str.put("sadanand", 20000.00);
		str.put("ganesh", 11000.00);
		str.put("deepak", 11500.00);
		
		str.forEach((k,v)->System.out.println(k+" "+v));
	 
		
		TreeMap<String,Double> tmap=new TreeMap<>();
		tmap.putAll(str);
		System.out.println(tmap.reversed());
	      
		
		LinkedHashMap<String,Double> linmap=new LinkedHashMap<>();
		linmap.putAll(str);
		
		System.out.println(linmap);
		System.out.println(linmap.reversed());
	}
	
	
	}
	

