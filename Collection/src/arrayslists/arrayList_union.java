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
public class arrayList_union 
{
    private ArrayList n1,n2;
	public arrayList_union()
	{n1=new ArrayList();
     n2=new ArrayList();
		
	}
    public ArrayList union(ArrayList n1,ArrayList n2)
    {
    	ArrayList n3=new ArrayList();
    	for(Object temp:n1)
    	{
    		
    			n3.add(temp);
    		
    	}
    	for(Object temp:n2)
    	{
    		if(n1.contains(temp))
    		{}
    		else
    		{
    			n3.add(temp);
    		}
    		
    	}
    	return n3;
    }
	public void add()
	{
		n1.add("white");
		n1.add("Red");
		n1.add("Black");
		n1.add(100);
		n1.add(5);
		n1.add("NAVEEN");
		
		n2.add("White");
		n2.add("Red");
		n2.add("NAVEEN");
		n2.add(125.05f);
		n2.add(5);
	}
	public static void main(String[] args) 
	{
		arrayList_union  list =new arrayList_union ();
		list.add();
		System.out.println("ArrayList Union-"+list.union(list.n1, list.n2));

	}

}
