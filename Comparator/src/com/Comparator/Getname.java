package com.Comparator;
import java.util.*;
public class Getname {

	public TreeSet<String> getname(HashSet<Student> std){
		TreeSet<String> stud=new TreeSet<>();
		for(Student str: std) {
		     stud.add(str.name);
		}
       return stud;
	}

	
}
