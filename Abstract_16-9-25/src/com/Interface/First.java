package com.Interface;

  
	public abstract class First{
		
		 public static int a=45;
		First(int a){
			First.a=a;
		}
		public abstract void add();
		
		public void normal() {
			System.out.println("normal method");
		}
		static void stat() {
			System.out.println("static method");
		}
		
	}