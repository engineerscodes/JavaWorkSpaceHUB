/**
 * 
 */
package Day10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Threadss {

	public Threadss() {
		
	}

	public static void main(String[] args)
	{    new A().n=100; 
		A x=new A();
		x.start();
		
		new B().n=100;
		B v=new B();
		v.start();
		 
		C c=new C();
		c.start();
		try {
			c.join();
			v.join();
			x.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//ArrayList finals=new ArrayList();
		Set setss=new HashSet();
	    for(Object temp:x.arr)
	    	setss.add(temp);
	    for(Object temp:v.arr)
	    	setss.add(temp);
	    for(Object temp:c.arr)
	    	setss.add(temp);
		
		
		System.out.println("Set---------"+setss);
		
		try {
			FileOutputStream f=new FileOutputStream("Finalthread.ser");	
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(setss);
			obj.flush();
			obj.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

class A extends Thread{
	static int n;
	ArrayList <Integer> arr=new ArrayList();
	public void  run()
	{    Random r=new Random();
	
		for(int i=0;i<n;i++)
		{   int flag=-1;
			int ran=r.nextInt(1000)+10;
			System.out.println(ran);
			//Check if prime 
			for(int j=3;j<ran;j++)
			{
				if(ran%j==0)
				{
					flag=0;
					break;
				}
			}
		if(flag==-1) {System.out.println("-------prime :"+ran);
		    arr.add(ran);
		    
		    try{wait();}catch(Exception e){System.out.println("Thread A is Waiting ");}  
		
		}
		
		
		}
		write();
	}
	public void write()
	{ System.out.println("File prime :"+arr);
		try {
			FileOutputStream f=new FileOutputStream("Outputthread.ser");	
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(arr);
			obj.flush();
			obj.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class B extends Thread{
	static int n;
	ArrayList <Integer> arr=new ArrayList();
	public void  run()
	{    Random r=new Random();
	
		for(int i=0;i<n;i++)
		{    int ran=r.nextInt(2000)+50; 
		if(ran%3==0) {System.out.println("Divisble by 3 :"+ran);
		    arr.add(ran);
		    try{wait();}catch(Exception e){System.out.println("Thread B is Waiting ");}  
		
		}
		
		
		}
		write();
	}
	public void write()
	{ System.out.println("Divisble by 3  :"+arr);
		try {
			FileOutputStream f=new FileOutputStream("Outputthread2.ser");	
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(arr);
			obj.flush();
			obj.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class C extends Thread{
	
	ArrayList <Integer> arr=new ArrayList();
	public void  run()
	{    Random r=new Random();
	      
		for(int i=0;i<4;i++)
		{    int ran=r.nextInt(50)+1; 
		    arr.add(ran);
		}
		write();
	}
	public void write()
	{ System.out.println("Number one two 1-50 :"+arr);
		try {
			FileOutputStream f=new FileOutputStream("Outputthread3.ser");	
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(arr);
			obj.flush();
			obj.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}