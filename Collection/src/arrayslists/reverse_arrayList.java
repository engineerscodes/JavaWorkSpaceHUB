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
public class reverse_arrayList 
{  //static int  reverse;
   static ArrayList  n;
	public reverse_arrayList() 
	{
		n=new ArrayList<>();
	}
	
	public static ArrayList reverse()
	{
		Collections.reverse(n);
		return n;
	}
	public static void main(String ...nav)
	{
		reverse_arrayList obj=new reverse_arrayList();
		obj.adds();
		System.out.println("reverse of a arrayList"+reverse().toString());
	}

	/**
	 * 
	 */
	private void adds() 
	{
		n.add(100);
		n.add("NAVEEN");
		n.add(1452.0);
		n.add(15);
		System.out.println("ArrayList ="+n);
	}

}
