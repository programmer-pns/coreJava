package com.pack3.permanent;

import java.util.ArrayList;
import java.util.Scanner;

public class EndOfFile {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        ArrayList<String> al=new ArrayList<String>();
	        boolean val;
	        do{ 
	            String str = new String(sc.nextLine());
	            al.add(str);
	            val=str.contains("end-of-file"); 
	         }
	         while(val==false);
	         for(int i=0;i<=al.size()-1;i++){
	             System.out.print((i+1)+" "+al.get(i));
	             System.out.println();
	         }
	         sc.close();
	    }
}