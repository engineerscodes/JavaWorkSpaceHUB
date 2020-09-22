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
public class less_than_num
{
   static TreeSet <Integer> t;
   static TreeSet <Integer> temp;
   static Scanner nav;
	public less_than_num() 
	{
      t=new TreeSet();
      temp=new TreeSet();
      nav=new Scanner(System.in);
	}

	public static void main(String[] args) 
	{
		   System.out.println ("Implementing TreeSet :");
	       new less_than_num() ;
	       int a[]={1,2,3,4,5,6,7,8,9,0,0,1,50};
	       for(int c:a)
	          t.add(c);
	       System.out.println(" Displaying the TreeSet \n"+t);
	       System.out.println("Enter the number x:");
	       temp=(TreeSet<Integer>)t.headSet(nav.nextInt());
	       System.out.print("Number's less x in Treeset t :"+temp);
	}

}
