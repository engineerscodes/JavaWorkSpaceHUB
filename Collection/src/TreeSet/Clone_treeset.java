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
public class Clone_treeset 
{   static TreeSet t;
	public Clone_treeset() 
	{
        t=new TreeSet();
	}

	public static void main(String[] args) 
	{
		System.out.println ("Implementing TreeSet :");
	       new Clone_treeset() ;
	       int a[]={1,2,3,4,5,6,7,8,9,0,0,1,50};
	       for(int c:a)
	          t.add(c);
	       System.out.println(" Displaying the TreeSet \n"+t);
	       //TreeSet t2=t.clone(); error  can not convert object to treeset
	       TreeSet t2=(TreeSet) t.clone();
	       System.out.println(" Displaying the TreeSet \n"+t2);
	}

}
