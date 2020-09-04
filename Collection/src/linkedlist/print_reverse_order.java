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
public class print_reverse_order 
{   static  linkedlist l;
	/**
	 * Print reverse of a linkedlist
	 */
	public print_reverse_order() 
	{
		 l=new linkedlist();
	}
	
	public void reverse()
	{   l.add();
		Iterator i=l.d.descendingIterator();
		System.out.println(l.d);
		System.out.println("Reverse linkedlist -");
		while(i.hasNext())
		{
			System.out.print(i.next()+",");
		}
	}
	
	public static void main(String ...arg)
	{   System.out.println("Initial linkedlist -");
		new print_reverse_order().reverse();
		
	}

}
