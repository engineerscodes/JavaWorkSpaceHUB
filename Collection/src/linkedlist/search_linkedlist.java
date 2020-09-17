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
public class search_linkedlist 
{   static linkedlist n;
    static Scanner nav;
	public search_linkedlist() 
	{  
		n=new linkedlist();
		nav=new Scanner(System.in);
	}

	public static void main(String[] args) 
	{
		search_linkedlist sl=new search_linkedlist();
		n.add();
		System.out.println("the linked list is:"+n.d);
		System.out.println("Enter the element of search ");
	    if(n.d.contains(nav.nextInt()))
	    	System.out.println("The element is present");
	    else
		System.out.println("The element is not present");
	    
	}

}
