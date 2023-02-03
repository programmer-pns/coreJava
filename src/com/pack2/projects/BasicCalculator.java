package com.pack2.projects;


import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator implements ActionListener{
	Frame f;
	TextField first_tf,second_tf,result_tf;  
	Button plus_btn,minus_btn,multiply_btn,divide_btn;
	int first,second,result;
  
    // constructor to instantiate the above objects  
    BasicCalculator() {    
    	f = new Frame();
    	f.setVisible(true);
    	f.setBounds(100,100,500,500);
    	f.setTitle("My Calculator");
    	f.setResizable(false);

    	//creating textfields
        first_tf = new TextField("Enter a number"); 
        second_tf = new TextField("Enter another number");
        result_tf = new TextField("Result");
        
        //creating buttons
        plus_btn = new Button("ADD");
        minus_btn = new Button("SUBTRACT");
        multiply_btn = new Button("MULTIPLY");
        divide_btn = new Button("DIVIDE");
        
    
        //adding textfields
        f.add(first_tf);
        f.add(second_tf);
        f.add(result_tf);

        //adding buttons
        f.add(plus_btn);f.add(minus_btn);f.add(multiply_btn);f.add(divide_btn);
        
        f.setLayout(null);//null: as we will create our own layout
        
    	
        //arranging the textfield
        
        first_tf.setBounds(50,50,200,30);
        second_tf.setBounds(50,80,200,30);
        result_tf.setBounds(50,110,200,30);
        
        //arranging the buttons
        plus_btn.setBounds(50,150,100,30);
        minus_btn.setBounds(150,150,100,30);
        multiply_btn.setBounds(50,180,100,30);
        divide_btn.setBounds(150,180,100,30);
        
        plus_btn.addActionListener(this);
        minus_btn.addActionListener(this);
        multiply_btn.addActionListener(this);
        divide_btn.addActionListener(this);
    }     
    @Override
	public void actionPerformed(ActionEvent e) {
    	//Building logic to perform operations 
    	try {
        first = Integer.parseInt(first_tf.getText());
    	}
    	catch(NumberFormatException nfe) {
    		System.out.println(first_tf.getText()+" is not a number"+"\nPlease enter a valid number\n\n");
    	}
    	try {
        second = Integer.parseInt(second_tf.getText());
    	}
        catch(NumberFormatException nfe) {
    		System.out.println(second_tf.getText()+" is not a number"+"\nPlease enter a valid number\n\n");
    	}
        
        if(e.getSource()==plus_btn) {
        	result = first + second;
            result_tf.setText(String.valueOf(result));
        }
        else if(e.getSource()==minus_btn) {
        	result = first - second;
            result_tf.setText(String.valueOf(result));
        }
        else if(e.getSource()==multiply_btn) {
        	result = first * second;
            result_tf.setText(String.valueOf(result));
        }
        else {
        	try {
        		result = first / second;
                result_tf.setText(String.valueOf(result));
        	}
        	catch(ArithmeticException ae) {
        		System.out.println("Can not divide a number by zero");
        		result_tf.setText("Undefined");
        	}
        }
	}
  
    // main method  
    public static void main(String[] args) {    
        new BasicCalculator();    
    }
	} 
