/**
 * 
 */
package extendsthread;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo6 extends Thread
{

	public demo6() 
	{

	}
	public void run()
	{
		for(int i=1;i<20;i++)
			System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
        demo6 t1=new demo6();
        t1.start();  t1.setName(" Thread t1");
        demo6 t2=new demo6();
        t2.start(); t2.setName("Thread t2");
        System.out.println("First -"+t1.isAlive());
        System.out.println("second -"+t2.isAlive());
      
        try{
        	t1.join();
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
        System.out.println("First -"+t1.isAlive());
        System.out.println("second -"+t2.isAlive());
      
        
	}

}
