package com.pack3.permanent;

import java.util.Scanner;

public class Calculator {
	static double m,n,k;
	Scanner sc = new Scanner(System.in);
	public void meth1()
	{
		Calculator obj=new Calculator();
		System.out.println("Please Enter The Operator{+,-,*,/,=}");
		char operator=sc.next().charAt(0);
		if(operator=='=') {
			System.out.println(k);
		}
		else {
		obj.meth2();
		switch(operator) 
		{
		case '+':
			k+=n;
			obj.meth1();
			break;
		case '-':
			k-=n;
			obj.meth1();
			break;
		case '*':
			k*=n;
			obj.meth1();
			break;
		case '/':
			k/=n;
			obj.meth1();
			break;
		case '=':
			System.out.println("Total output is= "+k);
			break;
		default:
			System.out.println("Enter valid Operator (+,-,*,/,=)"); 
			break;
		}
		}
	}
	public void meth2() 
	{
		System.out.println("Please Enter the Number");
		n=sc.nextDouble();
	}
	public void meth3() 
	{
		System.out.println("Please Enter a number");
		m=sc.nextDouble();
		k=m;
		new Calculator().meth1();
	}
	public static void main(String []args) 
	{
		System.out.println("=====Calculator=====");
		new Calculator().meth3();
    }
}