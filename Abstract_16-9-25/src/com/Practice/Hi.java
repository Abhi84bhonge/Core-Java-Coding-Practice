

package com.Practice;

public class Hi implements Abst {
   
	
	public void det() {
		System.out.println(Abst.a);
		System.out.println("det method");
	}
	
	public void dd() {
		System.out.println("dd method");
	}
	public static void main(String[] args) {
		Abst a=new Hi();
		 Abst.det();
		 a.type();
		 a.dd();
	}
}
