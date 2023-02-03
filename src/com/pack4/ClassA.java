package com.pack4;

public class ClassA 
{
	private String empName;
	private int empSal;
	private int empExp;
	private String empAdd;
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public int getEmpSal()
	{
		return empSal;
	}
	public void setEmpSal(int empSal) 
	{
		this.empSal = empSal;
	}
	public int getEmpExp() 
	{
		return empExp;
	}
	public void setEmpExp(int empExp) 
	{
		this.empExp = empExp;
	}
	public String getEmpAdd()
	{
		return empAdd;
	}
	public void setEmpAdd(String empAdd) 
	{
		this.empAdd = empAdd;
	}
	public void increment() 
	{
		if (empExp<=5)
		{
			empSal=(int) (empSal+(empSal*0.1));
		}
		else if(empExp>10)
		{
			empSal=(int) (empSal+(empSal*0.3));
		}
		else
		{
			empSal=(int) (empSal+(empSal*0.2));
		}
		}
	}
	
