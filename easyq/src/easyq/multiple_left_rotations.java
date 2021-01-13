package easyq;
/*  BY-M.NAVEEN
 *  engineerscodes
 *  code -Program for array rotation
 *  sr.code-Ar2 
 *  moves  zeros to end of the array
 *  */
import java.util.Arrays;
import java.util.*;
public class multiple_left_rotations   // class name 
{   static Scanner nav=new Scanner(System.in); // calling Scanner and creating object nav
    static int array[],size,rotation[]={1,3,4,6},temp[],count=0;
	public multiple_left_rotations(int c) 
	{  size=c;
	   array=new int[size]; 
	}
	public static void rotation()
	{   rotation[count]=rotation[count]%size;
	    temp=new int[rotation[count]];
		for(int i=0;i<rotation[count];i++)
		{
			temp[i]=array[i];
		}
		System.out.println("elements in array="+Arrays.toString(temp) +count);
		for(int i=rotation[count];i<size;i++)
		{
			array[i-rotation[count]]=array[i];
		}
		for(int i=0;i<rotation[count];i++)
		{
			array[size-1-i]=temp[i];
		}
		System.out.println("elements in array="+Arrays.toString(array));
		count++;
		if (count==size)
			return;
		else 
			rotation();
	}
	   
	   public static void input()
	   {
	   	for(int i=0;i<array.length;i++)
	   		array[i]=nav.nextInt();
	   	System.out.println("element in array are::"+Arrays.toString(array));
	   }
	   public static void main(String arg[])
		{
			System.out.println("enter the size of the array");
			multiple_left_rotations n=new  multiple_left_rotations(nav.nextInt());
			System.out.println("Enter the element of array");
			input();
			rotation();
					      

			

	}
		

}
