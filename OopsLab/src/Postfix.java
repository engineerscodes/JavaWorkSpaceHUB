/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Postfix 
{   String str;
	static Scanner nav=new Scanner(System.in);
	public Postfix(String str)
	{
		this.str=str;
	}
    public int addition(int a,int b)
    {
    	return a+b;
    }
    public int sub(int a,int b)
    {
    	return a-b;
    }
    public int Multiplication(int a,int b)
    {
    	return a*b;
    }
    public int Division(int a,int b)
    {
    	return a/b;
    }
	public static void main(String[] args)
	{
     System.out.println("Enter a String with valid expression a+b");
     String s=nav.next();
     String temp[]=s.split("");
     Postfix p=new Postfix(s);
     for(int i=0;i<temp.length;i++)
     {
    	 if(temp[i].equals("+"))	 
    	 {  String split[]=s.split("\\+");
    		System.out.println("sum "+ p.addition(Integer.parseInt(split[0]),Integer.parseInt(split[1])));
    	 break;
    	 }
    	 if(temp[i].equals("-"))
    	 {   String split[]=s.split("\\-");
    		 System.out.println("sub  "+ p.sub(Integer.parseInt(split[0]),Integer.parseInt(split[1])));
    	 break;
    	 }
    	
    	 if(temp[i].equals("*"))
    	 {   String split[]=s.split("\\*");
    		 System.out.println("Multiplication "+p.Multiplication(Integer.parseInt(split[0]),Integer.parseInt(split[1])));
    	 break;
    	 }
    	 
    	 if(temp[i].equals("/"))
    	 { String split[]=s.split("\\/");
    		 System.out.println("Division " +p.Division(Integer.parseInt(split[0]),Integer.parseInt(split[1])));
    	 break;
    	 }
    	 
     }
     
	}

}



