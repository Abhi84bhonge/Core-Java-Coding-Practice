package com.Vector;
import java.util.*;
public class RemoveElement {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(998);
		v.add(23);
		v.add(45);
		for(Integer it: v) {
			System.out.println(it);
		}
		System.out.println("___________________");
		v.remove(1);//by index
		for(Integer it1: v) {
			System.out.println(it1);
		}
		System.out.println("_________________________");
		v.removeElement(45); //by element value
		for(Integer it2: v) {
			System.out.println(it2);
		}
	}
}
