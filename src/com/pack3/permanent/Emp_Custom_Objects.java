package com.pack3.permanent;

public class Emp_Custom_Objects {
	String empName;
	int empAge;
	float empSal;
	
	public Emp_Custom_Objects(String empName,int empAge,float empSal){
		this.empName= empName;
		this.empAge= empAge;
		this.empSal= empSal;
	}
	
	@Override
	public String toString() {
		return "Emp_Custom_Objects [empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal + "]";
	}

	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal=empSal;		
	}
}
