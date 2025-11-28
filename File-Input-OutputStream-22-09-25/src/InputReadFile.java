import java.io.FileInputStream;
import java.io.IOException;



public class InputReadFile {
	
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(4/2);
	   try {
		System.out.println(4/0);
	   }
	   catch(ArithmeticException a) {
		    a.getStackTrace();
	   }
	   finally {
		   System.out.println("this is guaranted statement ");
		   System.exit(0);
	   }
	   
		 FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\hello.txt");
	    
		 int i;
	     while((i=fis.read())!=-1) {
		   System.out.print((char)i);
	     }
	 
        fis.close();
	
	  
	
	 }
	
}