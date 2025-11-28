package com.queue;
import java.util.*;
public class Priorityque {
	public static void main(String args[]) {
        PriorityQueue<Integer> q = new PriorityQueue<>(); // raw type
        q.add(34);
        q.add(1);
        q.add(45);
       System.out.println("priority que show the sorting of smaller to larger");
       for(Integer it: q) {
    	   System.out.println(it);
       }
//        first priority is to remove small element
}
}