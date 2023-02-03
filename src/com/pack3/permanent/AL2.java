package com.pack3.permanent;

public class AL2 {
	String player_name;
	int player_sal;
	String player_team;
	int player_kd;
	public AL2(String player_name, int player_sal, String player_team, int player_kd) {
		this.player_name = player_name;
		this.player_sal = player_sal;
		this.player_team = player_team;
		this.player_kd = player_kd;
	}
	@Override
	public String toString() {
		return player_name+" "+player_sal+" "+player_team+" "+player_kd;
	}
}
