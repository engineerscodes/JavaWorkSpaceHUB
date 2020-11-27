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
public class CreateUser {

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public 	String number;
    static Scanner nav=new Scanner(System.in);

	public CreateUser()
	{
		
	}
	
	public void val()
	{
		 System.out.println("Enter the number :");
	    	number=nav.next();
	    	
	}
	public void length()
    {
    	String s=number+"";
    	String temp[]=s.split("");
    	if(s.length()>=10)
    	{ if(s.length()==11)
	 	   {
	 		 if(!temp[0].equals("0"))
	 		 {   
	 			 throw new ArithmeticException("The First LEtter should  be Zero :"); 
	 			
	 		 }
	 	   }  
	 	if(s.length()==12)
	 	{
	 		if(!(temp[0].equals("9") && temp[1].equals("1")) )
			 {
				 throw new ArithmeticException("The First LEtter should not be 9 and Second Must be 1 :"); 
			 }
	 	}
	 	if(s.length()>=13)
	 	{
	 		if(!(temp[0].equals("0") && temp[1].equals("9") && temp[2].equals("1")) )
				 throw new ArithmeticException("The Number Must be Less Than 13 :"); 
	 	}
	 	
 		
 	else {System.out.println("Number is valid :"+number);}}
    }
public static void main(String[] args) 
{  CreateUser c=new CreateUser();
    c.val();
	
   while(true) {
	   try {
    	c.length();
    	System.out.println("Done ");
    	break;
    }
    catch(ArithmeticException e)
    {
    	System.out.println("Exception catugth -> :"+e.getMessage());
    	c.setNumber(nav.next());
    	//c.length();
    }
   }
}

}

