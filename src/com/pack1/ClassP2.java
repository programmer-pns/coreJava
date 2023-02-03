package com.pack1;

public class ClassP2 {
	private int PID,AT,IBT,RBT;
	ClassP2(int pid,int at,int ibt,int rbt){
		this.PID = pid;
		this.AT = at;
		this.IBT = ibt;
		this.RBT = rbt;
	}
	public int getPID() {
		return PID;
	}
	public int getAT() {
		return AT;
	}
	public int getIBT() {
		return IBT;
	}
	public int getRBT() {
		return RBT;
	}
	@Override
	public String toString() {
		return PID+" "+AT+" "+IBT+" "+RBT;
	}
}
