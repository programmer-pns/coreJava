package com.pack3.permanent;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreams {
	public void bufferedInput() throws IOException{
		System.out.println("Buffered Input Stream");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("path"));
		System.out.println("File Connected");
		int x;
		while((x=bis.read())!=-1) {
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Buffered Input Successful");
		bis.close();
	}
	public void bufferedOutput() throws IOException{
		System.out.println("Buffered Output Stream");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("path"));
		System.out.println("File Connected");
		String str="Java Is Awesome";
		byte[] arr=str.getBytes();
		bos.write(arr);
		System.out.println("Buffered Output Successful");
		bos.close();
	}
	public void bufferedByteCopy() throws IOException {
		System.out.println("Buffered Byte Copy Program");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("path"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("path"));
		System.out.println("Files Connected");
		int x;
		while((x=bis.read())!=-1) {
			bos.write(x);
		}
		System.out.println("File Copied Successfully");
		bis.close();
		bos.close();
	}
	/*public void bufferedReader() throws IOException {
		System.out.println("Buffered Reader");
		BufferedReader br=new BufferedReader(new FileReader("Path"));
		System.out.println("File Connected");
		int x;
		while((x=br.read())!=-1) {
			System.out.print((char)x);
		}
		System.out.println();
		System.out.println("Buffer Reader Successful");
		br.close();
	}
	public void bufferedwriter() throws IOException{
		System.out.println("Buffered Writer");
		BufferedWriter bw=new BufferedWriter(new FileWriter("Path"));
		System.out.println("File Connected");
		String str="Java is Awesome";
		bw.write(str);
		System.out.println("Buffer Writer Succssful");
		bw.close();
	}
	public void bufferCharacterCopy() throws IOException{
		System.out.println("Buffered Character Stream Copy");
		BufferedReader br=new BufferedReader(new FileReader("Path"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("Path"));
		System.out.println("Files Connected");
		int x;
		while((x=br.read())!=-1) {
			bw.write(x);
		}
		System.out.println("File Copied Successfully");
		br.close();
		bw.close();
	}*/
	public static void main(String[] args) throws IOException {
		BufferedStreams bs=new BufferedStreams();
		bs.bufferedInput();
		bs.bufferedOutput();
		bs.bufferedByteCopy();
//		System.out.println("---------------------------");
//		System.out.println("---------------------------");
//		bs.bufferedReader();
//		bs.bufferedwriter();
//		bs.bufferCharacterCopy();
	}
}