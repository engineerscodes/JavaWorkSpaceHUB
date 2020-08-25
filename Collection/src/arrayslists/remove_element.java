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
public class remove_element 
{
   static ArrayList  n=new ArrayList<>();
   public static void main(String ...arg)
   {
	   n.add(100);
	   n.add("teams");
	   n.add("Teamlink");
	   n.add("red");
	   n.add(100.0f);
	   System.out.println("before remove"+n+"size of arraylist-"+n.size());
	   n.remove(0);
	   n.remove(2);
	   System.out.println("After removing"+n+"size of arraylist-"+n.size());
   }
   
}
