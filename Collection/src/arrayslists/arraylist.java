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
public class arraylist 
{  
   ArrayList <Integer> d;
   ArrayList <String> str;
   ArrayList <Double>  df;
   ArrayList <Float> f;
   ArrayList<Object> obj;
   //ArrayList <Boolean> b;
   ArrayList <Character> c;

	public arraylist() 
	{
		d=new ArrayList<>();
		str=new ArrayList<>();
		df=new ArrayList<>();
		f=new ArrayList<>();
		obj=new ArrayList<>();
		//b=new ArrayList<>();
		c=new ArrayList<>();
		addition();
	}
	public void addition()
	{
		for(int i=1;i<=10;i++)
			d.add(i);
		for(float i=1;i<10;i++)
		{
			f.add(i);
		}
		for(double i=1;i<10;i++)
		{
			df.add(i);
		}
		String s="NAVEEN IS VITIAN IRONMAN HULK AND THOR LOKI";
		String st[]=s.split(" ");
		char ch[]=s.toCharArray();
	    for(char x:ch)
	      c.add(x);
	     for(String i:st)
	    	 str.add(i);
		obj.addAll(d);
		obj.addAll(f);
		obj.addAll(df);
		obj.addAll(c);
		obj.addAll(str);
		
		
		//for(String i:st)
		 // str.add(i);
		
	}
   public static void main(String ...arg)
   {
	    arraylist n=new arraylist();
	    System.out.println(n.obj);
   }
}

