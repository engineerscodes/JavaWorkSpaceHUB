/**
 * 
 */
package arrayslists;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class arraylist_print extends arraylist
{

	/**
	 * To print based on position 
	 */
	public arraylist_print()
	{
		super();
	}
	public static void main(String ...arg)
	{
		arraylist_print s=new arraylist_print();
		for(int i=0;i<s.str.size();i++)
			System.out.println(s.str.get(i)+" "+" pos="+i);
	}

}
