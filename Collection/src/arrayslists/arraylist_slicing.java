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
public class arraylist_slicing 
{  static Scanner nav=new Scanner (System.in);
   private ArrayList n;
	public arraylist_slicing() 
	{
		n=new ArrayList<>();
	}
	public List subList(ArrayList n,int k)
	{
		k=k%(n.size());
		return n.subList(0,k);
	}
	public static void main(String[] args) 
	{
		arraylist_slicing list=new arraylist_slicing();
		list.adds();
		System.out.println("Enter the subList length");
		int k=nav.nextInt();
		System.out.println("SubList -"+list.subList(list.n,k));
		System.out.println("Without Inbuilt Methods");
		System.out.println(" New  SubList="+list.subArrayList(list.n, k));
	}
	private void adds() 
	{
		n.add(100);
		n.add("NAVEEN");
		n.add(1452.0);
		n.add(15);
		System.out.println("ArrayList ="+n);
	}
	private ArrayList<Object> subArrayList(ArrayList n,int c)
	{   int count=0;
		ArrayList temp=new ArrayList();
		for(Object a:n)
		{
			if(count==c)
				break;
			else
			{	temp.add(a);
			count++;}
		}
		return temp;
	}

}
