package com.pack1;

public class SJF1 implements Comparable<SJF1> {
	private int AT,BT,CT;
	private String PID;
	SJF1(String PID,int AT,int BT,int CT){
		this.PID = PID;
		this.AT = AT;
		this.BT = BT;
		this.CT = CT;
	}
	@Override
	public String toString() {
		return PID+" "+AT+" "+BT+" "+CT;
	}
	@Override
	public int compareTo(SJF1 o) {
		return BT - o.BT;
	}
	public int getAT() {
		return AT;
	}
	public int getBT() {
		return BT;
	}
	public String getPID() {
		return PID;
	}
	public int getCT() {
		return CT;
	}
	public void setCT(int CT) {
		this.CT = CT;
	}
}
