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
public class hashset_array 
{
    static HashSet <String> h;
	public hashset_array() 
	{
         h=new HashSet();
	}
    public static void addition()
    {
    	int a[]={0,0,0,3,3,3,1,2,1,4,6,5,7,8,8,9,9,9};
    	for(int i=0;i<a.length;i++)
    		h.add(""+a[i]);
    	System.out.println("Displaying the HashSet :\n"+h);
    }
	public static void main(String[] args) 
	{
        System.out.println("HashSet");
        new hashset_array();
        addition();
        String s[]= new String[h.size()];
        h.toArray(s);
        System.out.println("Displaying the HashSet :\n"+Arrays.toString(s));
	}

}
