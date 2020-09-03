/**
 * 
 */
package arrayslists;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class arraylist_swap 
{
   static  ArrayList <Integer> n;
	public arraylist_swap() 
	{
		n=new ArrayList();
	}
	
    public static void add()
    {
    	n.add(100);
    	n.add(101);
    	n.add(104);
    	n.add(106);
    	n.add(110);
    	n.add(120);
    	System.out.println("Before Swapping the ArrayList");
    	for(Integer s:n)
    	{
    		System.out.print(s+" ,");
    	}
    	
    }

	public static void main(String[] args) 
	{ 
		arraylist_swap  obj=new arraylist_swap ();
		add();
		for(int i=0;i<n.size()-1;i=i+2)
		 Collections.swap(n, i, i+1);
		System.out.println("\nAfter Swapping the ArrayList");
		System.out.println(n);
	}

}
