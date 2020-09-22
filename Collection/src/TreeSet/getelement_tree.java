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
public class getelement_tree
{
   static TreeSet <Integer>t;
	public getelement_tree() 
	{
      t=new TreeSet();  
	}

	public static void main(String[] args) 
	{

	       System.out.println ("Implementing TreeSet :");
	       new getelement_tree() ;
	       int a[]={1,2,3,4,5,6,7,8,9,0,0,1,50};
	       for(int c:a)
	          t.add(c);
	       System.out.println(" Displaying the TreeSet \n"+t);
	       System.out.println("Root:"+t.first());
	       System.out.println("Last element:"+t.last());
	       
	}

}
