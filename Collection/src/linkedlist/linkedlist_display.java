
package linkedlist;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class linkedlist_display 
{   static linkedlist l;
	public linkedlist_display()
	{
      super();
      l=new linkedlist();
	}

	public static void main(String[] args)
	{
      linkedlist_display list=new linkedlist_display();
      l.add();
      for(int i=0;i<l.d.size();i++)
      {
    	  System.out.println("pos: "+i+" element: "+l.d.get(i));
      }
	}

}
