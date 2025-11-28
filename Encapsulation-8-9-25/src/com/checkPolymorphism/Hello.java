package com.checkPolymorphism;
 class Hello {

  private int a;
  
   public void met(int a) {
	   if(a>0) {
	   this.a=a;
	   System.out.println("method a is "+this.a);
	   }
   }
 
	public void set(int a) {
		this.a=a;
		
	}
	
	public int get() {
		return this.a;
	}
	
      

	
	}
