package com.pack1;

public class Custom_Objects implements Comparable<Custom_Objects>
	{
	String empName;
	int empID,empSal;
	String empDept;
	public Custom_Objects(String empName,int empID,int empSal){
		this.empName=empName;
		this.empID=empID;
		this.empSal=empSal;
	}
	public Custom_Objects(String empName,int empID,int empSal,String empDept){
		this.empName=empName;
		this.empID=empID;
		this.empSal=empSal;
		this.empDept=empDept;
	}
	@Override
	public String toString() {
		return empName+" "+empID+" "+empSal+" "+empDept;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpID() {
		return empID;
	}
	public int getEmpSal() {
		return empSal;
	}
	public String getEmpDept() {
		return empDept;
	}
	@Override
	public int compareTo(Custom_Objects o) {
		return empName.compareTo(o.empName);
	}
	
	}