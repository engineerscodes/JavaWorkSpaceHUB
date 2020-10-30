package linkedlistss;
import java.util.*;
public class dellist 
{  static Scanner nav=new Scanner(System.in);
   static LinkedList <Integer> array[]=new LinkedList[5];
	public  dellist() 
	{  
	  for(int i=0;i<5;i++)
	  {
		  array[i]=new LinkedList <Integer>();
	  }
	}
  public static void main(String arg[])
  {    dellist n=new dellist();
	  for(int i=0;i<5;i++)
	  {
	   System.out.println("enter the data -");
	   array[i].add(nav.nextInt());
	  }
	  System.out.println("Displaying the linked list ");
	  for(int i=0;i<5;i++)
	  {
		  System.out.print(array[i]+" , ");
	  }
	  System.out.println();
	  array[1].add(100);
	  for(int i=0;i<5;i++)
	  {
		  System.out.print(array[i]+" , ");
	  }
  }
}
