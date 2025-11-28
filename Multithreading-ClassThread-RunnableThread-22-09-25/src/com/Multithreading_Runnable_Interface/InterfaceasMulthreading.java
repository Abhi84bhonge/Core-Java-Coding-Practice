package com.Multithreading_Runnable_Interface;

           public interface InterfaceasMulthreading {
        	   
        	   public static void main(String[] args) {
			
        	  Runnable rb=new Implemntclass();
        	  rb.run();
        	  Thread t=new Thread(rb);
        	  Thread t2=new Thread(rb);
        	   t.start();
        	   t.setName("abhijeet");
    
        	   System.out.println(t.getName());
        	  
        	   System.out.println("______________________________");
        	  t2.start();
        	  t2.setName("sadanand");
       	   System.out.println(t2.getName());
       	 
           }
           }

