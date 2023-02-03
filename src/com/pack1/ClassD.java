package com.pack1;

public class ClassD{
	public void meth1(int[] arr1, int[] arr2) {
		int len = arr1.length;
		
		if(len<1 || len>10) {
			System.out.println(len+" is an invalid array size");
		}
		else {
			int[] last_arr = new int[len];
			boolean value = false;
			for(int i=0;i<len;i++) {
				
				if((arr1[i]%2==0)&& (arr2[i]%2==0)) {
					value = true;
					last_arr[i] = arr1[i]+arr2[i];
				}
			}
			if(value == true) {
				for(int o:last_arr) {
					System.out.print(o+" ");
				}
				System.out.println();
			}
			else
				System.out.println("There is no even elements in the arrays");
		}
	}
	public static void main(String[] args) {
		int arr1[] = {10,26,3,41,12};
		int arr2[] = {11,24,3,40,28};
		
		int arr3[] = new int[11];
		int arr4[] = new int[11];
		
		int odd1[] = {13,33,55,35,89};
		int odd2[] = {13,23,65,9,89};
		System.out.println("====one is even=====");
		new ClassD().meth1(arr1, arr2);
		System.out.println();
		
		System.out.println("====size is greater=====");
		new ClassD().meth1(arr3, arr4);
		System.out.println();
		
		System.out.println("=====no one is even=====");
		new ClassD().meth1(odd1, odd2);
		System.out.println();
	}
}