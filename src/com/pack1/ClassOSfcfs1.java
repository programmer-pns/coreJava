package com.pack1;

public class ClassOSfcfs1 {
	public void meth1() {
		int AT[] = { 0, 1, 3, 5 };
		int BT[] = { 2, 3, 6, 4 };
		int CT[] = new int[4];
		int TAT[] = new int[4];
		int WT[] = new int[4];

		float ATAT = 0f;
		float AWT = 0f;

		CT[0] = BT[0];

		for (int i = 1; i < 4; i++) {
			CT[i] = BT[i] + CT[i - 1];
		}
		for (int i = 0; i < 4; i++) {
			TAT[i] = CT[i] - AT[i];
		}
		for (int i = 0; i < 4; i++) {
			WT[i] = TAT[i] - BT[i];
		}
		/*
		 * for(int i = 0;i<4;i++) {
		 * System.out.println(AT[i]+" "+BT[i]+" "+CT[i]+" "+TAT[i]+" "+WT[i]); }
		 * 
		 */
		for (int i = 0; i < 4; i++) {
			ATAT += TAT[i];
		}
		for (int i = 0; i < 4; i++) {
			AWT += WT[i];
		}

		System.out.println("ATAT :" + ATAT / 4 + "ms");

		System.out.println("AWT :" + AWT / 4 + "ms");

	}

	public static void main(String[] args) {
		new ClassOSfcfs1().meth1();
	}
}
