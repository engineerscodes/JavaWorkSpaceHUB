/**
 * 
 */
package Day6;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class exception_demo
{

   public static void Arithmetic_exception(int a,int b)
   {
	  try { int res=a/b;
	   System.out.println ("Result: "+res);}
	  catch(ArithmeticException e)
	  {
		  System.out.println("ArithmeticException caugth : b!=0");
	  }
   }
   
   public static  void ArrayIndexOutOfBounds() {
	   try{
	        String a[]=new String[50];
	        
	        a[a.length] = "java";
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBoundsException :ArrayIndexOutOfBounds");
	      }
   }
   
   public static void classnotfound() 
   {
	   try {
		Class.forName("rhea");
	} catch (ClassNotFoundException e) {
		
		System.out.println("ClassNotFoundException :class not found");
	}
   }
  public static void number()
  {
	  try{
			 int num=Integer.parseInt (null) ;
			 System.out.println(num);
		      }catch(NumberFormatException e){
			  System.out.println("NumberFormatException :Number format exception occurred");
		       }
  }
   public static  void nullpointer()
   {  try {
	   String naveen[]=null;
	   System.out.println(naveen[0].charAt(0));
   }
   catch( NullPointerException e)
   {
	   System.out.println(" NullPointerException :NullPointerException..");
   }
   }
   
   public static void main(String ...strings)
   {
	   nullpointer();
	   classnotfound();
	   number();
	   ArrayIndexOutOfBounds();
	   Arithmetic_exception(5,0);
	   
   }
}

