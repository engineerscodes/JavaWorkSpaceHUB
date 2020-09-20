/**
 * 
 */
package implementsthreads;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class demo2 implements Runnable
{

	public demo2() 
	{

	}
	public void run()
	{
		for(int i=0;i<10;i++)
		  System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void display()
	{
		for(int i=0;i<100;i++)
			System.out.print(" ,"+i);
	}

	public static void main(String[] args) 
	{
        Thread t1=new Thread(new demo2());
        t1.start(); 

        display();
        t1.setName("Thread T1");
        Thread t2=new Thread(new demo2());
        t2.start(); 
        t2.setName("Thread 2");
	}

}
/*
 * Picked up _JAVA_OPTIONS: -Djava.net.preferIPv4Stack=true
 ,0 ,1 ,2Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
 ,35
 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27 ,28 ,29 ,30 ,31 ,32 ,33 ,34 ,35 ,36 ,37 ,38 ,39 ,40 ,41 ,42 ,43 ,44 ,45 ,46 ,47 ,48 ,49 ,50 ,51 ,52 ,53 ,54 ,55 ,56 ,57 ,58 ,59 ,60 ,61 ,62 ,63 ,64 ,65 ,66 ,67 ,68 ,69 ,70 ,71 ,72 ,73 ,74 ,75 ,76 ,77 ,78 ,79 ,80 ,81 ,82 ,83 ,84 ,85 ,86 ,87 ,88 ,89 ,90 ,91 ,92 ,93 ,94 ,95 ,96 ,97 ,98 ,99Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
Thread 2
5
 * */
