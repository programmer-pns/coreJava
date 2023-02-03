package com.pack1;

import java.util.Scanner;

public class ClassOSfcfs2 {
	public void meth1() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give the number of inputs");
		int number = sc.nextInt();
		int AT[] = new int[4];
		int BT[] = new int[4];
		int CT[] = new int[4];
		int TAT[] = new int[4];
		int WT[] = new int[4];
		
		System.out.println("Please provide Arival time(AT)for"+number+ "processes");
		for(int i=0;i<number;i++) {
			AT[i] = sc.nextInt();
		}
		System.out.println("Please provide Burst time(AT)for"+number+ "processes");
		for(int i=0;i<number;i++) {
			BT[i] = sc.nextInt();
		}
		float ATAT=0f;
		float AWT = 0f;
		
		CT[0] = BT[0];
		
		for(int i = 1;i<number;i++) {
			CT[i] = BT[i]+CT[i-1];
		}
		for(int i = 0;i<number;i++) {
			TAT[i] = CT[i]-AT[i];
		}
		for(int i = 0;i<number;i++) {
			WT[i] = TAT[i]-BT[i];
		}
		for(int i = 0;i<4;i++) {
			System.out.println(AT[i]+" "+BT[i]+" "+CT[i]+" "+TAT[i]+" "+WT[i]);
		}
		
		for(int i = 0;i<number;i++) {
		  ATAT += TAT[i];
		}
		for(int i = 0;i<number;i++) {
			AWT += WT[i];
		}
		
		System.out.println("ATAT :"+ATAT/number+"ms");

		System.out.println("AWT :"+AWT/number+"ms");
		
		sc.close();
		
	}
	public static void main(String[] args) {
		new ClassOSfcfs2().meth1();
	}
}
