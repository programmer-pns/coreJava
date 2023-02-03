package com.pack1;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LINKEDLIST{
	void meth1() {
		LinkedList<Custom_Objects> al= new LinkedList<Custom_Objects>();
		al.add(new Custom_Objects("Scout",01,18000,"Xspark"));
		al.add(new Custom_Objects("Mavi",44,1000,"Xspark"));
		al.add(new Custom_Objects("Jonathon",16,1600,"GodL"));
		al.add(new Custom_Objects("Neyo",99,800,"Insane"));
		
		Iterator<Custom_Objects> i= al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-------------------------");
		ListIterator<Custom_Objects> li=al.listIterator();
		while ( li.hasNext()) {
			System.out.println(li.next());			
		}
	}
	public static void main(String[] args) {
		new LINKEDLIST().meth1();
	}
}