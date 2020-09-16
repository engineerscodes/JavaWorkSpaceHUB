import java.util.*;
public class qsrt 
{ static Scanner nav=new Scanner (System.in);
   static int array[],size;
   
	public qsrt(int size) 
	{  this.size=size;
	    array=new int[size];
	}
	public static void input()
	{
		for(int i=0;i<size;i++)
		{
			array[i]=nav.nextInt();
		}
	}
	public static void sort(int arr[],int L,int R)
	{
		if(L<R)
		{
			int x=part(arr,L,R);
			sort(arr,L,x-1);
			sort(arr,x+1,R);
		}
		
	}
	public static int part(int arr[],int i,int j)
	{
		
		
		return 1;
	}

}
