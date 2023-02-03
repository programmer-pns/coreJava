package com.pack4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamsPractice1
{
	void fileReader() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Priyabrata Nayak\\Downloads\\fileWriter.txt");
		System.out.println("File Assigned");
		System.out.println("Reading the File");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.println(i);
		}
		System.out.println();
		fis.close();
		System.out.println("File is Read");
	}
	void fileWriter() throws IOException
	{
		System.out.println("Writing a File");
		String fwp="Java File Writer Program 2.0";
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Priyabrata Nayak\\Downloads\\fileWriter.txt");
		System.out.println("File is being created");
		fos.write(fwp.getBytes());
		fos.close();
		System.out.println("File is Written");
	}
	void fileCopy() throws IOException
	{
		System.out.println("File Coping Program");
		FileInputStream fis=new FileInputStream("C:\\Users\\Priyabrata Nayak\\Downloads\\fileWriter.txt");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Priyabrata Nayak\\Downloads\\fileCopy.txt");
		int i;
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
		System.out.println("File Copied Successfully");
		fis.close();
		fos.close();
		}
	public static void main(String[] args)throws Exception 
	{
		IOStreamsPractice1 obj=new IOStreamsPractice1();
		obj.fileWriter();
		obj.fileReader();
		obj.fileCopy();
	}
}
