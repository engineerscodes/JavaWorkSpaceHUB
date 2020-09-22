/**
 * 
 */
package TreeSet;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class add_to_tree 
{
    static TreeSet <Integer>t;
    static TreeSet <Integer>t2;
    static TreeSet <Integer>t3;
	public add_to_tree() 
	{
      t=new TreeSet();
      t2=new TreeSet(t);
      t3=new TreeSet();
	}

	public static void main(String[] args)
	{
		 new add_to_tree  ();
	        int a[]={1,2,3,4,5,6,7,8,9,0,50};
	        for(int c:a)
	           t.add(c);
	       	System.out.println("Integer Tree T1:"+t); //mutiple wasy to add elemts to another TreeSet
	        t2=new TreeSet(t);
	      System.out.println("INTEGER TREE T2:"+t2);
	      t3.addAll(t2);
	      System.out.println("INTEGER TREE T3:"+t3);
	}

}
