package com.pack4;

public class ClassB 
{
	int c;
	static int e;
	ClassB(){
		System.out.println(++c);// print 1 1 1 2 1 3 1 113 1 114 SUM:156
		System.out.println(++e);//e=1
	}
	public static void main(String[] args) 
	{
		int a = 34;
		int b = 21;
		new ClassB().c-= a++ + ++b;//a35 b22 c=-(34+22)+1=-55 e2
		int d = --a + --b + new ClassB().c--;// a34 b21 c0 d56 e3
		e = a + +b + new ClassB().c + d--;//a34 b21 c1 d55 e4; now e=34+21+1+56=112
		int f = -a + b-- + -new ClassB().c - d++ ;//a34 b20 c1 d56 e113 f=-34+21-1-55=-69
		int sum = a+b + new ClassB().c + d + e + f;	//a34 b20 c1 d56 e114 f(-68) sum=34+20+1+56+114-69=156
		System.out.println("SUM : "+sum);
	}
}