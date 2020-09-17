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
public class compare_linkedlist 
{  static linkedlist l;
	public compare_linkedlist() 
	{
       // super(); no need 
        l=new linkedlist();
	}

	public static void main(String[] args) 
	{
        System.out.println("Comparing Two LinkedList");
        new compare_linkedlist();
        l.add();
        LinkedList <Object> x=new LinkedList <>();
        for(Object s:l.d)
        {
        	System.out.print((l.df.contains(s)==true)?"yes ":"no ");
        	if(l.df.contains(s)==false)
        		x.add(s);
        	
        }
        System.out.print("\n"+x);
	}

}
