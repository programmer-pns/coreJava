package com.pack1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator implements ActionListener{
	Frame jf = null;
	TextArea tf = null;
	TextField tf2 = null;
	Button PLUS_BTN, MINUS_BTN, MULTIPLY_BTN, DIVIDE_BTN, EQUALS_BTN, CANCEL_BTN, AC_BTN, DECIMAL_BTN, SQRT_BTN = null;
	Button BTN0, BTN1, BTN2, BTN3, BTN4, BTN5, BTN6, BTN7, BTN8, BTN9 = null;
	Font fnt = null;
	String str = null;
	int k,m,n = 0;
	public void meth1() {
		jf = new Frame();
//		jf = new Frame();
		jf.setBounds(100, 100, 380, 530);
		jf.setVisible(true);
		jf.setTitle("Priyabrata's Calculator");
		
		tf = new TextArea("",3,2,3);
		tf2 = new TextField("");
		tf.setBounds(60,50,290,40);
		tf.setEditable(false);
		tf2.setBounds(30,50,30,40);
		tf2.setEditable(false);
		Color myColor = new Color(0,255,175);
		tf.setBackground(myColor);
		tf2.setBackground(myColor);
		jf.add(tf);
		jf.add(tf2);
		jf.setLayout(null);
		
		
		
		PLUS_BTN = new Button("+");
		MINUS_BTN = new Button("-");
		MULTIPLY_BTN = new Button("x");
		DIVIDE_BTN = new Button("/");
		EQUALS_BTN = new Button("=");
		CANCEL_BTN = new Button("Clear");
		AC_BTN = new Button("AC");
		DECIMAL_BTN = new Button(".");
		SQRT_BTN = new Button("sqrt");
		
		BTN0 = new Button("0");
		BTN1 = new Button("1");
		BTN2 = new Button("2");
		BTN3 = new Button("3");
		BTN4 = new Button("4");
		BTN5 = new Button("5");
		BTN6 = new Button("6");
		BTN7 = new Button("7");
		BTN8 = new Button("8");
		BTN9 = new Button("9");
		
		PLUS_BTN.setBounds(270,110,75,75);
		MINUS_BTN.setBounds(270,190,75,75);
		MULTIPLY_BTN.setBounds(270,270,75,75);
		DIVIDE_BTN.setBounds(190,350,75,75);
		EQUALS_BTN.setBounds(270,350,75,75);
		DECIMAL_BTN.setBounds(30,350,75,75);
		
		//Special buttons Bounds
		SQRT_BTN.setBounds(30,445,100,40);
		CANCEL_BTN.setBounds(140,445,100,40);
		AC_BTN.setBounds(250,445,100,40);
		
		BTN0.setBounds(110,350,75,75);
		BTN1.setBounds(30,110,75,75);
		BTN2.setBounds(110,110,75,75);
		BTN3.setBounds(190,110,75,75);
		BTN4.setBounds(30,190,75,75);
		BTN5.setBounds(110,190,75,75);
		BTN6.setBounds(190,190,75,75);
		BTN7.setBounds(30,270,75,75);
		BTN8.setBounds(110,270,75,75);
		BTN9.setBounds(190,270,75,75);
		
		fnt = new Font(null, 30, 30);
		

		tf.setFont(fnt);
		tf2.setFont(fnt);
		ArrayList<Button> albtn = new ArrayList<Button>();
		
		albtn.add(BTN0);albtn.add(BTN1);albtn.add(BTN2);albtn.add(BTN3);albtn.add(BTN4);
		albtn.add(BTN5);albtn.add(BTN6);albtn.add(BTN7);albtn.add(BTN8);albtn.add(BTN9);
		albtn.add(PLUS_BTN); albtn.add(MINUS_BTN); albtn.add(MULTIPLY_BTN);
		albtn.add(DIVIDE_BTN);albtn.add(EQUALS_BTN);albtn.add(CANCEL_BTN);
		albtn.add(AC_BTN);albtn.add(DECIMAL_BTN);albtn.add(SQRT_BTN);
		
		//setting fonts and adding the buttons to frame
		for(Button b : albtn) {
			b.setFont(fnt);
			jf.add(b);
			b.setBackground(Color.CYAN);
			b.addActionListener((ActionListener) this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();	
		if(obj == BTN0) {		
			tf.append("0");;
		}
		else if(obj == BTN1) {		
			tf.append("1");
		}
		else if(obj == BTN2) {		
			tf.append("2");
		}
		else if(obj == BTN3) {		
			tf.append("3");
		}
		else if(obj == BTN4) {		
			tf.append("4");
		}
		else if(obj == BTN5) {		
			tf.append("5");
		}
		else if(obj == BTN6) {		
			tf.append("6");
		}
		else if(obj == BTN7) {		
			tf.append("7");
		}
		else if(obj == BTN8) {		
			tf.append("8");
		}
		else if(obj == BTN9) {		
			tf.append("9");
		}
		else if(obj == PLUS_BTN) {	
			str = tf.getText();
			tf2.setText("+");
			}
		else if(obj == MINUS_BTN) {		
			tf.getText();
			tf2.setText("-");
		}
		else if(obj == MULTIPLY_BTN) {		
			tf.getText();
			tf2.setText("x");
		}
		else if(obj == DIVIDE_BTN) {		
			tf.getText();
			tf2.setText("/");
		}
		else if(obj == EQUALS_BTN) {
			tf.getText();
			tf2.setText("/");
		}
		else if(obj == CANCEL_BTN) {		
			tf.getText();
			tf2.setText("/");
		}
		else if(obj == AC_BTN) {		
			tf.getText();
			tf2.setText("/");
		}
		else if(obj == DECIMAL_BTN) {		
			tf.getText();
			tf2.setText("");
		}
		else{		
			tf.getText();
			tf2.setText("sqrt");
		}
	}
	public static void main(String[] args) {
		new SimpleCalculator().meth1();
		System.out.println("");
	}
}


