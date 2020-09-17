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
public class print_from_pos 
{    static linkedlist l;
     static Scanner nav=new Scanner(System.in); 
	/**
	 * Pritning a linkedlist from a specific position.
	 */
	public print_from_pos() 
	{
		
		l=new linkedlist();
		
	}
    public static void spe_print()
    {
       l.add();
       System.out.println("Enter the position to less the size<:"+l.df.size());
       Iterator i=l.df.listIterator(nav.nextInt()%l.df.size());//Printing from2 index
       
       while(i.hasNext())
       {
    	   System.out.print(i.next()+" , ");
       }
        // String hel="naveen";
       //System.out.println(l.getClass());
      // Integer x=new Integer(100);
      // System.out.println(x.intValue());
       //Float x=Float.parseFloat(hel);
       
    }
	public static void main(String[] args) 
	{
		new print_from_pos().spe_print(); 
		System.out.println();
	}

}
