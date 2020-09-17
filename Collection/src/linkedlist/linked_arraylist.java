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
public class linked_arraylist 
{   static linkedlist n;
	public linked_arraylist() 
	{
       super();
       n=new linkedlist();
	}

	public static void main(String[] args)
	{    new linked_arraylist() ;
         System.out.println("program to covert linkedlist to arraylist");
         n.add();
         for(Integer x:n.d)
         {
        	 System.out.print(x+" , ");
         }
         System.out.print("\n");
          ArrayList temp=new ArrayList<>(n.d);
          List <Integer>temp2=new ArrayList(n.d); 
          System.out.println(temp);
          System.out.println(temp2);
         
	}

}
