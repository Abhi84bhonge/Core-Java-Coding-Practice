package com.Arraylist;

import java.util.*;
public class IteratorSearchElementName {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");
        list.add("Cherry");
        list.add("Apricot");
       
        Iterator<String> it=list.iterator();
        while(it.hasNext()) {
        	String st=(String ) it.next();
        	if(st.startsWith("A")) {
        		it.remove();
        	}
        }
       
        for(String str: list) {
        System.out.println(str);
	}
}
}
