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
public class update_ArrayList 
{ private static ArrayList  n=new ArrayList();

	public static void main(String[] args) 
	{
		
      n.add("Ironman");
      n.add(12344);
      n.add(145.5f);
      n.add(null);
      System.out.println("List before updating -"+n);
      n.set(0,45);
      n.set(1,"Tony");
      n.set(2,15);
      n.set(3,78);
      System.out.println("List after updating -"+n);
	}

}
