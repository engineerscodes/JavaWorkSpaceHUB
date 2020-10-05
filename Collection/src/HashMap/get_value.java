/**
 * 
 */
package HashMap;
import java.util.*;
import java.util.HashMap;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class get_value
{   static Scanner nav=new Scanner(System.in);
    static HashMap<Integer,String> h;
	public get_value(HashMap<Integer,String> temp) 
	{
		h=new HashMap <Integer,String>(temp);
	}

	public static void main(String[] args) 
	{
         new get_value(new HashMaps().map);
         System.out.println("HASH MAP :"+h);
         System.out.print("Enter the key :");
         int ele=nav.nextInt();
         if(h.containsKey(ele))
         {
        	 System.out.println("value exists!!="+h.get(ele));
         }
         else
         { System.out.println("value Doesnot exists!!=");//h.get(ele)=null
         }
         
	}

}
