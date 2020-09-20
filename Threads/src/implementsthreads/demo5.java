/**
 * 
 */
package implementsthreads;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo5 implements Runnable
{

	public demo5() 
	{

	}
	public void run()
	{
	  for(int i=1;i<=100;i++)
		  System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) 
	{
        demo5 d=new demo5();
        Thread t1=new Thread(d); t1.setName("Thread t1");
        t1.start();
        Thread t2=new Thread(d); t2.setName("Thread t2");
        t2.start();
        t2.suspend();
        Thread t3=new Thread(d); t3.setName("Thread t3");
        t3.start();
        t2.resume();
        Thread t4=new Thread(d); t4.setName("Thread t4");
        t4.start();
        t4.stop();
        t4.resume();  //useless no use it will not print
	}

}
