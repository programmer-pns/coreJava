package com.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class SJF2 {
	
	public void method1() {
		ArrayList<SJF1> al = new ArrayList<SJF1>();
		ArrayList<SJF1> al2 = new ArrayList<SJF1>();
		
		int TAT[] = new int[5];
		int WT[] = new int[5];
		
		float ATAT = 0f,AWT = 0f;
		
		int MIN_INDEX=0,MAX_INDEX_AT=0,MIN_INDEX_BT=0;
		al.add(new SJF1("P1",0,5,0));
		al.add(new SJF1("P2",1,2,0));
		al.add(new SJF1("P3",2,1,0));
		al.add(new SJF1("P4",4,3,0));
		al.add(new SJF1("P5",5,4,0));
				
		Collections.sort(al);
		
		for(int i=0;i<al.size()-1;i++) {
			if(al.get(i).getAT()>al.get(i+1).getAT()) {
				MIN_INDEX = i+1;
			}
			else {
				MAX_INDEX_AT = al.get(i+1).getAT();
			}
		}
		MIN_INDEX_BT = al.get(MIN_INDEX).getBT();
		if(MIN_INDEX_BT<=MAX_INDEX_AT) {
			al2.add(al.get(MIN_INDEX));
			for(int i = 0;i<al.size();i++) {
				if(i!=MIN_INDEX) {
					al2.add(al.get(i));
				}
			}
			al2.get(0).setCT(MIN_INDEX_BT);
			for(int i = 1;i<al2.size();i++) {
				al2.get(i).setCT(al2.get(i).getBT()+al2.get(i-1).getCT());
			}
		}
		for(int i=0;i<al2.size();i++) {
			TAT[i] = al2.get(i).getCT()-al2.get(i).getAT();
		}
		for(int i=0;i<al2.size();i++) {
			WT[i] = TAT[i]-al2.get(i).getBT();
		}
		for(int i=0;i<5;i++) {
			ATAT += TAT[i];
		}
		for(int i=0;i<5;i++) {
			AWT += WT[i];
		}
		
		System.out.println("PID\tAT\tBT\tCT\tTAT\tWT");
		System.out.println("---------------------------------------------");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al2.get(i).getPID()+"\t"+al2.get(i).getAT()+"\t"+al2.get(i).getBT()+"\t"+al2.get(i).getCT()+"\t"+TAT[i]+"\t"+WT[i]);
		}
		System.out.println("---------------------------------------------");
		
		System.out.println("ATAT value is: "+ATAT/5+"ms");
		System.out.println("AWT value is: "+AWT/5+"ms");
		
	}
	public static void main(String[] args) {
		new SJF2().method1();
	}
}
