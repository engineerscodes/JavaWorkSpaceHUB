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
public class replace_values
{
    static linkedlist l;
	public replace_values() 
	{
        l=new linkedlist();
	}

	public static void main(String[] args) 
	{    int j=0;
         new replace_values();
         l.add();
         System.out.println("Displaying the linkedlist d-"+l.d);
         for(int i=10;i>0;i--)
         { l.d.set(j++,i);
         }
         System.out.println("Displaying the linkedlist d-"+l.d);
         
	}

}
