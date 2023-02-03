package com.pack3.permanent;

public class TSObject2 implements Comparable<TSObject2>{
	private String player_name;
	private int player_sal,player_kd;
	TSObject2(String name,int salary,int kd){
		player_name= name;
		player_sal=salary;
		player_kd=kd;
	}
	public String toString() {
		return player_name+" "+player_sal+" "+player_kd;
	}
		@Override
	public int compareTo(TSObject2 o) {
		if(player_name.compareTo(o.player_name)!=0)
			return player_name.compareTo(o.player_name);
		else if(player_sal-o.player_sal != 0)
			return player_sal-o.player_sal;
		else
			return player_kd-o.player_kd;
	}
}
