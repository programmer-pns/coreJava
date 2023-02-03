package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ClassP1 {
	public void meth1() {
		ArrayList<ClassP2> al = new ArrayList<ClassP2>();

		Queue<Integer> theQueue = new LinkedList<Integer>();

		al.add(new ClassP2(1, 0, 5, 5));
		al.add(new ClassP2(2, 1, 3, 3));
		al.add(new ClassP2(3, 2, 1, 1));
		al.add(new ClassP2(4, 3, 2, 2));
		al.add(new ClassP2(5, 4, 3, 3));

		/*
		 * Iterator<ClassP2> i = al.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
		
		/*
		int quantum = 2;
		ArrayList<Integer> CT = new ArrayList<Integer>();
		ArrayList<Integer> TAT = new ArrayList<Integer>();
		ArrayList<Integer> WT = new ArrayList<Integer>();

		// to store each instance of time created an array
		int[] time = new int[al.size()];
		for (int p = 0; p < time.length; p++) {
			time[p] = p;
		}

		int sec = 0, index = 0;
		// to access the elements of the arryList with record of time
		for (int s = 0; s <= al.get(al.size() - 1).getAT() * 5;) {
			sec++;
			if (al.get(index).getAT() == sec) {
				if (al.get(0).getIBT() - quantum > 0) {
					theQueue.offer(al.get(0).getIBT());
					s += quantum;
				} else {
					CT.add(time[sec] + al.get(s).getIBT());
				}
			}
			// implement increment
			// change the condition
		}

		for (int s = 0; s < al.size(); s++) {
			al.get(s);
		}
		int first = al.get(0).getAT();
		
		*/
		theQueue.offer(500);
		theQueue.offer(1000);
		theQueue.offer(1500);
		theQueue.offer(2000);
		 Iterator<Integer> i = theQueue.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next()); }


	}

	public static void main(String[] args) {
		new ClassP1().meth1();
	}
}
