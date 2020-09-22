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
public class covert_to_list 
{
    static HashSet <Integer> h;
	public covert_to_list() 
	{
     h= new HashSet();
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
		new covert_to_list();
		addition();
		List<Integer> l=new ArrayList(h);
		LinkedList<Integer> L=new LinkedList(h);
		System.out.println("ArrayList :"+l+"\nLinkedList :"+L);
	}

}
