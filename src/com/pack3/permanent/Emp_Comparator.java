package com.pack3.permanent;

import java.util.Comparator;

public class Emp_Comparator implements Comparator<Emp_Custom_Objects>{

	@Override
	public int compare(Emp_Custom_Objects o1,Emp_Custom_Objects o2) {
		return (int)(o1.getEmpSal()-o2.getEmpSal());
	}
	
}
