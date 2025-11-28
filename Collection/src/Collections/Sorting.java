package Collections;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> at=new ArrayList<>();
		at.add(34);
		at.add(43);
		at.add(43);
		at.add(1);
		at.add(99);
		at.add(92);
		Collections.sort(at);
		
		at.forEach((x)->System.out.println(x));
	}
}
