package com.queue;
import java.util.*;
public class First {

	public static void main(String args[]) {
        Queue<String> q = new LinkedList<>(); // raw type
        q.add("A");
        q.add("B");
        q.add("C");
        for(String str: q) {
        	System.out.println(str);
        }
       System.out.println("after adding of H");
        q.add("H");
        for(String str1: q) {
        	System.out.println(str1);
        }
}
}