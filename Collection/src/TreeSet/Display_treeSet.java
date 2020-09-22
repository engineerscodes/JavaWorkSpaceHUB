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
public class Display_treeSet 
{
    static  TreeSet <Integer> t;
    static TreeSet <String> t1;
	public Display_treeSet() 
	{
      t=new TreeSet<Integer>();
     t1=new TreeSet<String>();
	}

	public static void main(String[] args) 
	{
        new Display_treeSet ();
        int a[]={1,2,3,4,5,6,7,8,9,0,50};
        for(int c:a)
           t.add(c);
       	System.out.print("Integer Tree :");
        for(Integer c:t)
        	System.out.print(" "+c);
        for(int c:a)
            t1.add(""+c);
       	System.out.print("\nString  Tree :");
        for(String c:t1)
        	System.out.print(" "+c);
	}

}
