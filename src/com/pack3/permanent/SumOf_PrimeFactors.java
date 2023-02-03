package com.pack3.permanent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SumOf_PrimeFactors {
		public int meth1(int number) {
			//finding complete factors for number
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=1;i<=number;i++) {
				if(number%i==0)
					al.add(i);
			}
			//choosing prime factors from "al" and adding them to "new_al"
			ArrayList<Integer> new_al = new ArrayList<Integer>();
			for(int i=1;i<al.size()-1;i++) {
				boolean value = true;
				int fact = al.get(i);
				if(fact!=2) {
					for(int j=2;j<fact;j++) {
						if(fact%j==0)
							value = false;
					}
					if(value==true)
						new_al.add(fact);
				}
				else
					new_al.add(2);
			}
			//code for sum of prime factors
			int sum = 0;
			Iterator<Integer> ite2 = new_al.iterator();
			while(ite2.hasNext())
				sum += ite2.next();
			return sum;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			int sum = new SumOf_PrimeFactors().meth1(number);
			sc.close();
			System.out.println(sum);
			}
	}
