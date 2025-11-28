package com.Interface;

public class D extends C {

//	@Override
//	public void show() {
//		System.out.println("d");
//	}
	
//	 here we access of c class in d 
//	 c class have all data of parent class a and b
//	 so we override in c class 
//	but in interface and abstract  class we cannot create directly object 
//	we have to make one more class d
//	in that we create object and we said that class
//	 as concrete class as child class 
	
	public static void main(String[] args) {
		C c=new D();
		c.show();
		A.sh();
		C.sh();
	}
	}

