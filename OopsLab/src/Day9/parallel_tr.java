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
public class parallel_tr 
{

	public parallel_tr() 
	{
		
	}

	public static void main(String[] args) 
	{
		print p=  new print();
		p.setName("TH1");
		p.start();
		print p1=new print();
		p1.setName("TH2");
		
		try {
			p.join();
			p1.start();
			p1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println("Parelle Threads-------------------------------------------------------->");
		print p3=new print();
		p3.setName("TH3");
		p3.start();
		print p4=new print();
		p4.setName("TH4");
		p4.start();
		
	}

}

class print extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equalsIgnoreCase("TH1") ||Thread.currentThread().getName().equalsIgnoreCase("TH3"))
		{  System.out.println("----------------------------Prime Number's Zero to 100 ------------------------------------------------");
			for(int i=2;i<=100;i++)
			{   int flag=0;
				//System.out.println("Number :"+i);
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{  flag=-1;
						break;}
				}
				if(flag==0)System.out.println("Number :"+i);
			}
		}
		if(Thread.currentThread().getName().equalsIgnoreCase("TH2") ||Thread.currentThread().getName().equalsIgnoreCase("TH4"))
		{
		System.out.println("----------------------------palindrome numbers  10 to 1000 ------------------------------------------------");
		  for(int i=10;i<=1000;i++)
		  {   int num=0;
			  int n=i;
			  while(n>0)
			  {
				  num=num*10+n%10;
				  n=n/10;
				  
			  }
			  if(num==i) {System.out.println("Number is palindrome :"+i);}
		  }
		}
		
	}
}
