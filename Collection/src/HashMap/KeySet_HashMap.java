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
public class KeySet_HashMap 
{   static HashMap <Integer,String> map;
	public KeySet_HashMap(HashMap <Integer,String> map) 
	{
      this.map=new HashMap(map);
	}

	public static void main(String[] args) 
	{
       new KeySet_HashMap(new HashMaps().map) ;
       System.out.println("HASHMAP :"+map);
       Set s=map.keySet();
       System.out.println("Key in hashMap-->map  :"+s);
	}

}
