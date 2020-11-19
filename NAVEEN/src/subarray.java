/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
class subarray {


	public static void main(String[] args)
	{  int sum=0;
		int a[]= {1,4,2,5,3};
		for(int i=0;i<a.length;i=i++)
		{
			for(int j=i;j<a.length;j=j+2)
			{
				for(int c=i;c<=j;c++)
				{   
					{System.out.print(a[c]+"");
					  sum+=a[c];
					
					}
				}
				System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println(sum);
	}

}

