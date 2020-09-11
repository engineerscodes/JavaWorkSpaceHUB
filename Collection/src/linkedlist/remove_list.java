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
public class remove_list 
{
    static Scanner nav;
    static linkedlist l;
	public remove_list() 
	{
	 super();
     nav=new Scanner(System.in);
     l=new linkedlist(); 
	}

	public static void main(String[] args) 
	{
      remove_list r=new remove_list();
     
      l.add();
      System.out.println("Before removing element :"+l.d);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] -index[0,1,2,3,4,5,6,7,8,9]
      System.out.println("enter the element u wamt to remove:");
      l.d.remove(nav.nextInt());
      System.out.println("After removing element :"+l.d);
      
	}

}
