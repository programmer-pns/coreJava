package com.pack3.permanent;

public class Overriding2 extends Overriding1{//parent 1; child 2
	public void meth1(int c) {
		System.out.println("ClassC Method");
		System.out.println("Method Overriding");
	}
	public void method2() {
		System.out.println("ClassC Method2");
	}
	public static void main(String[] args) 
	{
		Overriding1 aobj=new Overriding1();//Parent class object with parent class reference
		//only Parent class method can be called
		aobj.method1();
//		aobj.method2();
		aobj.meth1(9);
		Overriding1 aobj2=new Overriding2();//child class object with parent class reference
		//only parent class method can be called
		aobj2.method1();
//		aobj2.method2();
		aobj2.meth1(9);
		Overriding2 cobj=new Overriding2();//Child class object with Child class reference
		//both parent class and child class method can be called
		cobj.method1();
		cobj.method2();
//		ClassC cobj2=new ClassA();
	}
}
//a method can be called with it's respective class object
//Line.18,Line.22 comes under method overriding