package com.pack3.permanent;

import java.util.LinkedList;
import java.util.ListIterator;

public class LL {
	public void meth1() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(null);
		ll.addFirst(10);
		ll.add(38);
		ll.addLast(30);
		ll.addFirst(30);
		ll.add(45);
		ll.add(68);
		ll.add(57);
		ll.add(84);
		ll.add(19);
		ll.add(37);
//		System.out.println(ll);
		/*
		Iterator<Integer> ite = ll.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		*/
		ListIterator<Integer> lite = ll.listIterator();
		System.out.println("The elements in the order is: ");
		while(lite.hasNext()) {
			System.out.print(lite.next()+" ");
		}
		System.out.println();
		System.out.println("The elements in second hasNext are: ");
		//This will give no outputs as the iterator is already at the end of the LL
		while(lite.hasNext()) {
			System.out.print(lite.next()+" ");
		}
		System.out.println();
		System.out.println("+====+====+====+====+");
		System.out.println("The elements in the reverse order are: ");
		while(lite.hasPrevious()) {
			System.out.print(lite.previous()+" ");
		}
		
		/*
		We can not use the hasPrevious() method
		without iterating to the hasNext() method
		*/
	}
	public static void main(String[] args) {
		new LL().meth1();
	}
}
