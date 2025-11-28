package Collections;

import java.util.*;


public class MergeArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		
		
		
		TreeSet<Integer> ts=new TreeSet<>(at);
		for(Integer itr: ts) {
			System.out.println(itr);
		}
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(ts);
		
		for(Integer ir: lhs) {
			if(ir.equals(43)) {
				System.out.println(ir+"true");
			}
		}
		System.out.println("____________________");
//	    ArrayList<Integer> at1=new ArrayList<>();
//	    
//	    
//	    at1.add(34);
//	    at1.add(45);
//	    at1.add(98);
//	    System.out.println(at1);
//	   
//	    System.out.println("_______________________");
//	  at.addAll(at1);
//	   for(Integer ot: at) {
//		   System.out.println(ot);
//	   }
//	   System.out.println("________________________");
//	  Collections.reverse(at);
//	   for(Integer ot: at) {
//		   System.out.println(ot);
//	   }
	  
	  
	          
	}
}
