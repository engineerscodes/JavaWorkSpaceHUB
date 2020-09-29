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
public class hashmap_count_size 
{
    static HashMap <Integer,String> map;
	public hashmap_count_size()
	{
        map= new HashMap();
	}

	public static void main(String[] args) 
	{   new hashmap_count_size();
        map.put(-1,"10");
        map.put(-2,"9");
        map.put(-3,"8");
        
        System.out.print("SIze of HashMap :"+map.size());
	}

}
