package com.queue;
import java.util.*;
public class Arraydequee {
	public static void main(String[] args) {
	
	ArrayDeque<String> q = new ArrayDeque<>(); // raw type

    // Add elements (FIFO)
    q.add("A");
    q.add("B");
    q.add("C");
    for(String str: q) {
    	System.out.println(str);
    }
    System.out.println("_________________");
    System.out.println("after remove of first element");
    q.remove();
    for(String str1: q) {
    	System.out.println(str1);
    }
    System.out.println("________________________");
    q.addFirst("dfd");
    
    for(String str1: q) {
    	System.out.println(str1);
    }
    System.out.println("________________________");
   
}
}
