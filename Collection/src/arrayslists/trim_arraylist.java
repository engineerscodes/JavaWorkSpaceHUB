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
public class trim_arraylist extends arraylist
{

	public trim_arraylist() 
	{super();
		
	}
	
	public void trim()
	{   System.out.println("the is no method to check capacity in Arraylist -");
		df.trimToSize();
		System.out.println(df);
	}
public static void main(String ...agr)
{
	new trim_arraylist().trim();
	
}
}
