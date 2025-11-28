package Collections;

import java.util.*;;

public class MinMax {

	public static void main(String[] args) {
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		
		System.out.println("min  "+Collections.min(at));
	     System.out.println("max  "+Collections.max(at));
	}
}
