/**
 * 
 */
package day7;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Validations
{   public  int number;
    static Scanner nav=new Scanner(System.in);

    public void  Validate() throws InputMismatchException
    {   System.out.println("Enter the number :");
    	number=nav.nextInt();
    	length();
    }
    
    public void length()
    {
    	String s=number+"";
    	String temp[]=s.split("");
    	if(s.length()<=10)
    	{  
    		throw new ArithmeticException("Phone Number Must be Less Than 10 :");
    	} 
 		if(s.length()==11)
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
    }
	public static void main(String[] args) 
	{
		Validations v=new Validations();
	}

}

