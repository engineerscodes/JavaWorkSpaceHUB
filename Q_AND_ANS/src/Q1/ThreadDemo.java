/**
 * 
 */
package Q1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class ThreadDemo 
{     static Scanner nav=new Scanner(System.in);
    public static void main(String...strings) throws InterruptedException
    {     int x[];
    	 
    	 System.out.println("Enter the Size of x :n");
    	  x=new int[nav.nextInt()];
    	  System.out.println("Enter the elements in x Array");
    	  for(int i=0;i<x.length;i++)
    	  {
    		  x[i]=nav.nextInt();
    	  }
    	  A t1=new A();
     	  B t2=new B();
    	 t1.start();
    	 t2.start();
    	 t1.join();
    	 t2.join();
    	 int temp[] =t1.merge(x);
    	 t2.printing(temp);
    	 
    }
}


class A  extends Thread{
    int y[];
   Scanner nav=new Scanner(System
		   .in);
	@Override
	public void run() 
	{   
	    System.out.println("Enter the Size of Y :M :");
	    
	    y=new int[nav.nextInt()];
	    System.out.println("Enter the Element of y");
	    for(int i=0;i<y.length;i++)
	    {
	    	y[i]=nav.nextInt();
	    }
	    System.out.println(Thread.currentThread().getName());
	}
	
	synchronized int [] merge(int x[])
	{
		int temp[]=new int[x.length+y.length];
		int i;
		for(i=0;i<x.length;i++)
		{
			temp[i]=x[i];
		}
		for(int j=0;j<y.length;j++)
		{
			temp[i+j]=y[j];
		}
		return temp;
	}
	
	
	
}

class B   extends Thread {

	synchronized void printing(int merge[])
	{   System.out.println("Element is Array After removing Even Number :");
		for(int i=0;i<merge.length;i++)
		{
			if( merge[i]%2!=0) {System.out.print(merge[i]+" ");}
		}
		System.out.println();
		 System.out.println(Thread.currentThread().getName());
	}

	@Override
	public void run() {
		
	}
}


