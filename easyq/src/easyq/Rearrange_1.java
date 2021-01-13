package easyq;
/*  BY-M.NAVEEN
 *  engineerscodes
 *  code -Program for array rotation
 *  sr.code-Ar2 
 *  moves  zeros to end of the array
 *  */
import java.util.*;
public class Rearrange_1   // class name 
{   static Scanner nav=new Scanner (System.in); // calling Scanner and creating object nav
    static int array[],size,replace=0;  // class instances variables 
	public  Rearrange_1(int c) // constructor 
	{
		size=c;
		array=new int[size];  //intialization of variables  
	}
   public static void repair()  //method 
   {
	   for( int i=0;i<size;i++)
	   {
		   if(array[i]!=-1 && array[i]!=i)
		   {   replace=array[i];
		       while(array[replace]!=-1&& array[replace]!=replace)
		       {
		    	   int y=array[replace];
		    	   array[replace]=replace;
		    	   replace=y;
		       }
		       array[replace]=replace;
			   if (array[i]!=-1)
			   {
				   array[i]=-1;
			   }
		   }
	   }
	   System.out.println(" temp array "+Arrays.toString(array));
   }
   public static void input()
   {
   	for(int i=0;i<array.length;i++)
   		array[i]=nav.nextInt();
   	System.out.println("element in array are::"+Arrays.toString(array));
   	repair();
   }
   public static void main(String arg[])
   {
   	System.out.println("enter the size of the array");
   	Rearrange_1 n=new Rearrange_1 (nav.nextInt());
   	System.out.println("Enter the element of array");
   	input();
   }
}
//[-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]