package com.LinkedLIST;
import java.util.*;
public class forloop {
 
	public static void main(String[] args) {
		LinkedList<String> lt=new LinkedList<>();
		lt.add("abhijeet");
		lt.add("sadanand");
		lt.add("ganesh");
		
		for(int i=0;i<lt.size();i++) {
			System.out.println(lt.get(i));
		}
	}
}
