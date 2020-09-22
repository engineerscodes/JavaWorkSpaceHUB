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
public class Greater_than_equal 
{
     static TreeSet <Integer>t;
     static TreeSet <Integer>t2;
     static Scanner nav;
	public Greater_than_equal() 
	{
       t=new TreeSet();
       nav=new Scanner(System.in);
	}

	public static void main(String[] args)
	{
		System.out.println ("Implementing TreeSet :");
	       new Greater_than_equal();
	       int a[]={1,4,6,8,10,15,20,44,0,0,1,50};
	       for(int c:a)
	          t.add(c);
	       System.out.println(" Displaying the TreeSet \n"+t);
	       System.out.println("Enter the number x to get number Greater than equal to Number:");
	       System.out.println(t.ceiling(nav.nextInt()));
	       
	}

}
