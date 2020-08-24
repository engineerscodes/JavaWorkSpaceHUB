/**
 * 
 */
package arrayslists;
import java.util.*;
/**
 * @author M.NAVEEN
 *
 */
public class arraylist_iterator 
{   static ArrayList n=new ArrayList<>(); 
    static ArrayList<String> n1=new ArrayList<String>(); 
    static ArrayList <Integer> n2=new ArrayList<>(3);//inital capacity of ArrayList is 3 //ArrayList doesnot have capacity method to know the capacity unlike stack
	public static void main(String[] args) 
	{  
		n.add("TONY");
		n.add("VIRAT");
		n.add("KARAN");
       /* for(String ele:n)  error beause arraylist is not String type but object type
        {
        	
        }*/
		for(Object s:n)
    	{
    		System.out.println(s);
    		//System.out.println(s.toString());
    	}
		
		n1.add("MK");
		n1.add("VK");
		n1.add("RS");
		
		for(String ele:n1)
		{
			System.out.println(ele);
		}
		n2.add(100);
		n2.add(52);
		n2.add(85);
		n2.add(565);
		 
		for(Integer y:n2)
		{
			System.out.println(y);
		}
		System.out.println(n2);
		}
		}
	


