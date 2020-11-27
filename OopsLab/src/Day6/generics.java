/**
 * 
 */
package Day6;

import java.util.Arrays;

public class generics
	{  
		public static void main(String[] args) 
		{
	      System.out.println("Enter the Number :");
	      String t[]= {"naveen","balapraveen","baveen"};
	      Array ar=new Array(t);
	      ar.Sort(t);
	      System.out.println(Arrays.toString(ar.mark));

		}

	}

	class Array <Type extends Comparable<  Type>>
	{  Type mark[];
	Type temp;
	   int count=0;
		Array(  Type Marks[])
		{
			mark=Marks;
		}
		public void put(Type i)
		{
			mark[count++]=(Type)i;
		}
		public <T> Type[] Sort(Type Marks[])
		{  
			for(int i=0;i<mark.length-1;i++)
			{
				for(int j=0;j<mark.length-i-1;j++)
				{   String n1=(String) mark[j];
				    String n2=(String) mark[j+1];
				    int l1=n1.length();
				    int l2=n2.length();
					if(l1>l2 )
					{
						temp=(Type) mark[j];
						mark[j]=mark[j+1];
					mark[j+1]= temp;
						
					}
					else if(l1==l2)
					{
						Type t=(Type) mark[j];
						mark[j]=mark[j+1];
					mark[j+1]=   (Type) t;
						
					}
				}
			}
			
			return (Type[]) mark;
		}
	}




