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

public class common_element 
{
   static  HashSet <String> h1;
    static HashSet <String>h2;
	public common_element () 
	{
        h1=new HashSet();
        h2=new HashSet();
	}

	public static void main(String[] args)
	{
      new common_element();
       h1.add("Life") ;
       h1.add("My");
       h1.add("Pie");
       System.out.println("Displaying HashSet h1"+h1);
       h2.add("My");
       h2.add("my");
       h2.add("Pie");
       h2.add("red");
       System.out.println("Displaying HashSet h2"+h2);
       System.out.println("Common Element :");
       h1.retainAll(h2);
       System.out.println("After retaining HashSet h1 :"+h1);
	}

}
