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
public class HashMaps 
{   static Scanner nav;
     HashMap<Integer,String> map;
	public HashMaps() 
	{
		nav=new Scanner(System.in);
		map= new HashMap(); 
		insert_to_Map();
	}
 
	public void insert_to_Map()
	{
		//map.entrySet(1,"NAVEEN");
		map.put(1,"NAVEEN");
		map.put(2,"bala");
		map.put(1,"james");//over writes the naveen
		map.put(0,"praveen");
		map.put(105,"RDJ");
	}
	public static void main(String[] args) 
	{
		HashMaps obj =new HashMaps();
         for(Map.Entry x:obj.map.entrySet())
        	 System.out.println(x.getKey()+" "+x.getValue());
	}

}
