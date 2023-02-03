package com.pack3.permanent;

public class Daemon_Thread extends Thread {
	public void run() {
		int i = 1;
		while(true) {
			System.out.println("Daemon"+ i++);
		}
	}
	public static void main(String[] args) {
		Daemon_Thread dt_obj= new Daemon_Thread();
		Thread t1 = new Thread(dt_obj);
		t1.setDaemon(true);
		t1.start();
		for(int i =0;i<=10;i++) {
			System.out.println("main thread "+i);
		}
	}
}
