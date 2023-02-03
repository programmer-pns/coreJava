package com.pack1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ClassX {
	public static void calculateAge(LocalDate dob)   
	{    
	LocalDate curDate = LocalDate.now();  
	if ((dob != null) && (curDate != null))   
	{  
		int years = Period.between(dob, curDate).getYears();
		int months = Period.between(dob, curDate).getMonths();
		int days = Period.between(dob, curDate).getDays();
		System.out.println("You are"+years+" Years "+months+" months "+days+" days old.");  
	}
	}  
    public static void main(String[] args) {  
    		System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
    		Scanner scanner = new Scanner(System.in);  
    		String input = scanner.nextLine();  
    		scanner.close();  
    		try {
    			LocalDate dob = LocalDate.parse(input);
        		calculateAge(dob); 
    		}
    		catch(DateTimeParseException dte) {
    			System.out.println("This is not a valid date format, enter in the provided format");
    		}
    	}
    }