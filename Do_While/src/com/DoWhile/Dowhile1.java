package com.DoWhile;

public class Dowhile1 {

	 public static void main(String[] args) {
//		int num=1;
//		do {
//			System.out.println(num);
//			num++;
//		}
//		while(num<=10);
//	
	 int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 
		String str="aabbhijeet";
		
		char sr=0;
		for(int i=0;i<str.length();i++) {
			boolean isunique=true;
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(ch==str.charAt(j)&&i!=j) {
					isunique=false;
					break;
				}
			}
			if(isunique) {
				sr=ch;
				break;
			}
		}
		if(sr!=0) {
			System.out.println("first non repeating character "+sr);
		}
	
}
}