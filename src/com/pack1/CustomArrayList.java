package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomArrayList {
	public void method1() {
		ArrayList<Custom_Objects> al= new ArrayList<Custom_Objects>();
		
		al.add(new Custom_Objects("Harish", 201, 20000));
		al.add(new Custom_Objects("Harish", 202, 25000));
		al.add(new Custom_Objects("RamCharan", 203, 27000));
		al.add(new Custom_Objects("Satish", 204, 19000));
		al.add(new Custom_Objects("Babu", 205, 35000));
		
		
		Iterator<Custom_Objects> ite = al.iterator();
		
		System.out.println("Before sorting");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		Collections.sort(al);
		
		Iterator<Custom_Objects> ite2 = al.iterator();
		
		System.out.println("\n\nAfter sorting");
		while(ite2.hasNext()) {
			System.out.println(ite2.next());
		}
	}
	public static void main(String[] args) {
		new CustomArrayList().method1();
	}
}
