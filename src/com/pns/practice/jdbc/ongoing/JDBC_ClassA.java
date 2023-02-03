package com.pns.practice.jdbc.ongoing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBC_ClassA {
	
	Connection conn = null;
	Statement st = null;
	String query;
	ResultSet rs = null;
	public void meth1() {
		//Registering the driver
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Another way to load the driver class
		//oracle.jdbc.driver.OracleDriver od = new oracle.jdbc.driver.OracleDriver();
		//DriverManager.registerDriver(od);
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		//Creating connections
		try {
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","TIGER");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		//Creating Statement Object
		if(conn!=null) {
			try {
				st = conn.createStatement();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		//Craeting the query to execute
		query = "SELECT EMP_ID,EMP_NAME,EMP_SAL,EMP_EXP FROM LONG_EMP WHERE LOC = 'HYDERABAD'";
		//Creating ResultSet object
		if(st!=null) {
			try {
				rs = st.executeQuery(query);
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		if(rs!=null) {
			try {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
				}
			}
			catch (SQLException se) {
				se.printStackTrace();
			}
			//Closing the connections
			finally {
				try {
					rs.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					st.close();
				} 
				catch (SQLException se) {
					se.printStackTrace();
				}
				try {
					conn.close();
				} 
				catch (SQLException se) {
					se.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args){
		new JDBC_ClassA().meth1();
	}
}
