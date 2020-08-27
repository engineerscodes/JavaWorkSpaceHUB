/**
 * 
 */
package arrayslists;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class shuffle_elements
{
   static ArrayList <String>n;
	public shuffle_elements() 
	{
		n=new ArrayList <>();
		
	}

	public static void main(String[] args) 
	{
		shuffle_elements n1=new shuffle_elements();
		n.add("RED");
		n.add("WHITE");
		n.add("BLACK");
		n.add("YELLOW");
		n.add("Orange");
		n.add("BLUE");
	
		System.out.println("Before shuffle ="+n);
		Collections.shuffle(n);
		System.out.println("After shuffle ="+n);

	}

}
