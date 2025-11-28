package com.Map;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		
		String str="swiss";
	HashMap<Character,Integer> hmap=new HashMap<>();
        for(char ch: str.toCharArray()) {
        	hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        	
        }
        
        
        for(char ch: str.toCharArray()) {
        	if(hmap.get(ch)==1) {

              System.out.println(ch);
              break;
        	}
        }
	
	}
}
