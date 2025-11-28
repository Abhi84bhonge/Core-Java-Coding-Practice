package com.Polymorphism;

public class Calculator {

	
	public void add(int a,int b) {
		System.out.println("a "+a+"b "+" and b addition as integer as "+(a+b));
	}
	
	public void add(double a,double b) {
		System.out.println("a "+a+"b "+" and b addition as double as "+(a+b));
	}
	
	public void add(String a,String b) {
		System.out.println("a "+a+"b "+" and b addition as String as "+(a+b));
	}
	
	Calculator getInstance() {
		System.out.println("calculator ");
		return new Calculator();
	}
	
	Calculator getmet() {
		System.out.println("gemet");
		return new Calculator();
	}
	
}
