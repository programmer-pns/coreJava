package com.pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LJF2 {
	public void method1() {
		//storing the data in al with sorted by AT
		ArrayList<LJF1> al1=new ArrayList<LJF1>();
		
		al1.add(new LJF1("P1",0,3,0,0,0));
		al1.add(new LJF1("P2",1,2,0,0,0));
		al1.add(new LJF1("P3",2,4,0,0,0));
		al1.add(new LJF1("P4",3,5,0,0,0));
		al1.add(new LJF1("P5",4,6,0,0,0));
		
		int btCopy[] = new int[al1.size()];
		System.out.println(al1);
		for(int i=0;i<al1.size();i++) {
			btCopy[i]=al1.get(i).getBT();
		}
		
		float ATAT=0,AWT=0;
		
		Collections.sort(al1);

		//Creating another arrayList to store the data by arrival time;
		ArrayList<LJF1> al2=new ArrayList<LJF1>();
		
		int index = 0;
		int time;
		
		//Running an for loop to check the time and add the tasks to al2
		for(time=0;time<=al1.get(al1.size()-1).getAT();time++) {
			
			if(al1.get(index).getAT()==time) {
				al2.add(al1.get(index));
				index++;
			}

			Collections.sort(al2,new LJF_Comparator_BT().reversed());			
			al2.get(0).setBT(al2.get(0).getBT()-1);
		}
		
		
		
		Iterator<LJF1> ite=al1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		for(int i=0;i<al2.size();i++) {
			time+=al2.get(i).getBT();
			al2.get(i).setCT(time);
		}
		System.out.println("-----------");
		
		for(int i=0;i<al2.size();i++) {
			al2.get(i).setTAT(al2.get(i).getCT()-al2.get(i).getAT());
			al2.get(i).setWT(al2.get(i).getTAT()-btCopy[i]);
		}
		
		for(int i=0;i<al2.size();i++) {
			ATAT+=al2.get(i).getTAT();
			AWT+=al2.get(i).getWT();
		}
		Iterator<LJF1> ite2=al2.iterator();
		while(ite2.hasNext()) {
			System.out.println(ite2.next());
		}
		Collections.sort(null);
		System.out.println("ATAT value is:"+ATAT/al2.size()+"ms");
		System.out.println("AWT value is:"+AWT/al2.size()+"ms");
		
	}
	public static void main(String[] args) {
		new LJF2().method1();
	}
}
