/**
 * 
 */
package extendsthread;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo3 extends Thread
{
   
	public demo3() 
	{

	}
	public void run()
	{
		for(int i=1;i<=100;i++)
			System.out.println(i);
	}

	public static void main(String[] args) 
	{
         new demo3().start();
         new demo3().start();
         
	}

}
