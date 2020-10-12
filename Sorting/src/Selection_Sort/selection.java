/**
 * 
 */
package Selection_Sort;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class selection 
{   static Scanner nav=new Scanner(System.in);;
    static int array[];
	public selection(int size) 
	{
        array= new int[size];
       
	}
    
	public static void main(String[] args)
	{
       new selection(nav.nextInt());
          //input 
       for(int i=0;i<array.length;i++)
       {
    	   array[i]=nav.nextInt();
       }
       //sorting
       /*
        * // Find the minimum element in array[0...n]
         // and place it at beginning
       */
       
        for(int i=0;i<array.length-1;i++)
        {   int min=i;
        	for(int j=i+1;j<array.length;j++)
        	{
        		if(array[j]<array[i])
        		{
        			min=j;
        		}
        		int c=array[min];
    			array[min]=array[i];
    			array[i]=c;
        	}
        }
        System.out.println(Arrays.toString(array));
	}

}
