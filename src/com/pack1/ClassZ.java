package com.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ClassZ{
	List<Integer> tracks = new ArrayList<Integer>();
	int min_index , head, minimum_value;
	public void getMinimum(int j) {
		while(j>0) {
			if(Math.abs(tracks.get(j-1)-head)<minimum_value) {
				minimum_value = tracks.get(j-1);
				min_index = j-1;
			}
			j--;
		}
	}
	public void meth1() {
		System.out.println("Enter the number of tracks to be written: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Enter "+i+" processes: ");
		while(i>0) {
			tracks.add(sc.nextInt());
			i--;
		}
		int seektime = 0;
		System.out.println("Enter the head: ");
		head = sc.nextInt();
		/*
		seektime = Math.abs(head-tracks.get(0));
		for(int p=0;p<tracks.size()-1;p++) {
			seektime += Math.abs(tracks.get(p)-tracks.get(p+1));
		}
		*/
		while(tracks.size()>0) {
		getMinimum(tracks.size());
		seektime +=Math.abs(head-tracks.get(min_index));
		head = tracks.get(min_index);
		tracks.remove(min_index);
		}
		System.out.println("The seektime is: "+seektime);
		sc.close();
	}
	public static void main(String[] args) {
		    ClassZ obj = new ClassZ();
		    obj.meth1();
	}

}