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
public class arrayList_intersection 
{
   ArrayList n1,n2;
	public arrayList_intersection() 
	{
		n1=new ArrayList();
		n2=new ArrayList();
	}
	
	public ArrayList intersect(ArrayList n1,ArrayList n2)
	{
		ArrayList intersect=new ArrayList();
		for(Object s:n1)
		{
			//intersect.add(n2.contains(s)?s:null); output --> Intersection of 2 arrayList-[null, Red, null, null, 5]
			if(n2.contains(s))
			{
				intersect.add(s);
			}
		}
		
		
		return intersect;
	}
	public void add()
	{
		n1.add("white");
		n1.add("Red");
		n1.add("Black");
		n1.add(100);
		n1.add(5);
		
		n2.add("White");
		n2.add("Red");
		n2.add("100");
		n2.add(5);
	}
  public static void main(String ...nav)
  {
	  arrayList_intersection list =new arrayList_intersection();
	  list.add();
	  System.out.println("Intersection of 2 arrayList-"+list.intersect(list.n1, list.n2));
  }
}
