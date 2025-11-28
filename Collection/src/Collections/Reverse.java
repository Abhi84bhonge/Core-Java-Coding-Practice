package Collections;

import java.util.*;

public class Reverse {
public static void main(String[] args) {
	
	ArrayList<Integer> at=new ArrayList<>();
	at.add(34);
	at.add(43);
	at.add(43);
	at.add(1);
	at.add(99);
	at.add(92);
	
	
	
	Collections.sort(at);
	System.out.println(at);
	
	
	Collections.reverse(at);
	System.out.println(at);
	
	
	Collections.sort(at,Collections.reverseOrder());
	System.out.println(at);
}
}
