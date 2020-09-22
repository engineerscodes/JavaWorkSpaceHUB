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
public class append_hashset 
{
   static  HashSet <Integer> h;

	public append_hashset() 
	{
	h= new HashSet<>();
	}

	public static void main(String ... arg)
	{   //HashSet is faster but doesnot maintain any order
		System.out.println("IMPLEMENTING HASHSET");
		 new append_hashset();
	     int a[]={1,2,3,1,4,5,5,7,8,9,1,5,6,0,9,0,100,56};
	     System.out.println("Displaying the array -"+Arrays.toString(a));
	     for(int i=0;i<a.length;i++)
	     {
	    	 h.add(a[i]);
	     }
	     System.out.println("Hash Set ->"+h);  //h.size<=a.length always .
	}
}
