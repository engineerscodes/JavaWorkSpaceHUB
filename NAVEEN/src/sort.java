import java.util.*;
import java.util.Arrays;

public class sort {
 static Scanner nav=new Scanner(System.in);
    public static void main(String[] args)
    {    System.out.println("enter size");
         int size=nav.nextInt();
         int a[]=new int[size];
         for (int i=0;i<=size-1;i++)
        	 a[i]=nav.nextInt();
       
        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length);

        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+",");
        }
    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

  
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}

