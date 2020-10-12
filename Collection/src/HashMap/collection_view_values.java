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
public class collection_view_values
{
    static HashMap <Integer,String> map;
	public collection_view_values(HashMap <Integer,String> map) 
	{this.map=new HashMap(map);
	}

	public static void main(String[] args) 
	{
		new collection_view_values(new HashMaps().map);
		System.out.println("Hash Map :"+map);
		System.out.println("collection of values"+map.values());
		//ArrayList <String>list= (ArrayList)map.values();
		//System.out.println("collection of values"+map.values());  output-java.util.HashMap$Values cannot be cast to java.util.ArrayList
		//at HashMap.collection_view_values.main(collection_view_values.java:23)
		ArrayList <String>list= new ArrayList(map.values());
		System.out.println("ArrayList of values"+list);
	}

}
