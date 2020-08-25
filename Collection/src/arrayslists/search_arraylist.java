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
public class search_arraylist
{   private static ArrayList n=new ArrayList (); 

	public static void main(String[] args)
	{
		n.add("naveen");
		n.add("10100");
		n.add(154);
		n.add(78547);
		n.add(80); 
		
		if(n.contains(80))
		{
			System.out.println("The element is present in ArrayList");
		}
		else
		{
			System.out.println("The element Not is present in ArrayList");
		}
		
		if(n.contains("naveen"))
		{
			System.out.println("The element is present in ArrayList");
		}
		else
		{
			System.out.println("The element Not is present in ArrayList");
		}
		if(n.contains(155))
		{
			System.out.println("The element is present in ArrayList");
		}
		else
		{
			System.out.println("The element Not is present in ArrayList");
		}
	}	

}
