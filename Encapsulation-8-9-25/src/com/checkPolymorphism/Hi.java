package com.checkPolymorphism;

public class Hi extends Hello{

	
	
	@Override
	public void met(int a) {
		if(a>0) {
		System.out.println(a);
	}
	}
	
	public static void main(String[] args) {
		Hello h=new Hi();
		h.set(555);
		System.out.println(h.get());
		h.met(4553);
	}
}
