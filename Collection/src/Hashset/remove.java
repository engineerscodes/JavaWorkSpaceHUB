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
public class remove 
{
	static  HashSet <String> h1;
	public remove() 
	{
		h1=new HashSet();
	}

	public static void main(String[] args)
	{
		  new remove();
	       h1.add("Life") ;
	       h1.add("My");
	       h1.add("Pie");
	       System.out.println("Displaying HashSet h1"+h1);
	       h1.remove("Life");
	       System.out.println("After Removing  HashSet h1"+h1);
	}

}
