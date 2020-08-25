/**
 * 
 */
package arrayslists;
import java.util.*;
/**
 * @author M.NAVEEN
 *
 */
public class get_arrayList 
{  public static ArrayList <Object>n =new ArrayList<>();
   private static ArrayList <Integer> n2=new ArrayList<>();
	public static void main(String[] args) 
	{
		n.add(155);
		n.add(010); //since its is 010 java will consider it as octal so  it is converted in decimal value 0*8^2+1*8^1 + 0*8^0= 8
		n.add(4854.256);
		n.add("NAVEEN");
		// arraylist element ->>> 155->010
		System.out.println(n.getClass());// Print's class name
		System.out.println(n.get(0));//get(int index);
		System.out.println(n.get(1));
		
		n2.add(0101);
		System.out.println(n2.get(0)); //since its is 010 java will consider it as octal so  it is converted in decimal value 0*8^3+1*8^2+0*8^1 + 1*8^0= 64+1=65

	}

}
