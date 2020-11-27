/**
 * 
 */
package day5;

import java.util.Arrays;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class soting_generic {

	
	   public static < Number > void printArray( Number[] arr ) 
	   {
		      for(Number element : arr) {
		         System.out.printf("%s ", element);
		      }
		      System.out.println();
		      
		   }
	  
	public static void main(String[] args)
	{    Integer x[]= {1,2,9,4,5};
	int t[]= {2,5,7,9};
	 Integer[] intArray = { 1, 2, 3, 4, 5 };
     Double[] doubleArray = { 1.1, 2.2, 4.4 , 3.3};
     Float[] Array = { 1.1f, 2.2f, 4.4f , 3.3f};

     System.out.println("Array integerArray contains:");
     printArray(intArray); 
     cal n=new cal(x);
     n.sorting();
     System.out.println("\nArray doubleArray contains:");
     printArray(doubleArray);  
     cal n2=new cal(doubleArray);
     n2.sorting();

     System.out.println("\nArray Float contains:");
     printArray(Array); 
     cal n3=new cal(Array);
     n3.sorting();
     
     System.out.println("========================Merger Sort================================");
      cal n4=new cal();
      int res[]=n4.mergeSort(t, t.length);
      System.out.println(Arrays.toString(res));
	}

}

class cal <sort extends Number >
{ sort obj[];
	cal(sort[] obj)
	{
		this.obj=obj;
	}
	cal()
	{
		
	}
	public void sorting()
	{
		for(int i=0;i<obj.length-1;i++)
		{
			for(int j=0;j<obj.length-i-1;j++)
			{
				if(obj[j].doubleValue()>obj[j+1].doubleValue()) 
				{
					sort temp = obj[j]; 
                    obj[j] = obj[j+1]; 
                    obj[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(obj));
	}
	public  int[] mergeSort(int[] a, int n) {
	    if (n < 2) {
	        return a;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
	 
	    merge(a, l, r, mid, n - mid);
	    return a;
	}
	public static int[] merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			  return a;
			}

}

