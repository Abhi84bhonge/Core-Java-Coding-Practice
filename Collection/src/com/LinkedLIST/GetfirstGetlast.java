package com.LinkedLIST;
import java.util.*;
public class GetfirstGetlast {

	public static void main(String[] args) {
		LinkedList<Integer> lt=new LinkedList<>();
		lt.add(45);
		lt.add(89);
		lt.add(3);
		System.out.println(lt);
		System.out.println(lt.getFirst());
		System.out.println(lt.getLast());
	}
}
