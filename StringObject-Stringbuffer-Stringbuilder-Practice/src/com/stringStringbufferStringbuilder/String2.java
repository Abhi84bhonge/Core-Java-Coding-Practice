package com.stringStringbufferStringbuilder;

public class String2 {

	
	public static void main(String[] args) {
		
		int n=100000;
		
		long start1=System.currentTimeMillis();
		String str="";
		for(int i=0;i<n;i++) {
			str+="a";
			
		}

	  long end1=System.currentTimeMillis();
	  System.out.println("time taken : "+(end1-start1)+"ms");
	
	 
	  long start2=System.currentTimeMillis();
	  StringBuffer stb=new StringBuffer();
	  for(int i=0;i<n;i++) {
		  stb.append("a");
	  }
	  long end2=System.currentTimeMillis();
	  System.out.println("time taken string buffer :"+(end2-start2)+ "ms");
	
	  long start3=System.currentTimeMillis();
	  StringBuilder stb1=new StringBuilder();
	  for(int i=0;i<n;i++) {
		  stb1.append("a");
	  }
	  long end3=System.currentTimeMillis();
	  System.out.println("time taken string builder "+(end3-start3)+"ms");
	 
	
	
	
	}
}