package com.Comparator;
import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
       
    	HashSet<Student> list = new HashSet<>();
        list.add(new Student(1, "Abhijeet", 85));
        list.add(new Student(2, "Sadanand", 75));
        list.add(new Student(3, "Ram", 99));

        
        Comparator<Student> ct=new Comparator<>() {
        	public int compare(Student s1,Student s2) {
        		return s1.marks-s2.marks;
        	}
        };
        
       
       Iterator<Student> it=list.iterator();

			
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
        
       
       Comparable<Student> c=new Comparable<>() {
       
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return 0;
		}
       };   
       
       
        System.out.println("___________________________");
//      Collections.sort(list,ct);   
      for(Student strr: list) {
    	  System.out.println(strr);
      }
      
     
      System.out.println("++++++++++++++++++++++");
      Getname gt=new Getname();
      TreeSet<String> at=gt.getname(list);
     
      System.out.println(at);
     
      
      Max m=new Max();
      ArrayList<Integer> it1=m.met(list);
      System.out.println(it1);
//         for(Student str: list) {
//        	 if(str.marks>85) {
//        	 System.out.println(str.name+" "+str.marks);
//         }
//         }
         
         
        // Define comparator to sort by marks
//        Comparator<Student> sortByMarks = new Comparator<>() {
//            public int compare(Student s1, Student s2) {
//
//                return s1.marks-s2.marks;
//            
//            }
//        };
//         
//        for(Student str: list) {
//        	String strr=str.name.toLowerCase();
//        	if(strr.equals("abhijeet")) {
//        	System.out.println(str.id+""+str.name+""+str.marks);
//        	}
//        }
//       Collections.sort(list, sortByMarks);
//        for (Student s : list) {
//            System.out.println(s.id+" "+s.name+" "+s.marks);
//        }
    }
}
