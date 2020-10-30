/**
 * 
 */
package HashMap;
import java.util.HashMap;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class clone_hashmap {
   static  HashMap<Integer,String> map; 
	public clone_hashmap() 
	{
        map=new HashMap <Integer,String>();
	}
	public static void main(String[] args) 
	{
        new clone_hashmap() ;
        map.putAll(new HashMaps().map);//  new HashMaps().map <Integer ,String> must match map<Integer ,String>
        System.out.println("Displaying the HaSHMAP :"+map);
        HashMap <String,String> temp=new HashMap(map);
        HashMap<Integer,String> temp2=new HashMap(map);
        System.out.println("Displaying the HaSHMAP<String,String> :"+temp);
        System.out.println("Displaying the HaSHMAP<Integer,String> :"+temp2);
       // HashMap c=map.clone(); Type mismatch: cannot convert from Object to HashMap
        HashMap c=(HashMap<Integer,String>)map.clone();
        HashMap<String,String> c1=(HashMap<String,String>)map.clone();
        System.out.println("Displaying the HaSHMAP<Integer,String> using Clone :"+c);
        System.out.println("Displaying the HaSHMAP<String,String> using Clone :"+c1);
	}

}
