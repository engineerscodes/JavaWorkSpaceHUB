/**
 * 
 */
package TreeSet;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class reverse_treeset
{
    static TreeSet <Integer>t;
	public reverse_treeset() 
	{
       t=new TreeSet();
	}

	public static void main(String[] args)
	{
       System.out.println ("Implementing TreeSet :");
       new reverse_treeset();
       int a[]={1,2,3,4,5,6,7,8,9,0,0,1,50};
       for(int c:a)
          t.add(c);
       System.out.println(" Displaying the TreeSet \n"+t);
       Iterator i=t.descendingIterator();
       System.out.println(" Displaying Reverse TreeSet");
       while(i.hasNext())
    	   System.out.print(" "+i.next());
	}

}
