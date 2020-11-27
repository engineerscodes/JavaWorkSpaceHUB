/**
 * 
 */
package day2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class volews 
{  ArrayList <Character> vol=new ArrayList();
     String s;
	public volews(String input) 
	{  int vowels=0;
		char str[]=input.toCharArray();
		for(int i=0;i<str.length;i++)
		{    
			 if (str[i] == 'a' || str[i] == 'e' || str[i]== 'i' || str[i] == 'o' || str[i] == 'u' ||str[i] == 'A' || str[i] == 'E' || str[i]== 'I' || str[i] == 'O' || str[i] == 'U') 
			 {   vowels++; 
			     vol.add(str[i]);
			 }
		}
	System.out.println("All the Vowels in String :"+vol);
	}
	public volews(char str[]) 
	{  int sum=0;
		
		for(int i=0;i<str.length;i++)
		{    
			 if (str[i] >= '0' && str[i] <= '9') 
			 {   String temp=str[i]+"";
			     sum=sum+Integer.parseInt(temp);
			 }
		}
	System.out.println("All the Sum of Digits in String :"+sum);
	}
	 
	 public static void main(String ...strings)
	 {  
		 Scanner nav=new Scanner(System.in);
		 System.out.println("Enter the String :");
		 String in=nav.nextLine();
		 volews v=new volews(in);
		 volews ch=new volews(in.toCharArray());
	 }

}

