/**
 *  if you extend thread plz override run method ,if not it will not throw error
 *  Thread this a part of Object class under java.util.Object.
 */
package extendsthread;
//import java.lang.Thread; does not need to do this 
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Demo1 extends Thread{

	public Demo1() 
	{

	}


	public static void main(String[] args) 
	{
       Demo1 x=new Demo1();
       System.out.println("Main method");
       x.start();
       x.run(); //prints nothing  because the run method is not overridden

	}

}
