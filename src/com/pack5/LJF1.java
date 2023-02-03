package com.pack5;

public class LJF1 implements Comparable<LJF1>{
	private String PID;
	private int AT,BT,CT,TAT,WT;
	LJF1(String PID,int AT,int BT,int CT,int TAT,int WT){
		this.PID = PID;
		this.AT = AT;
		this.BT = BT;
		this.CT = CT;
		this.TAT = TAT;
		this.WT = WT;
	}
	public int getCT() {
		return CT;
	}
	public void setCT(int cT) {
		CT = cT;
	}
	public int getTAT() {
		return TAT;
	}
	public void setTAT(int tAT) {
		TAT = tAT;
	}
	public int getWT() {
		return WT;
	}
	public void setWT(int wT) {
		WT = wT;
	}
	public String getPID() {
		return PID;
	}
	public int getAT() {
		return AT;
	}
	public int getBT() {
		return BT;
	}
	@Override
	public String toString() {
		return PID+" "+AT+" "+BT+" "+CT+" "+TAT+" "+WT;
	}
	@Override
	public int compareTo(LJF1 o) {
		return AT-o.AT;
	}
	public void setBT(int bT) {
		BT = bT;
	}		
	
	
}
