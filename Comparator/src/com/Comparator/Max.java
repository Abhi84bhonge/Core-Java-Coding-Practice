package com.Comparator;

import java.util.ArrayList;
import java.util.HashSet;

public class Max {

	
	public ArrayList<Integer> met(HashSet<Student> list){
		 
		ArrayList<Integer> it=new ArrayList<>();
		for(Student stud:list ) {
			it.add(stud.marks);
		}
		return it;
	}
}
