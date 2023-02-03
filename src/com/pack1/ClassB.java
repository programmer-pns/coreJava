package com.pack1;

import java.util.ArrayList;

public class ClassB {

	public String meth1(String str) {
		String arr[] = str.split("");
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		for(int i=0;i<arr.length-2;i++) {
			al.add(i, al.get(i+2));
			al.remove(i+3);
		}
		String str2 = "";
		for(int i=0;i<arr.length;i++) {
		str2+=al.get(i);
		}
		return str2;
	}
	public static void main(String[] args) {
		String str = "abcabcabcabc";
		System.out.print(new ClassB().meth1(str));
	}
}