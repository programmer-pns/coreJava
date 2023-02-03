package com.pack5;

import java.util.Comparator;

public class LJF_Comparator_BT implements Comparator<LJF1>{

	@Override
	public int compare(LJF1 o1, LJF1 o2) {
		// TODO Auto-generated method stub
		return o1.getBT()-o2.getBT();
	}

}
