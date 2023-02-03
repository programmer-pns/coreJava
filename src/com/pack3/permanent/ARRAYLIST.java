package com.pack3.permanent;

import java.util.ArrayList;
import java.util.Iterator;

public class ARRAYLIST {
	void meth1() {
		System.out.println("Implementing ArrayList");
		ArrayList al = new ArrayList();
		al.add(10);//Insertion order is maintained
		al.add("Java");//Heterogeneous data is allowed
		al.add(null);//Null is allowed
		al.add(10);//Duplicates are allowed
		al.add(20);//Introduced from java 1.5
		al.add(40);//Not synchronized by default
		al.add(47);
		al.add(56);
		System.out.println(al);
		
		System.out.println("------------------------------------");
		System.out.println("Retrieving Data by For-Loop");
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Retrieving Data By using for-each loop");
		for(Object o:al) {
			System.out.print(o+ " ");
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Retrieving Data By using Iterator Interface");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("------------------------------------");
	}
	void meth2() {
		ArrayList al2=new ArrayList();
		System.out.println("Adding our own Custom Data to ArrayList");
		al2.add(new AL2("Scout",1500,"XSpark",6));
		al2.add(new AL2("Jonathan",1800,"GODL",9));
		al2.add(new AL2("Mortal",1200,"S8UL",5));
		al2.add(new AL2("Mavi",1300,"XSpark",6));
		al2.add(new AL2("Neyoo",1000,"Insane",8));
		System.out.println("-----------------------------------");
		System.out.println("Retrieving Data From ArrayList");
		System.out.println("-----------------------------------");
		Iterator<AL2> i=al2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-------------------------------------------");
	}
	public static void main(String[] args) {
		ARRAYLIST alobj = new ARRAYLIST();
		alobj.meth1();
		System.out.println("=========================================");
		alobj.meth2();
	}
}
