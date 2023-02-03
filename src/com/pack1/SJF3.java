package com.pack1;

import java.util.Comparator;

public class SJF3 implements Comparable<SJF1>{


	@Override
	public int compareTo(SJF1 o) {
		return o.getAT() - o.getAT();
	}
	
}
