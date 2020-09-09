/**
 * 
 */
package linkedlist;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class intersection_removeall 
{
    linkedlist list;
	public intersection_removeall() 
	{  super();
		list=new linkedlist();
	}
    public static void main(String ...naveen)
    {
    	intersection_removeall  inter=new intersection_removeall ();
    	inter.list.add();
    	System.out.println("Display list one -"+inter.list.obj);
    	System.out.println("Display list two -"+inter.list.str);
    	inter.list.obj.removeAll(inter.list.str);
    	System.out.println("Intersection of list"+inter.list.obj );
    }
}
