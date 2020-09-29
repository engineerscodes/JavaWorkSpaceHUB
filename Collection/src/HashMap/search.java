/**
 * 
 */
package HashMap;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class search {
   static HashMap<Integer,String> map;
   static Scanner nav;
	public search()
	{   nav=new Scanner(System.in);
        map=new HashMap<Integer,String>();
	}

	public static void main(String[] args) 
	{  new  search();
      map.put(1,"red");
      map.put(2,"blue");
      map.put(3,"yellow");
      System.out.println("HashMap :"+map);
      System.out.println("Enter to check if the Key is present :");
      if(map.containsKey(nav.nextInt()))
    	  System.out.println("Is present");
      else
    	  System.out.println("Not present"); 
      System.out.println("Enter to check if the Value is present :");
      if(map.containsValue(nav.next()))  //if nav.nextInt() the output is "Value Not present"
      {
    	  System.out.println("Is present"); 
      }
      else
    	  System.out.println("Value Not present"); 
	}

}
