package com.pns.practice.jdbc.ongoing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_ClassB {
	public void meth1() {
		try {
			Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SYSTEM", "TIGER");
			Statement st = conn.createStatement();
			String query = "SELECT*FROM STUDENT";
			ResultSet rs=st.executeQuery(query);
		} 
		catch (SQLException e) {
			
		}
	}
	public static void main(String[] args) {
		new JDBC_ClassB().meth1();
	}
}
