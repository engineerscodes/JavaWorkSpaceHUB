/**
 * 
 */
package linkedlist;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public  abstract class abstract_linkedlist 
{

    LinkedList <Integer> d;
    LinkedList <Float> f;
    LinkedList <Double> df;
    LinkedList <String> str;
    LinkedList <Character> c;
    LinkedList <Object> obj;
	public abstract_linkedlist() 
	{
		d= new LinkedList();
		f=new LinkedList();
		df=new LinkedList();
		str=new LinkedList();
		c=new LinkedList();
		obj=new LinkedList();
	}
	protected abstract void add();
	public abstract void display();
	
	public static void main(String ...arg)
	{
		System.out.println("This abstract class of LinkedList ");
	}

}
