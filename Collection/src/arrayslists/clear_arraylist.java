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
	public void clears()
	{
		d.clear();
		//d.removeAll(d); //remove array's..............................using remveAll()
		System.out.println("AFTER CLEARING DISPLAYING THE ARRAYLIST -");
		System.out.println(d);
		System.out.println("Checking the above array list is empty or not! "+d.isEmpty());
	}
  public static void main(String ...arg)
  {
	  clear_arraylist n=new clear_arraylist();
	 // n.d.clear();
	  System.out.println("DISPLAYING THE ARRAYLIST -");
	  System.out.println(n.d);
	  System.out.println("Checking the above array list is empty or not! "+n.d.isEmpty());
	  n.clears();
  }
}
