package com.pack3.permanent;

import java.util.Scanner;

public class Recursion 
{
	public int meth1(int n)
	{
		if(n==1 || n==0) 
			return 1;//Base value
		int factorial=n*new Recursion().meth1(n-1);//Recursive call
		return factorial;
	}
	public static void main(String[] args) 
	{
		System.out.println("Please Enter the number for Factorial");
		Scanner sc=new Scanner(System.in);
		int result=new Recursion().meth1(sc.nextInt());
		sc.close();
		System.out.println("The factorial is: "+result);
	}
}
