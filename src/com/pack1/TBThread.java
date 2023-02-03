package com.pack1;

//TicketBookingThread.java

public class TBThread extends Thread{

	private static int AVAIL_TICKET = 3;
	
	private int ticketCount;
	private String name;
	public TBThread(){

	}
	public TBThread(String name,int ticketCount){
		this.name = name;
		this.ticketCount = ticketCount;
	}
	public void book(String name, int ticketCount){
		if(AVAIL_TICKET>=ticketCount && ticketCount > 0){
			System.out.println(name+" - "+ticketCount+"tickets booked successfully...");
			AVAIL_TICKET = AVAIL_TICKET - ticketCount;
//			 System.out.println(Thread.currentThread().getName());
			System.out.println(AVAIL_TICKET);
		}
		else{
			System.out.println(name+"- No tickets available...");
		}
	}
	@Override
	public void run(){
		// System.out.println("Run called");
		book(name,ticketCount);
	}
	public static void main(String[] args){
	TBThread tb1 = new TBThread("Ram",2);
	TBThread tb2 = new TBThread("Hari",2);

	tb1.setName("tb1");
	tb2.setName("tb2");

	tb1.start();
	tb2.start();


	}
}