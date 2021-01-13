package easyq;
import java.util.*;
public class min 
{   static Scanner nav=new Scanner(System.in);
    static int array[],temp,size;
    static int good,bad;
	public min(int size) 
	{
		this.size=size;
		array=new int[size];
		good=bad=0;
	}
	
	public static void input()
	{   System.out.println("INPUT element in array :-> >");
		for(int i=0;i<size;i++)
		{
			array[i]=nav.nextInt();
		}
	}
	public static void minswap(int k)
	{   int min=100;
		for(int i=0;i<size;i++)
		{
			if(array[i]<=k)
			  good++;
			else 
				bad++;
		}
		System.out.println("bad -"+bad+"Good -"+good);
		for(int i=0;i<size;i++)
		{  int b=bad;
			for( int j=0;j<size;j++)
			{
				if(array[j]<=k)
					b--;
			}
			if(b<=min)
				min=b;
			System.out.println("min   __"+min);
		}
		
	}
	public static void main(String NAVEEN[])
	{
		System.out.println("Enter the size of array");
		min n=new min(nav.nextInt());
		input();
		System.out.println("Enter K value");
		minswap(nav.nextInt());
	}

}
