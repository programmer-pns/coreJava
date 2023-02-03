package com.pack3.permanent;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class BlobPhotoInsert{
	BlobPhotoInsert(){
		try(Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","SYSTEM","TIGER");
			Scanner sc = new Scanner(System.in);
			){
			if(conn != null && sc != null){
				System.out.println("Enter the number of employees you want to update");
				int number = sc.nextInt();
				for(int p = 1;p<=number;p++){
					System.out.print("Enter EMP_ID: ");
					int empID = sc.nextInt();
					System.out.print("Enter Photo_Name without Extension");
					String photoNAME = sc.next();
					String filePath = "emp_photo/"+photoNAME+".jpg";
					try(FileInputStream fis = new FileInputStream(filePath);){
						String PHOTO_QUERY = "UPDATE LONG_EMP SET PHOTO = ? WHERE EMP_ID = ?" ;
						try(PreparedStatement ps = conn.prepareStatement(PHOTO_QUERY);){
							int count = 0;
							if(ps!=null){
									ps.setBlob(1,fis);
									ps.setInt(2,empID);
									count = ps.executeUpdate();
							}
							if(count==0){
								System.out.println("Record not inserted");
							}
							else{
								System.out.println("Record is inserted");
							}
					}
					}
				}
			}
		}
		catch(SQLException se){
			System.out.println("Something went wrong");
			se.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new BlobPhotoInsert();
	}
}