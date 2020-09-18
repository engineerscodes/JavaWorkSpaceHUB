/**
 * 
 */
package extendsthread;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo4 extends Thread
{

	public demo4() 
	{

	}

   public void run()
   {
	   for(int i=0;i<20;i++)
	    System.out.println(Thread.currentThread().getName());
	   System.out.println(Thread.currentThread().getPriority());
   }
	public static void main(String[] args) 
	{
        demo4 t1=new demo4(); t1.setName("Thread 1");
        t1.start();
        demo4 t2=new demo4();  t2.setName("Thread 2");
         t2.start();
        demo4 t3=new demo4();  t3.setName("Thread 3");
        t3.start();
        demo4 t4=new demo4();  t4.setName("Thread 4");
        demo4 t5=new demo4();  t5.setName(" 5th thread");
        for(int i=0;i<20;i++)
    	    System.out.println(Thread.currentThread().getName());
        System.out.println(t5);
	}

}
