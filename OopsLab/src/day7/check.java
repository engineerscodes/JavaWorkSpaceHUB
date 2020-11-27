/**
 * 
 */
package day7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class check {
	public 	String number;
    static Scanner nav=new Scanner(System.in);

	public check()
	{
		 System.out.println("Enter the number :");
	    	number=nav.next();
	    	length();
	}
	
	 public void length()
	    {
	    	String s=number+"";
	    	String temp[]=s.split("");
	    	if(s.length()>=10)
	    	{   if(s.length()==11)
		 	   {
		 		 if(!temp[0].equals("0"))
		 		 {   
		 			 throw new ArithmeticException("The First LEtter should not be Zero :"); 
		 			
		 		 }
		 	   }  
		 	if(s.length()==12)
		 	{
		 		if(!(temp[0].equals("9") && temp[1].equals("1")) )
				 {
					 throw new ArithmeticException("The First LEtter should not be Zero :"); 
				 }
		 	}
		 	if(s.length()==13)
		 	{
		 		
					 throw new ArithmeticException("The Number Must be Less Than 13 :"); 
		 	}
	    		throw new ArithmeticException("Phone Number Must be Less Than 10 :");
	    	} 
	 		
	 	else {System.out.println("Number is valid :"+number);}
	    }
	public static void main(String[] args) 
	{
		try{check v=new check();}
	   catch(InputMismatchException e) {System.out.println(e.getClass().getName());}
	}
}

