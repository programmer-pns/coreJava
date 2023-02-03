package com.pack1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator1 implements ActionListener{
	Frame f ;
	TextField input,output;
	Button plus_btn,minus_btn,multiply_btn,divide_btn,equals_btn;
	static double m,n,k;
	public void meth1(){
		//Initializing and setting Frame
		f = new Frame();
		f.setBounds(100,100,400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("Calculator By Priyabrata");
		f.setResizable(false);
		f.setBackground(Color.getHSBColor(173.0f, 99.0f, 99.0f));
		
		//Initializing and setting Textfields
		input = new TextField();
		output = new TextField();
		
		input.setBounds(50,50,130,40);
		output.setBounds(50,100,130,40);
		
		//Adding Textfields
		f.add(input);f.add(output);
		
		//Initializing Buttons
		plus_btn = new Button("+");
		minus_btn = new Button("-");
		multiply_btn = new Button("x");
		divide_btn = new Button("/");
		equals_btn = new Button("=");
		
		//Setting Buttons Positions
		plus_btn.setBounds(50,150,60,60);
		minus_btn.setBounds(120,150,60,60);
		multiply_btn.setBounds(50,210,60,60);
		divide_btn.setBounds(120,210,60,60);
		equals_btn.setBounds(90,280,60,60);
		
		//Settings Colors for Buttons
		plus_btn.setBackground(Color.YELLOW);
		plus_btn.setForeground(Color.RED);
		minus_btn.setBackground(Color.YELLOW);
		minus_btn.setForeground(Color.RED);
		multiply_btn.setBackground(Color.YELLOW);
		multiply_btn.setForeground(Color.RED);
		divide_btn.setBackground(Color.YELLOW);
		divide_btn.setForeground(Color.RED);
		equals_btn.setBackground(Color.CYAN);
		equals_btn.setForeground(Color.GRAY);
		
		//Adding buttons to frames
		f.add(plus_btn);f.add(minus_btn);f.add(multiply_btn);f.add(divide_btn);f.add(equals_btn);
		
		//Implementing action listener
		plus_btn.addActionListener(this);
		minus_btn.addActionListener(this);
		multiply_btn.addActionListener(this);
		divide_btn.addActionListener(this);
		equals_btn.addActionListener(this);
	}
	//Overriding the acionPerformed(abstract) method present in ActionListener Interface
	@Override
	public void actionPerformed(ActionEvent e) {
		n = Integer.parseInt(input.getText());
		if(e.getSource()==plus_btn)	{	
			k+=n;
			output.setText(String.valueOf(k));
		}
		else if(e.getSource()==minus_btn)	{	
			k-=n;
			output.setText(String.valueOf(k));
		}
		else if(e.getSource()==multiply_btn)	{	
			k*=n;
			output.setText(String.valueOf(k));
		}
		else if(e.getSource()==divide_btn)	{	
			k/=n;
			output.setText(String.valueOf(k));
		}
		else	{	
			output.setText(String.valueOf(k));
		}
	}
	public static void main(String[] args) {
		Calculator1 cltrObj = new Calculator1();
		cltrObj.meth1();
	}
}
