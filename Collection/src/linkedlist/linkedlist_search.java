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
public class linkedlist_search
{     
    static linkedlist l;
    static Scanner nav;
	public linkedlist_search() 
	{
		l=new linkedlist();
		nav=new Scanner(System.in);	
	}

	public static void main(String[] args)
	{ 
		linkedlist_search ls=new linkedlist_search();
		l.add();
		System.out.println("Enter the element in search");
		int ele=nav.nextInt();
		System.out.println(l.d.contains(ele));
		
	}

}
