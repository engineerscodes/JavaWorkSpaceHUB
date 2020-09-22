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
public class remove_last
{
    static TreeSet <Object> t;
	public remove_last() 
	{
      t=new TreeSet();
	}

	public static void main(String[] args) 
	{ 
		new remove_last();
		for(int i=0;i<20;i=i+3)
			t.add(i);
		System.out.println("Displaying TreeSet :"+t);
		System.out.println("Removing the lastelement from TreeSet: "+t.pollLast());
		System.out.println("Remove the First element from TreeSet: "+t.pollFirst());
		System.out.println("After removing  TreeSet T :"+t);
	}

}
