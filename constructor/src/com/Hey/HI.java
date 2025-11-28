package com.Hey;

public class HI extends Hey{
       int b=342;
	HI(){
		this(a);
		this.met();
	}
	HI(int a){
		
	super(a);
	}
	
	public void met(){
		System.out.println("hello met");
	}
	
	 {
		  System.out.println(a);
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {
		int num=121;
		int orig=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(orig==rev) {
			System.out.println("number is palindrome "+rev);
		}
		System.out.println(rev);
		HI h=new HI();
		System.out.println(h.b);
		Hey hh=new HI(45);
	   hh.show();		
	}
}
