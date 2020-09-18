/**
 * 
 */
package extendsthread;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Demo2 extends Thread
{

	public Demo2() 
	{

	}
	public void run()  //overriding the run method
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) 
	{
       new Demo2().start(); //This will can run method
      
	}

}
