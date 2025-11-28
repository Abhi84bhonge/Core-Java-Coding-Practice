package com.ExceptionHandling;


public class Hi {

	
	    private static int passwordlimit=0;
	    private static String password="1234";
	    
	    public synchronized void login(String password)throws Hey{
	    	if(Hi.password.equals(password)) {
	    		System.out.println("password correct");
	    	}
	    	else {
	    		Hi.passwordlimit++;
	    		System.err.println("remaining attempts "+(3-Hi.passwordlimit)+" !!!");
	    	}
	    	if(passwordlimit>3) {
	    		throw new Hey("Account blocked");
	    	}
	    }
	    
	public static void main(String[] args) {
		Hi h=new Hi();
		try {
		h.login("3233");
		h.login("43433");
		h.login("45454");
		
	}catch(Hey e) {
		System.err.println(e.getMessage());
	}
		
		 
	}

}

