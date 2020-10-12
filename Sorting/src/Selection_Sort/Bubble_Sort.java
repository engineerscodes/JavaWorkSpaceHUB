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
public class Bubble_Sort
{
      static Scanner nav=new Scanner(System.in);
	public static void main(String[] args)
	{ int size=nav.nextInt();
      int array[]=new int[size];
     //Input  
      for(int i=0;i<array.length;i++)
      {
   	   array[i]=nav.nextInt();
      }
      
      //sorting  
      /*
       * // Find the max element in array[0...n]
        // and place it at end
      */
      for(int i=0;i<array.length-1;i++)
      {
    	  for(int j=0;j<array.length-i-1;j++)
    	  {
    		  if(array[j]>=array[j+1])
    		  {
    			  int c=array[j];
    			  array[j]=array[j+1];
    			  array[j+1]=c;
    		  }
    	  }
      }
      System.out.println("Sorted Array :"+Arrays.toString(array));
	}

}
