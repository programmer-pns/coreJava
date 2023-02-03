package com.pack1;

public class DateInsertInDB {
	DateInsertInDB(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Class is not found");
		}
				
		System.out.println("Date is now inserted");
	}
	public static void main(String[] args) {
		new DateInsertInDB();
	}
}
