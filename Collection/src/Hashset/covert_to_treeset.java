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
public class covert_to_treeset
{
   static  HashSet <Integer> h;
	public covert_to_treeset() 
	{
       h=new HashSet();
    }
	public static void addition()
	  {
		  int a[]={1,2,1,3,0,5,0,5,6,1,6,7,5,7,5,8,9};
		  for(int i=0;i<a.length;i++)
			  h.add(a[i]);
		 System.out.println("Displaying the Hashset:"+h);
	  }
	public static void main(String[] args) 
	{
		new covert_to_treeset();
		addition();
		TreeSet <Integer> t=new TreeSet(h);
		for(Integer tree:t)
			System.out.println(" "+tree);
		
	
	}

}
