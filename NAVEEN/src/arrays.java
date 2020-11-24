import java.util.*;

public class arrays 
{  static Scanner nav=new Scanner(System.in);
   static int array[],size;
	public arrays(int data) 
	{
		size=data;
		array=new int[size];
	}
  public static void input()
  {
	  for(int i=0;i<size;i++)
		  array[i]=nav.nextInt();
  }
  public static void mixint()
  {
	  for(int i=0;i<100;i++)
	  {
		int u= search(i);
		if(u!=-1)
		{   System.out.println(u);
			break;
		}
			
	  }
  }
  public static  int search(int ele)
  {
	  for(int i=0;i<size;i++)
	  {
		  if(array[i]==ele)
		  {
			  return -1;
		  }
	  }
	  return ele;
  }
  public static void main(String nav[]) 
  {   
	/*  String s="Navaen";
	 s= s.replace("a","[.]");
      System.out.println(s);*/
	  System.out.println("size");
	  arrays n=new arrays(10);
	  input();
	  mixint();
	
	 
  }
}
