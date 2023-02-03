package com.pack3.permanent;

import java.util.HashSet;
import java.util.Iterator;

public class ClassHS {
	public void meth1() {
		HashSet<AL2> hs = new HashSet<AL2>();
		
		hs.add(new AL2("Abhijeet", 20000, "RX", 4));
		hs.add(new AL2("Roman", 30000, "GODL", 3));
		hs.add(new AL2("Chandan", 10000, "HAKUR", 1));
		hs.add(new AL2("Himanshu", 40200, "RX", 9));
		
		Iterator<AL2> ite = hs.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	public static void main(String[] args) {
		new ClassHS().meth1();
	}
}
