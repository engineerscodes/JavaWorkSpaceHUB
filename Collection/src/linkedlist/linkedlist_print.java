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
public class linkedlist_print 
{/**
	 * To print Arraylist  in diffrent ways
*/
	static linkedlist l;
	public linkedlist_print() 
	{   super();
		l=new linkedlist();
	}
    public static void seen()
    {
    	for(int i=0;i<l.d.size();i++)
    	{
    		System.out.print(l.d.get(i)+" , ");
    	}
    	
    	for(String s:l.str)
    	{
    		System.out.print(s+" , ");
    	}
    	
    	Iterator i=l.c.iterator();
    	for(;i.hasNext();)
    		System.out.print(i.next()+",");
    }
	public static void main(String[] args) 
	{

		linkedlist_print nav=new linkedlist_print() ;
		l.add();
		nav.seen();
	}

}
