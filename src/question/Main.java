package question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{ System.out.println("start of main..");
	Scanner sc = new Scanner(System.in);
	
	String message = null;

	try {
		
		System.out.println("Enter num1");
		
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		
		int num2 = sc.nextInt();
		
		
		int num3 = num1 / num2;
		
		
		if(num3 > 10){
		message = "Welcome to Exception Handling ";
		}
		else {
			message="String value is null";
		}
		System.out.println("Message is :"+message.toUpperCase());
	}
	catch (InputMismatchException e) {
		System.out.println("Enter valid number insted of String");
		System.out.println(e.getMessage());
		
	}
	catch (ArithmeticException e) {
		  System.out.println(e.getMessage());
		  System.err.println("num 2 Cant be zero");
	}
	
	
	
	System.out.println("end of main");
	}

}
