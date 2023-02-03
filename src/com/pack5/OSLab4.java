package com.pack5;

public class OSLab4 {
	public static void main(String[] args) {
		int a = 50;
		int b =55;
		new OSLab4().meth1(a,b);
	}

	public void meth1(int a, int b) {
		int arr[] = new int[b-a+1];
		int sum=0;
		for(int i=a;i<b;i++) {
	
			while(i>0) {
				sum += i%10;
			}
		}
	}
}
