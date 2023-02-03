package com.pack3.permanent;

import java.util.Iterator;
import java.util.TreeSet;

public class TS {
	public void meth1() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
//		ts.add("Hello");//Heterogenous data not allowed
		ts.add(40);
//		System.out.println(ts);
		Iterator<Integer> ite1 = ts.iterator();
		Iterator<Integer> ite2 = ts.descendingIterator();
		while(ite1.hasNext()) {
			System.out.print(ite1.next()+" ");
		}
		System.out.println();
		System.out.println("Descending order is: ");
		while(ite2.hasNext()) {
			System.out.print(ite2.next()+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TS().meth1();
	}

}
