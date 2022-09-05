package question2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Userage {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter age of perspon in yyyy-mm-dd formate");
		String date=input.next();
		try {
			DateTimeFormatter dat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date1=LocalDate.parse(date,dat);
			
			LocalDate date2=LocalDate.now();
		   Period pd=Period.between(date1, date2);
		   if(pd.getYears()<0) {
			   System.out.println("suplied date not be in future ");
			   
		   }
		   else {
			   System.out.println(" age of user is :"+pd);
		   }
		}
		catch (DateTimeException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
	
		
		
	}

}
