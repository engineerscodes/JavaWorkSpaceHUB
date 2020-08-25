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
public class sort_arraylist 
{
   private static  ArrayList <Integer> n=new ArrayList<>();
   private static ArrayList <String > str=new ArrayList<>();
   private static ArrayList str2=new ArrayList<>();
	public static void main(String[] args) 
	{
		 System.out.println("when arrayList is generic<Integer>");
        n.add(45); //even throught arraylist is static you need object to add
        n.add(485);
        n.add(1);
        n.add(25);
        System.out.println("Before sorting -"+n);
        Collections.sort(n);
        System.out.println("After sorting -"+n);
        //Array sorting depends ASCII keys of character
        System.out.println("when arrayList is generic<String>");
        //sorting rules String type arraylist are 1>it will check 1st character of each String object if number then first ,if character then after all number.then 1st to UpperCases Character
        str.add("45");
        str.add("1200");
        str.add("1.1");
        str.add("5.5");
        str.add("red");
        str.add("blue");
        str.add("apple");
        str.add("thor");
        str.add("Red");// if both u same Red=REd then REd will be printed first because of Uppercase 
        str.add("REd");//because of ASCII KEY VALUES EG-A<a (65<97)
        str.add("900");
        System.out.println("Before sorting -"+str);
        Collections.sort(str);
        System.out.println("After sorting -"+str);
        
        System.out.println("when arrayList is non generic");
        str2.add(45);
        str2.add(1200);
        str2.add("1.1");
        str2.add(5.5);
        str2.add("red");
        str2.add("blue");
        str2.add("apple");
        str2.add("thor");
        str2.add("Red");// if both u same Red=REd then REd will be printed first because of Uppercase 
        str2.add("REd");//because of ASCII KEY VALUES EG-A<a (65<97)
        str2.add(900);
        System.out.println("Before sorting -"+str2);
        Collections.sort(str);
        System.out.println("After sorting -"+str2);
	}

}
