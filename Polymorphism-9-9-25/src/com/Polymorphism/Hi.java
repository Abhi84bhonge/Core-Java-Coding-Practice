package com.Polymorphism;

public class Hi extends Calculator {

	@Override
	public void add(int b,int a) {
		System.out.println("chil class 	a "+a+"  b "+b+" and b addition as integer as "+(a+b));
	}
	
	public void add(double a,double b) {
		System.out.println("chil class 	a "+a+" b "+b+" and b addition as double as "+(a+b));
	}
	
	public void add(String a,String b) {
		System.out.println("chil class 	a "+a+" b "+b+" and b addition as double as "+(a+b));
	}
	
	Hi getInstance() {
		System.out.println("hi");
		return new Hi();
	}
	
	Hi getmet() {
		System.out.println("getmet");
		return new Hi();
	}
	public static void main(String[] args) {
		Calculator cl=new Hi();
		cl.add(45, 46);
		cl.add(454.55, 3434.55);
		cl.add("abhijeet ", "bhonge");
		cl.getInstance();
	}
}
