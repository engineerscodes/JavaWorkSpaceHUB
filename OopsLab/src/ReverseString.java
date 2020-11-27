/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class ReverseString 
{   private String str,output;
    static Scanner nav=new Scanner(System.in);
	public ReverseString(String str) 
	{
		this.str=str;
		output="";
	}
	public String reverse(String str)
	{
	   String s[]=str.split("");
	   System.out.println("Initial String :"+Arrays.toString(s));
	   for(int i=s.length -1;i>=0;i--)
	   {
		   output=output+s[i];
	   }
	   //System.out.println(output);
	   output=output+" ";
	   return output;
	}
	public static void main(String ...strings)
	{
		System.out.println("Enter the String to find reverse");
		String a=nav.nextLine();
		ReverseString rs=new ReverseString(a);
		String temp[]=a.split(" ");
		for(int i=temp.length-1;i>=0;i--)
			rs.reverse(temp[i]);
		System.out.println("Reverse String :"+rs.output);
	}

}

