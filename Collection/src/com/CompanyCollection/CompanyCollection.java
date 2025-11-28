package com.CompanyCollection;
import java.util.*;
public class CompanyCollection {

	public static void main(String[] args) {
		  
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1,"abhijeet","IT",45000));
		emp.add(new Employee(2,"sadanand","ELPO",34000));
	
	  for(Employee ep: emp) {
		  System.out.println(ep);
	  }
	  System.out.println("_____________________");
	  for(Employee ep: emp) {
		  if(ep.department=="IT") {
			  System.out.println(ep.name+" "+ep.department);
		  }
	  }
	 }
}
