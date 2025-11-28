package Collections;

import java.util.*;
public class Practice {
    String name;
    int marks;
	public Practice(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}

	 public static void main(String[] args) {
		
	ArrayList<Practice> list = new ArrayList<>();
    list.add(new Practice("Abhijeet",694));
    list.add(new Practice("sadanand",65));
    
    
       Iterator<Practice> itr=list.iterator();
       while(itr.hasNext()) {
    	   System.out.println( itr.next());
       }
       
    	Comparator<Practice> ct=new Comparator<>() {
    		@Override
    		public int compare(Practice p1,Practice p2) {
    			
    			return p2.marks-p1.marks;
    			
    		}
    		};

    		Collections.sort(list,ct);
    		
    		for(Practice p:list) {
    			System.out.println(p.name+" "+p.marks);
    		}
           
	 }

	@Override
	public String toString() {
		return "Practice [name=" + name + ", marks=" + marks + "]";
	}
}