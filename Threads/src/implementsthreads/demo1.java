/**
 * ImplementS Runnable must Implement run()
 */
package implementsthreads;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo1 implements Runnable
{

	public demo1() 
	{

	}
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) 
	{
         Thread t1=new Thread(new demo1());
         t1.start();
	}

}
