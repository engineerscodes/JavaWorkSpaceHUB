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
public class HashMap_to_Set
{
    static HashMap <Integer,String> map;
	public HashMap_to_Set(HashMap <Integer,String> temp) 
	{
      map=new HashMap<>(temp);
	}

	public static void main(String[] args)
	{
        new HashMap_to_Set(new HashMaps().map);
        System.out.println("HashMap :\n"+map);
        
        Set s=map.entrySet();
        System.out.println("SET :\n"+s);
      //  HashSet k=(HashSet)map.entrySet(); 
        //java.util.HashMap$EntrySet cannot be cast to java.util.HashSet
    	//at HashMap.HashMap_to_Set.main
        //System.out.println(k);
	}

}
