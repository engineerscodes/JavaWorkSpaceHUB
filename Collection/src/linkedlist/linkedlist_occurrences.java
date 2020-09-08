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
public class linkedlist_occurrences
{
   linkedlist list;
	public linkedlist_occurrences() 
	{
		list=new linkedlist();
	}

	public static void main(String[] args) 
	{
		linkedlist_occurrences n=new linkedlist_occurrences();
		n.list.add();
		System.out.println("displaying list d"+n.list.d);
		Integer beg=n.list.d.getFirst();
		Integer last=n.list.d.getLast();
		System.out.println("first -"+beg+"\nLast -"+last);

	}

}
