package com.Multithreading;

public class ThrdClass extends Thread{
private int count=0;
	@Override
	public void  run()  {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++)  {
			System.out.println("abhijeet");
			try {
			Thread.sleep(500);
		}
			catch(InterruptedException e) {
				System.out.println("sorry not perform");
			}
	}
		
	}
	public synchronized void met() {
		
		while(count<10) {
		count++;
		System.out.println(count);
		}
	}
	
	
}
