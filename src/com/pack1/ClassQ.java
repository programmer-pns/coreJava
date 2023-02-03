package com.pack1;

import java.util.Random;
import java.util.Scanner;

class ClassQ {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	byte array[] = str.getBytes();
	Random r = new Random();
	
    for (int i = 0; i < array.length; i++) {
        int randomIndexToSwap = r.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = (byte)temp;
    }
    for (int i = 0; i < array.length; i++) {
        System.out.print((char)array[i]);
    }
	sc.close();
}
}