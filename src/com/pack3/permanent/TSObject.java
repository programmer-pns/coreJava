package com.pack3.permanent;

import java.util.Iterator;
import java.util.TreeSet;

public class TSObject {
	public void meth1() {
		TreeSet<TSObject2> objectTS = new TreeSet<TSObject2>();
		objectTS.add(new TSObject2("Himan", 20300, 6));
		objectTS.add(new TSObject2("Abhi", 30000,4));
		objectTS.add(new TSObject2("Hakur", 40300, 2));
		objectTS.add(new TSObject2("StarBoy", 20300, 9));
		objectTS.add(new TSObject2("StarBoy", 20300, 8));
		objectTS.add(new TSObject2("Starboy", 20300, 8));
		objectTS.add(new TSObject2("Himan", 42000, 5));
		objectTS.add(new TSObject2("Jazzy", 20300, 7));
		
		Iterator<TSObject2> iteObj= objectTS.iterator();
		while(iteObj.hasNext()) {
			System.out.println(iteObj.next());
		}
		System.out.println("==== ..Descending Order..====");
		Iterator<TSObject2> iteObjDesc= objectTS.descendingIterator();
		while(iteObjDesc.hasNext()) {
			System.out.println(iteObjDesc.next());
		}
	}
	public static void main(String[] args) {
		new TSObject().meth1();
	}
}
