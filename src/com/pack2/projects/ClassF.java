package com.pack2.projects;

import java.util.Scanner;

import java.util.ArrayList;

public class ClassF 
{
	Scanner sc1 = new Scanner(System.in);
	static int productCode1,productCode2,productCode3,productCode4;
	static int quantity;
	static int cost,totalCost,price;
	static String productName;
	static int productCost,calling;
	static int category;
	static ArrayList<Integer> costAL=new ArrayList<Integer>();
	static ArrayList<String> productNameAL=new ArrayList<String>();
	static ArrayList<Integer> quantityAL=new ArrayList<Integer>();
	void meth1() 
	{
		System.out.println("Available Products In The Store");
		System.out.println("_______________________________");
		System.out.println("1)Fruits");
		System.out.println("2)Vegetable");
		System.out.println("3)Cosmetics");
		System.out.println("4)Masala Powder");
		System.out.println("Please Enter Your Choice?");
		System.out.println("_______________________________");
		System.out.println("_______________________________");
		category=sc1.nextInt();
		new ClassF().meth2();
	}
	void meth2()
	{
		ClassF obj2=new ClassF();

		switch (category)
		{
		case 1:
			System.out.println("You Have Selected Fruits");
			System.out.println("========================");
			obj2.fruits();
			break;
		case 2:
			System.out.println("You Have Selected Vegetables");
			System.out.println("============================");
			obj2.vegetables();
			break;
		case 3: 
			System.out.println("You Have Selected cosmetics");
			System.out.println("===========================");
			obj2.cosmetics();
			break;
		case 4:
			System.out.println("You Have Selected Masala Powders");
			System.out.println("================================");
			obj2.masala();	
			break;
		default: System.out.println("Please Give a Valid Number Selection within 1 to 4");
		obj2.meth1();
		}
	}
	void fruits() 
	{
		System.out.println("Product Code - Product Name - Per KG Price");
		System.out.println("============================================");
		System.out.println("101 - Apple - 200Rs");
		System.out.println("102 - Grapes - 180Rs");
		System.out.println("103 - Mango - 140Rs");
		System.out.println("104 - Litchi - 220Rs");
		System.out.println("105 - Pomegranate - 160Rs");
		System.out.println("106 - Orange - 85Rs");
		System.out.println("============================================");
		System.out.println("Please Choose Your Product Code !");
		productCode1=sc1.nextInt();
		ClassF obj3=new ClassF();
		calling=1;
		obj3.pc1();
	}
	void vegetables() 
	{
		System.out.println("Product Code - Product Name - Per KG Price");
		System.out.println("===========================================");
		System.out.println("201 - Potato - 40Rs");
		System.out.println("202 - Bringal - 30Rs");
		System.out.println("203 - Carrot - 70Rs");
		System.out.println("204 - Ladies Finger - 35Rs");
		System.out.println("205 - Beetroot - 80Rs");
		System.out.println("206 - Mushroom - 160Rs");
		System.out.println("===========================================");
		System.out.println("Please Choose Your Product Code !");
		productCode2=sc1.nextInt();
		ClassF obj3=new ClassF();
		calling=2;
		obj3.pc2();
	}
	void cosmetics() 
	{
		System.out.println("Product Code - Product Name - Price");
		System.out.println("=====================================");
		System.out.println("301 - Face Cream - 65Rs");
		System.out.println("302 - Sun Cream - 155Rs");
		System.out.println("303 - Body Lotion - 110Rs");
		System.out.println("304 - Lipstick - 40Rs");
		System.out.println("305 - Kajol- 50Rs");
		System.out.println("306 - Soap - 25Rs");
		System.out.println("=====================================");
		System.out.println("Please Choose Your Product Code !");
		productCode3=sc1.nextInt();
		ClassF obj3=new ClassF();
		calling=3;
		obj3.pc3();
	}
	void masala() 
	{
		System.out.println("Product Code - Product Name - Price");
		System.out.println("=====================================");
		System.out.println("401 - Chicken Masala(100gms)- 100Rs");
		System.out.println("402 - Meat Masala(40gms) - 40Rs");
		System.out.println("403 - Garam Masala(40gms) - 60Rs");
		System.out.println("404 - Sambar Masala(100gms) - 120Rs");
		System.out.println("405 - Curry Powder(50gms) - 20Rs");
		System.out.println("406 - Biriyani Powder(50gms) - 80Rs");
		System.out.println("=====================================");
		System.out.println("Please Choose Your Product Code !");
		productCode4=sc1.nextInt();
		ClassF obj3=new ClassF();
		calling=4;
		obj3.pc4();
	}
	void pc1() 
	{
		ClassF obj=new ClassF();
		switch(productCode1)
		{
		case 101 : 
			System.out.println("Apple is the best Choice");
			productName= "Apple";
			productCost=200;
			obj.meth3();
			break;
		case 102 :
			productName= "Grapes";
			productCost=180;
			obj.meth3();
			break;
		case 103 :
			productName= "Mango";
			productCost=140;
			obj.meth3();
			break;
		case 104 :
			productName= "Litchi";
			productCost=220;
			obj.meth3();
			break;
		case 105 : 
			productName= "Pomegranate";
			productCost=160;
			obj.meth3();
			break;
		case 106 :
			productName= "Orange";
			productCost=85;
			obj.meth3();
			break;
		default:
			System.out.println("Please Do A Valid Product Code Selection");
			obj.fruits();
			break;
		}
	}
	void pc2() 
	{
		ClassF obj=new ClassF();
		switch(productCode2) 
		{
		case 201 :
			productName= "Potato";
			productCost=40;
			obj.meth3();
			break;
		case 202 :
			productName= "Bringal";
			productCost=30;
			obj.meth3();
			break;
		case 203 :
			productName= "Carrot";
			productCost=70;
			obj.meth3();
			break;
		case 204 :
			productName= "Ladies Finger";
			productCost=35;
			obj.meth3();
			break;
		case 205 :
			productName= "Beetroot";
			productCost=80;
			obj.meth3();
			break;
		case 206 :
			productName= "Mushroom";
			productCost=160;
			obj.meth3();
			break;
		default:
			System.out.println("Please Do A Valid Product Code Selection");
			obj.vegetables();
			break;
		}
	}
	void pc3()
	{	
		ClassF obj=new ClassF();
		switch(productCode3)
		{
		case 301 :
			productName= "Face Cream";
			productCost=65;
			obj.meth3();
			break;
		case 302 :
			productName= "Sun Cream";
			productCost=155;
			obj.meth3();
			break;
		case 303 :
			productName= "Body Lotion";
			productCost=110;
			obj.meth3();
			break;
		case 304 :
			productName= "Lipstick";
			productCost=40;
			obj.meth3();
			break;
		case 305 :
			productName= "Kajol";
			productCost=50;
			obj.meth3();
			break;
		case 306 :
			productName= "Soap";
			productCost=25;
			obj.meth3();
			break;
		default:
			System.out.println("Please Do A Valid Product Code Selection");
			obj.cosmetics();
			break;
		}
	}
	void pc4() 
	{
		ClassF obj=new ClassF();
		switch(productCode4)
		{
		case 401 :
			productName= "Chicken Masala(100gms)";
			productCost=100;
			obj.meth3();
			break;
		case 402 :
			productName= "Meat Masala(40gms)";
			productCost=40;
			obj.meth3();
			break;
		case 403 :
			productName= "Garam Masala";
			productCost=60;
			obj.meth3();
			break;
		case 404 :
			productName= "Sambar Masala";
			productCost=120;
			obj.meth3();
			break;
		case 405:
			productName= "Curry Powder";
			productCost=20;
			obj.meth3();
			break;
		case 406 :
			productName= "Biriyani Powder";
			productCost=80;
			obj.meth3();
			break;	
		default:
			System.out.println("Please Do A Valid Product Code Selection");
			obj.masala();
			break;
		}
	}
	void meth3() 
	{
		productNameAL.add(productName);
		ClassF obj4=new ClassF();
		switch(calling) 
		{
		case 1:
			System.out.println("Please Choose The Quantity (in KiloGrams) You Want?");
			quantity=sc1.nextInt();
			obj4.meth4();
			obj4.meth5();
			break;
		case 2:
			System.out.println("Please Choose The Quantity (in KiloGrams) You Want?");
			quantity=sc1.nextInt();
			obj4.meth4();
			obj4.meth5();
			break;
		case 3:
			System.out.println("Please Choose The Quantity (in numbers) You Want?");
			quantity=sc1.nextInt();
			obj4.meth4();
			obj4.meth5();
			break;
		case 4:
			System.out.println("Please Choose How Many Packets Do You Want?");
			quantity=sc1.nextInt();
			obj4.meth4();
			obj4.meth5();
			break;
		}
	}
	public void meth4() 
	{
		quantityAL.add(quantity);
		cost=productCost*quantity;
		costAL.add(cost);
		totalCost=cost+totalCost;
	}
	public void meth5() {
		System.out.println("Do you wish To Continue Shopping");
		System.out.println("1)Yes, Continue");
		System.out.println("2)No, Go to Payment");
		System.out.println("=================================");
		int selection=sc1.nextInt();
		if(selection==1) 
		{
			meth1();
		}
		else if(selection==2)
		{
			System.out.println("Refering to Payment Section.........");
			bill();
		}
		else
		{
			System.out.println("Please Do a Valid Selection 1 or 2");
			meth5();
		}
	}
	void bill() 
	{
		System.out.print("Enter your Name: ");
		String name=sc1.nextLine();
		System.out.print("Enter your Address: ");
		String add=sc1.nextLine();
		System.out.print("Enter your Contact Number: ");
		String contact=sc1.nextLine();
		System.out.println("===Welcome to Shopkart====");
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("S.no.  | Qty  | Name | Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<=costAL.size()-1;i++) 
		{
			System.out.println("   "+ (i+1) +"    |  "+quantityAL.get(i)+"  |  "+productNameAL.get(i)+" | "+costAL.get(i));
		}
		System.out.println("--------------------------------------");
		new ClassF().discount();
		System.out.println(name);
		System.out.println(add);
		System.out.println(contact);
		System.out.println("------------------------------------------------");
		System.out.println(" Please Visit Again ");
	}
	public void discount() {
		int dis= (5*totalCost/100);
		System.out.println("Total Bill of Purchased Items is : "+totalCost);
		System.out.println("You recieved a discount of 5%: "+dis);
		System.out.println("Final Bill amount is: "+(totalCost-dis));
		System.out.println("=====Thank You For shoping with Us. You saved "+dis+" rupees.=====");
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Shopkart");
		System.out.println("-------------------");
		ClassF obj1=new ClassF();
		obj1.meth1();
	}
}
