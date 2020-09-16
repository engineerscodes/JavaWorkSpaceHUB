import java.util.Arrays;
import java.util.*;

public class sorting 
{

	public static  void qicksort(int a[],int l,int r)
	{
		
		if(l<r)
		{int pivot=a[l];
		 int i=l;
		 int j=r;
		
		while(i<j)
		{   i=i+1;
			while(i<=r&&a[i]<=pivot)
				i++;
			
			while(j>=l&&a[j]>pivot)
				j--;
			
			if(i<j &&i<=r)
			{swap(a,i,j);
			 }
		}
		
		swap(a, l,j);
		qicksort(a, l, j-1);
		qicksort(a, j+1, r);
		
		}
	}

	public static  void swap(int a[],int x,int y)
	{
		int c=a[x];
		a[x]=a[y];
		a[y]=c;
	}
	
	public  static void  main(String args[])
	{   Scanner nav=new Scanner(System.in);
		
		int size=nav.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=nav.nextInt();
		}
		qicksort(a,0,size-1);
		
	   System.out.println(Arrays.toString(a));
		
		
	}
}
