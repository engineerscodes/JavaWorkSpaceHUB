/**
 * 
 */
package linkedlist;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class linkedlist_shuffle 
{
    static linkedlist l;
	public linkedlist_shuffle() 
	{
	 	l=new linkedlist();
	}

	public static void main(String[] args) 
	{
        new linkedlist_shuffle();
        l.add();
        System.out.println("Before shuffle d=\n"+l.d);
        Collections.shuffle(l.d);
        System.out.println("After shuffle d=\n"+l.d);
        
	}

}
