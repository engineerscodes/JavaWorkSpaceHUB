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
public class less_than 
{   static Scanner nav;
    static TreeSet <Integer>t;
	public less_than() 
	{   nav=new Scanner(System.in);
        t=new TreeSet();
	}

	public static void main(String[] args) 
	{
		System.out.println ("Implementing TreeSet :");
	       new less_than();
	       int a[]={1,4,6,8,10,15,20,44,0,0,1,50};
	       for(int c:a)
	          t.add(c);
	       System.out.println(" Displaying the TreeSet \n"+t);
	       System.out.println("Enter the number x to get number Lesser than to Number:");
	       // lesser than only not lesser than equal to eq is number is x=10 then output is :8
	       System.out.println(t.lower(nav.nextInt()));
	       // if x=0,the output is null.
	}

}
