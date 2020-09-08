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
public class linkedlist_offerend 
{
    linkedlist end=new linkedlist();

	public linkedlist_offerend() 
	{
		end=new linkedlist();  // again assigning new address in memory
	}

	public static void main(String[] args)
	{
		linkedlist_offerend off=new linkedlist_offerend ();
		off.end.add();
		System.out.println("Display the list -"+off.end.str);
		off.end.str.offerLast("First");
		System.out.println("Display the list -"+off.end.str);
	}

}
