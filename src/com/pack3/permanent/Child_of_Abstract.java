package com.pack3.permanent;

public class Child_of_Abstract extends Parent_Abstract{

	public static void main(String[] args) {
		Parent_Abstract paobj = new Child_of_Abstract();
		paobj.meth1();
		paobj.meth2();
	}

	@Override
	void meth1() {
		System.out.println("Meth1 Abstract Method Overridden");
	}

	@Override
	void meth2() {
		System.out.println("Meth2 Abstract Method Overridden");
	}

}
