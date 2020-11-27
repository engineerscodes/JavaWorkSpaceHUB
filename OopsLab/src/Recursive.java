/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Recursive
{ 
     int num;
    static Scanner nav=new Scanner(System.in);
	public Recursive(int num) 
	{
		this.num=num;
	}
   public long findfact(int num)  //must be long if num>16
   {
	   if (num==1 || num==0)
	   {
		   return 1;
	   }
	   return num*findfact(num-1);
	   
   }
	public static void main(String[] args)
	{
	  System.out.println("Enter the To find Factorial :");
	  int r=nav.nextInt();
	 long factorial= new  Recursive(r).findfact(r); 
     System.out.println("Factorial of Given number "+r+" is :"+factorial);
	}

}

