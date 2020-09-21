/**
 * 
 */
package Hashset;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class display_hashset 
{
    static HashSet h;
	public display_hashset() 
	{
      h=new HashSet();
	}
  public static void addition()
  {
	  int a[]={1,2,1,3,0,5,0,5,6,1,6,7,5,7,5,8,9};
	  for(int i=0;i<a.length;i++)
		  h.add(a[i]);
	 // System.out.println("Displaying the Hashset:"+h);
  }
	public static void main(String[] args) 
	{ 
       new display_hashset();
        HashSet rev=new HashSet();
        addition();
        System.out.println("Displaying Using Iterator");
        Iterator i=h.iterator();
        while(i.hasNext())
        {
        	System.out.print(" "+i.next());
        }
        
        //Iterator rev=h.descendingIterator(); Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    	//The method descendingIterator() is undefined for the type HashSet
       // Collections.reverse(h); error 
       
	}

}
