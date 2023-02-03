package com.pns.practice.jdbc.permanent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_1ConnectionBasics {
	public void meth1() throws SQLException, ClassNotFoundException{
		//CREATING DRIVER CLASS OBJECT
				/*
				oracle.jdbc.driver.OracleDriver obj = new oracle.jdbc.driver.OracleDriver();
				//Registering that driver object
				DriverManager.registerDriver(obj);
				*/
				//DRIVER IS REGISTERED AUTOMATICALLY ON CALLING
//				Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//IF NONE OF THE ABOVE STEP IS FOLLOWED AUTOLOADING WILL BE DONE (FROM Oracle11g//ojdbc.jar)
		
//		      Creating connection with the database
			//syntax: getConnection("address","dBUserName","dBPassWord")
		    //address: jdbc:oracle:thin:@<host>:1521:<serviceID/SID>
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","TIGER");
				Statement st = conn.createStatement();//creating connection statement
				ResultSet rs = st.executeQuery("SELECT*FROM EMP WHERE EMP_ID>107");//executing query statement
				while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2));
//				System.out.println(rs.getInt("STUID")+" "+rs.getString("STUNAME"));
				System.out.println("EMP_ID: "+rs.getString("EMP_ID"));//getString(method is applicable for all)
				System.out.println("EMP_NAME: "+rs.getString(2));
				}
				rs.close();//OPTIONAL BUT RECOMMENDED
				st.close();//OPTIONAL BUT RECOMMENDED
				conn.close();//MANDATORY TO CLOSE OTHERWISE SQL WILL BE CONNECTED FOREVER
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		new JDBC_1ConnectionBasics().meth1();
	}
}
