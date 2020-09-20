/**
 * 
 */
package implementsthreads;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo3 implements Runnable
{

	public demo3() 
	{

	}

	public void run()
	{
		for(int i=0;i<20;i++)
		{	System.out.println(Thread.currentThread().getName()+" -"+i);
		    //Thread.sleep(100);  
		  /*Exception in thread "Thread t1" java.lang.Error: Unresolved compilation problem: 
			Unhandled exception type InterruptedException

			at implementsthreads.demo3.run(demo3.java:22)
			at java.lang.Thread.run(Unknown Source)
			*/
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void display()
	{
		for(int i=0;i<100;i++)
			System.out.print(" ,"+i);
	}
	public static void main(String[] args) 
	{  
       Thread t1=new Thread(new demo3());
       t1.start(); 
       display();
       t1.setName("Thread t1");
       
	}

}
