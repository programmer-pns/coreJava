package com.pack3.permanent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp_problem{
	void meth1() {
		ArrayList<Emp_Custom_Objects> al=new ArrayList<Emp_Custom_Objects>();		

		Emp_Custom_Objects co1 = new Emp_Custom_Objects("Ajay",32,34000);
		Emp_Custom_Objects co2 = new Emp_Custom_Objects("Kishan",25,10000);
		Emp_Custom_Objects co3 = new Emp_Custom_Objects("Suman",23,40000);
		Emp_Custom_Objects co4 = new Emp_Custom_Objects("Priya",30,21700);
		Emp_Custom_Objects co5 = new Emp_Custom_Objects("Bijay",20,29000);
		al.add(co1);al.add(co2);al.add(co3);al.add(co4);al.add(co5);
		
		System.out.println("===========Not Increased=========");
		al.forEach(not_increased->System.out.println(not_increased));
		
		
		Stream<Emp_Custom_Objects> s1=al.stream();
		Stream <Emp_Custom_Objects> s2=s1.map(data->{
			if(data.getEmpAge()>25)
				data.setEmpSal((float)data.getEmpSal()+(data.getEmpSal()/10));
			return data;
		});
		
		
		ArrayList<Emp_Custom_Objects> al2=(ArrayList<Emp_Custom_Objects>)s2.collect(Collectors.toList());
		System.out.println("========Increased but not Sorted=========");
		for(Object obj:al2) {
			System.out.println(obj);
		}
		
		System.out.println("===++==++==++==++==+\"Finally Sorted\"+==++==++==++==++===");
		Collections.sort(al2,new Emp_Comparator());
		al2.forEach(data->System.out.println(data));
	}
	public static void main(String[] args) {
		Emp_problem dobj=new Emp_problem();
		dobj.meth1();
	}
}
