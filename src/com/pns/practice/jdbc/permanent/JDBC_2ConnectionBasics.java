package com.pns.practice.jdbc.permanent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_2ConnectionBasics {
	
	//WAP to use Java application as SQL+ command line
	//written with coding standards
	
	
	public void meth1() {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		Scanner sc = null;
		String query = null;
		
		//=====To handle connection with DB
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","SPOIDY");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		//=====To handle statement creation
		try {
			if(conn!=null) {
			st =conn.createStatement();
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		System.out.println("PLEASE WRITE THE QUERY(WITHOUT ';')");
		//=====To handle query input from user
		try {
			sc=new Scanner(System.in);
			query = sc.nextLine();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//=====To handle executeQuery
		try {
			if(st!=null && query!=null) {
				rs = st.executeQuery(query);
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		//=====To handle ResultSet execution
		try {
			if(rs!=null) {
				while(rs.next()==true) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
		//closing all the connections
		finally{
			try {
				rs.close();
			} catch (SQLException se) {
					se.printStackTrace();
			}
			
			try {
				st.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		new JDBC_2ConnectionBasics().meth1();
	}
}
