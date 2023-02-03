package com.pack1;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.TextField;

import javax.swing.JFrame;

class ClassC{

	ClassC(){  
		JFrame jfr = new JFrame();
		  jfr.setVisible(true); 
		  jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jfr.setSize(500,500);
		  MenuBar mb = new MenuBar();
		  Menu m = new Menu("GetHelp");
		  mb.setHelpMenu(m);
		  Font fnt = new Font("Serif",2,130);
		  mb.setFont(fnt);
		  m.setFont(fnt);
		  jfr.setMenuBar(mb);
		  jfr.setCursor(null);
//		  jfr.setResizable(false);
		  jfr.setTitle("Library Management");
		  TextField tf = new TextField("Click Me");
		  jfr.add(new TextField("Submit"));
		  jfr.add(new TextField("Cancel"));
		  jfr.add(new TextField("Reset"));
		  jfr.add(tf);
		  
		  FlowLayout fl = new FlowLayout(20,10,10);
		  jfr.setLayout(fl);
		  jfr.setResizable(false);
	}    
	  
	// main method  
	public static void main(String args[]) {   
	     new ClassC();	  	
	}
}