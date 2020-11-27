/**
 * 
 */
package Day9;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Series 
{

	public Series() 
	{
		
	}

	public static void main(String[] args) 
	{
	  prints p=new prints();
	  p.setName("TH1");
	  p.start();
	 printss p2=new printss();
	 p2.setName("TH2");
	 p2.start();
	}

}

class prints extends Thread{
	public void run()
	{
		  System.out.println("--------------------Number's Divisble By 3-----------------------------------");
		   int i=0;
			while(true)
			{	if(i%3==0)
				System.out.println(i); i++;
				 try {
			            Thread.sleep(fibo.getfibo());
			         } catch (Exception e) {
			            System.out.println(e);
			         }
				
			}
		}
	
	}

class printss extends Thread{
	
	public void run()
	{
	System.out.println("English Aplhabets circular----");
			int i=0;
			while(true)
			{  
				System.out.println("ALPHA :"+(char)(i+65));
				i++;
				i=i%26;
				 try {
			            Thread.sleep(fibo.getfibo());
			         } catch (Exception e) {
			            System.out.println(e);
			         }
			}
		
	}
}

class fibo{
	
	public static int getfibo()
	{   Random r=new Random();
	   
		 int n =  r.nextInt(100), t1 = 0, t2 = 1;
		 
	        for (int i = 1; i <= n; ++i)
	        {   
	        	
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	        return t2;
	}
}
