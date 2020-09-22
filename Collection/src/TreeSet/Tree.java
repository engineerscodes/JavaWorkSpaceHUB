/**
 * Tree set maintain \s sorted order (asc).
 */
package TreeSet;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class Tree
{
    static TreeSet <Integer>t;
	public Tree() 
	{
      t=new TreeSet();
	}

	public static void main(String[] args) 
	{
         new Tree();
         addition();
	}

	/**
	 * 
	 */
	private static void addition() 
	{
		int a[]={0,0,3,5,8,9,8,7,100,9};
		for(int i=0;i<a.length;i++)
		  t.add(a[i]);
		System.out.println("displaying Array :\n"+Arrays.toString(a));
		System.out.println("displaying Tree sorted and unqiue :\n"+t.toString());
		
	}

}
