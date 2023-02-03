package com.pack1;

import java.util.Scanner;

public class ClassY {
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		String str[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		for(int i=min;i<=max;i++) {
			try {
				System.out.println(str[i]+" ");
			}
			catch(ArrayIndexOutOfBoundsException aiobe) {
				if(i%2==0) {
					System.out.println("Even ");
				}
				else
					System.out.println("Odd ");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		sc.close();
	}
}
