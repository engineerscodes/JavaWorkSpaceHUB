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
public class linkedlist_swap 
{
    static linkedlist l;
	public linkedlist_swap() 
	{
       l=new linkedlist();
	}

	public static void main(String[] args) 
	{
		linkedlist_swap sw=new linkedlist_swap ();
		l.add();
		System.out.println("Actual list:"+l.d);
		for(int i=0;i<l.d.size();i=i+2)
		{
			Collections.swap(l.d, i, i+1);
		}
		System.out.println("Swapped list:"+l.d);
	}

}
