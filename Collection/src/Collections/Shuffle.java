package Collections;
import java.util.*;
public class Shuffle {
	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<>();
     list.add("Apple");
     list.add("Banana");
     list.add("Cherry");
     list.add("Date");
     list.add("Apple");
     
     Collections.shuffle(list);
     System.out.println(list);
    
     Vector<String> vt=new Vector<>();
       vt.addAll(list);
//     Stack<String> st=new Stack<>();
//           st.addAll(vt);
//           st.pop();
//           System.out.println(st);
//        st.push("mango");
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
    
    Queue<String> qt=new ArrayDeque<>();
    qt.addAll(vt);
    qt.remove();
    System.out.println(qt);
     
     
     
    
}
}
