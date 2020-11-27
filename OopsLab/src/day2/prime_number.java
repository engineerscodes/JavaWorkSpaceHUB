/**
 * 
 */
package day2;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class prime_number
{
    private int num;
	public prime_number(int num)
	{
		this.num=num;
	}

	private boolean checkprime()
	{
		if(num<=1)
			return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{  Scanner nav=new Scanner(System.in);
	    System.out.println("Enter the number to find is prime or not ");
		prime_number p=new prime_number(nav.nextInt());
		System.out.println("The number is  prime :"+p.checkprime());
	}

}

