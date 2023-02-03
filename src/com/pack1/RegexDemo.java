package com.pack1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//must be atleast 8 characters long and atmost 20 characters long
//Find a valid password or not
//must contain a digit
//must contain a lowercase
//must contain an uppercase
//must have a special character among "!,@,#,$,%,&,*,(,),-,_,+,=,^"
//should not have any space
public class RegexDemo {
	public static void checkPassword(String str) {
		if(str!=null) {
			String regexStr = "^(?=.*[0-9])"
					+ "(?=.*[a-z])(?=.*[A-Z])"
					+ "(?=.*[@#$%^&+=])"
					+ "(?=\\S+$).{8,20}$";
			String regexStr2 = "[0-9]+";
			Pattern p1 = Pattern.compile(regexStr2);
			Matcher m1 = p1.matcher(str);
			if(m1.matches()) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Not valid");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a password: ");
		checkPassword(sc.nextLine());
		sc.close();
	}
}
