import java.util.*;
import java.util.Arrays;
public class selectionsort 
{  static Scanner nav=new Scanner(System.in);
   public void selection(int a[],int n)
   {
	   for(int i=0;i<n-1;i++)
	   {
		   int min=i;
		   for(int j=i+1;j<n;j++)
		   {
			   if(a[j]<a[min])
				   min=j;
			   
		   }
		   int c=a[i];
		   a[i]=a[min];
		   a[min]=c;
	   }
	   System.out.println(" "+Arrays.toString(a));
   }
  public static void main(String arg[])
  {  
	  System.out.println("ENTER THE SIZE OF ARRAY");
	  int size=nav.nextInt();
	  int a[];
	  a=new int[size];
	  System.out.println("ENTER THE elements OF ARRAY");
	  selectionsort n=new selectionsort();
	  for(int i=0;i<size;i++)
		  a[i]=nav.nextInt();
	  System.out.println(" "+Arrays.toString(a));
	  n.selection(a,size);
	  
	  
  }
	

}
