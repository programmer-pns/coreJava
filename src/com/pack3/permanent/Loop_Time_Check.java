package com.pack3.permanent;

public class Loop_Time_Check {
	static long forLoopTime,whileLoopTime;
	public void meth1(){
		long start,end;
		start = System.currentTimeMillis();
		for(int i=0;i<=100000;i++) {
			System.out.println(i);
		}
		end = System.currentTimeMillis();
		Loop_Time_Check.forLoopTime = end-start;
	}
	public void meth2(){
		long start,end;
		int i=0;
		start = System.currentTimeMillis();
		while(i<=100000) {
			System.out.println(i++);
		}
		end = System.currentTimeMillis();
		Loop_Time_Check.whileLoopTime = end-start;
	}
	public static void main(String[] args) {
		Loop_Time_Check ltcobj = new Loop_Time_Check();
		ltcobj.meth1();
		ltcobj.meth2();

		System.out.println("For_Loop time required = "+forLoopTime+"ms");
		System.out.println("While_Loop time required = "+whileLoopTime+"ms");
	}
}
