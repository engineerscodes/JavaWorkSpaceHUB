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
public class compare_hashset 
{
   static  HashSet <String> h1;
    static HashSet <String>h2;
	public compare_hashset() 
	{
        h1=new HashSet();
        h2=new HashSet();
	}

	public static void main(String[] args)
	{
      new compare_hashset();
       h1.add("Life") ;
       h1.add("My");
       h1.add("Pie");
       System.out.println("Displaying HashSet h1"+h1);
       h2.add("My");
       h2.add("my");
       h2.add("Pie");
       h2.add("red");
       System.out.println("Displaying HashSet h2"+h2);
       for(String temp:h2)
       {
    	   System.out.println((h1.contains(temp)?"Yes":"No"));
       }
	}

}
