package com.pack1;

import java.util.Scanner;

public class ClassE {
	public static void main(String[] argh) {
		
		
		
		
		
		
		
		/*************************************************************************/
		Scanner sc = new Scanner(System.in);
		int TIMES = sc.nextInt();

		for (int i = 1; i <= TIMES; i++) {
			String INPUT = sc.next();
			long n = 0;
			try {
				n = Long.valueOf(INPUT);

				double BYTE_TYPE = Math.pow(2, 7);
				double SHORT_TYPE = Math.pow(2, 15);
				double INT_TYPE = Math.pow(2, 31);
				double LONG_TYPE = Math.pow(2, 63);

				System.out.println(INPUT + " can be fitted in: ");

				if (n >= -LONG_TYPE && n <= LONG_TYPE - 1) {
					if (n >= -INT_TYPE && n <= INT_TYPE - 1) {
						if (n >= -SHORT_TYPE && n <= SHORT_TYPE - 1) {
							if (n >= -BYTE_TYPE && n <= BYTE_TYPE - 1) {
								System.out.println("* byte");
								System.out.println("* short");
								System.out.println("* int");
								System.out.println("* long");
							}
							else {
								System.out.println("* short");
								System.out.println("* int");
								System.out.println("* long");
							}
						}
						else {	
							System.out.println("* int");
							System.out.println("* long");
						}
					}
					else {
						System.out.println("* long");
					}
				}
			} catch (Exception e) {
				System.out.println(INPUT + " can't be fitted anywhere.");
			}

		}
		sc.close();
	}
}
