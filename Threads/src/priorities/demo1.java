/**
 * 
 */
package priorities;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo1  extends Thread
{

	public demo1() 
	{

	}
   public void run()
    {
        for(int i=0;i<100;i++)
        	System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) 
        {
			e.printStackTrace();
		}
    }
	public static void main(String[] args) 
	{
       demo1 t1=new demo1();
       t1.setPriority(3); //should use this
       t1.start();
       demo1 t2=new demo1();
       t2.setPriority(MAX_PRIORITY-5);
       t2.start();
      
	}

}
