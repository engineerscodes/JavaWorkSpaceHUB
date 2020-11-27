/**
 * 
 */
package Days8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class ThreadSER 
{

	public ThreadSER() {
	}

	public static void main(String[] args)
	{  System.out.println("... Multithreading ");
	   new ThreadSER().serializeObject();
	   new sumABC().start();
	   new rest().start();
	   System.out.println("... Multithreading Over............");
	}
	public void serializeObject()
	{    
		try {
			FileOutputStream f=new FileOutputStream("Output.txt");	
			ObjectOutputStream obj=new ObjectOutputStream(f);
			for(int i=0;i<10;i++)
			{
				obj.write(i);
			}
			obj.flush();
			obj.close();
		}
		catch(Exception e) {
			System.out.println(e.getClass().getName());
		}
	}
}

class sumABC extends Thread
{
	public void run()
	{   
		 ObjectInputStream obj;
		    	ArrayList n=new ArrayList();
		    int sum;
			try {
				obj=new ObjectInputStream(new FileInputStream("output.txt"));
				 System.out.println("Sum of 3>");
				  for(int i=0;i<3;i++)
				  {
					 sum=obj.read();
					 n.add(sum);
				  }
				  System.out.println(n);
				  int  a=(Integer)n.get(0);
				  int b=(Integer)n.get(1);
				  int c=(Integer)n.get(2);
				  int avg=(int) ((a+b)/2.0)-(int) ((b+c)/2.0);
				  System.out.println("Result :"+(Math.abs(avg)));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}	
}

class rest extends Thread
{
	public void run()
	{   
		 ObjectInputStream obj;
		    	ArrayList n=new ArrayList();
		    int sum=0;
			try {
				obj=new ObjectInputStream(new FileInputStream("output.txt"));
				 System.out.println("Sum :");
				  for(int i=0;i<10;i++)
				  {
					 sum=obj.read();
					 n.add(sum);
				  }
				 for(int i=1;i<n.size()-1;i++)
				 {
					 sum=((int)n.get(i)+(int)n.get(i+1))-sum;
					 sum=sum/2;
					 System.out.println("Number at :"+i+" :"+n.get(i));
				 }
				 System.out.println("AVG :"+Math.abs(sum));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}