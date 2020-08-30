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
public class arraylist_join 
{
    private ArrayList n1,n2;
	public arraylist_join() 
	{
		n1=new ArrayList ();
		n2=new ArrayList();
	}
public ArrayList join(ArrayList n1,ArrayList n2)
{
	ArrayList join =new ArrayList ();
	join.addAll(n1);
	join.addAll(n2);
	return join;
}

public void add()
{
	n1.add(1);
	n1.add(5);
	n1.add("red");
    n1.add("Black");
    System.out.println("First arrayList -"+n1);
    n2.add("Black");
    n2.add("white");
    n2.add(5);
    System.out.println("Second arrayList -"+n2);
    
}
public static void main(String ...arg)
{
	arraylist_join list=new arraylist_join();
	list.add();
	System.out.println("After joining n1&n2 -"+list.join(list.n1, list.n2));
}
}
