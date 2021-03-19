package arrayslists;
import java.util.*;
public class array_list 
{         
    static ArrayList n=new ArrayList<>();
    static ArrayList<Object> n1=new ArrayList<Object>();
    public static void main(String ...arg)
    {
    	n.add("red");  //red is object.
    	n.add("yellow");
    	n.add("green");
    	n.add(3343);
    	n1.add(25);
    	n1.add(100);
    	n1.add("1515");
    	for(Object s:n)
    	{
    		System.out.println(s);
    		System.out.println(s.toString());
    	}
    	//ArrayList i=n.iterator(); error interator cannot be converted to arraylist
    	Iterator i=n.iterator();
    	for(;i.hasNext();)
    	{
    		System.out.print(i.next()+",");
    		
    	}
    	/*while(i.hasNext())
    	{
    		System.out.println(i.next()); will not print anything because i is next=null
    		
    	}*/ 
    	Iterator n1=n.iterator();
    	while(n1.hasNext())
    	{
    		System.out.println(n1.next()+"...");
    	}
    }
}

