/**
 * 
 */
import java.util.*;
/**
 * @author M.NAVEEN
 RANDOM CODER'S
 *
 */
public class GopiSir {
   static ArrayList<String> n=new ArrayList();

    public static void deat(String str,String ans)
    {
    	if(str.length()==0)
    	{
    		n.add(ans);
    		System.out.println(" "+ans);
    		return ;
    	}
    	deat(str.substring(1),ans);
    	deat(str.substring(1),ans+str.charAt(0));
    }
	public static void main(String[] args)
	{  
		  deat("abc","");
		  n.remove("");
		 // System.out.print(n);
		  sort();
	}
	/**
	 * 
	 */
	private static void sort() 
	{    int index=0;
	  String s[]=new String[n.size()];
	  for(String m:n)
	  {
		  s[index++]=m.toString();
	  }
	System.out.println(Arrays.toString(s));
   for(int i=0;i<s.length-1;i++)
   {   int min=i;
	   for(int j=i+1;j<s.length;j++)
	   {
		   if(s[i].length()>s[j].length())
			   min=j;
	   }
	   String temp=s[min];
	   s[min]=s[i];
	   s[i]=temp;
	   
   }
		for(Object x:s)
			System.out.println(x.toString());
	}


}
