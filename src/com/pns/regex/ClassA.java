package com.pns.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassA {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z_A-Z-@%$*^\\d\\s]");
		Matcher m = p.matcher(" ");
		System.out.println(m.find());

	}

}
