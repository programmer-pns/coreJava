package com.pack3.permanent;

public class Dead_Lock extends Thread{
	public static void main(String[] args) {
		final String java = "Java";
		final String python = "Python";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(java){
					System.out.println("Thread1 is holding java");
					System.out.println("Thread1 is going to sleep now");
					try {
						Thread.sleep(100);
						}
					catch(InterruptedException ie) {
							System.out.println("Got the exception");
						}
					synchronized(python) {
						System.out.println(" Thread1 is holding python");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(python){
					System.out.println("Thread2 is holding Python");
					System.out.println("Thread2 is going to sleep now");
					try {
						Thread.sleep(100);
						}
					catch(InterruptedException ie) {
							System.out.println("Got the exception");
						}
					synchronized(java) {
						System.out.println(" Thread2 is holding java");
					}
				}

				System.out.println("No_DeadLock");
			}
		};
		t1.start();
		t2.start();
	}
}
