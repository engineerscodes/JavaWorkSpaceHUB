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
public class remove_all_mapping {
    static HashMap <Integer,String> h;
	public remove_all_mapping() 
	{
       h=new HashMap<>();
	}

	public static void main(String[] args) 
	{
       new remove_all_mapping ();
       h.putAll(new HashMaps().map);
       System.out.println("Mapping "+h);
       h.remove(0);
       System.out.println("Mapping After removing Key-0 :"+h);
       h.clear();
       System.out.println("Mapping After removing all Keys :"+h);
  
	}

}
