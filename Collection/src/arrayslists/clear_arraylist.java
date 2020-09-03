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
public class clear_arraylist  extends arraylist
{

	public clear_arraylist() 
	{
		super();
	}
	public void clear()
	{
		d.clear();
		System.out.println("AFTER CLEARING DISPLAYING THE ARRAYLIST -");
		System.out.println(d);
	}
  public static void main(String ...arg)
  {
	  clear_arraylist n=new clear_arraylist();
	 // n.d.clear();
	  System.out.println("DISPLAYING THE ARRAYLIST -");
	  System.out.println(n.d);
	  n.clear();
  }
}
