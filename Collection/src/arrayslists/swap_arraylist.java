/**
 * 
 */
package arrayslists;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class swap_arraylist 
{
   ArrayList n1;
	public swap_arraylist()
	{
	 n1=new ArrayList();
	}
   public void add()
   {
	   n1.add(1);
		n1.add(5);
		n1.add("red");
	    n1.add("Black");
	    n1.add(1000.09f);
	    System.out.println("Before Swap-"+n1);
   }
	public static void main(String[] args) 
	{
		swap_arraylist n=new swap_arraylist();
		n.add();
		int size=n.n1.size();
		for(int i=0;i<size-1;i=i+2)
			Collections.swap(n.n1, i, i+1);   //Collections.swap(ArrayList,position1 ,pos2)
		System.out.print("After swap-");
     System.out.println(n.n1);
	}

}
