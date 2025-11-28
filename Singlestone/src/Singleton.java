

public class Singleton {

 
 
	public static Singleton instance;
	
	  public Singleton() {
		  System.out.println("object created");
	  }
	  
	  public static Singleton met() {
		  if(instance==null) {
			  return instance=new Singleton();
		  }
		  return instance;
	  }
	  
	  public static void main(String[] args) {
		Singleton st=Singleton.met();
	}
}