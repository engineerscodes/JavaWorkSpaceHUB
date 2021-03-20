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
	 // System.out.println("size");
	 // arrays n=new arrays(10);
	 // input();
	//  mixint();
	  int ind[]= {4,5,6,7,0,2,1,3};
	  String s="codeleet";
	  
      String str[]=new String[ind.length] ;   
      for(int i=0;i<ind.length;i++)
      {
    	 str[ind[i]]=s.charAt(i)+"";
    	  
      }
      
    final  ArrayList <Object> n=new ArrayList <>();
     //  n=new ArrayList();// The final local variable n cannot be assigned. It must be blank and not using a compound 
  	// assignment
      n.add(233);
      n.add("db");
   //   System.out.println("N1 -"+n);
      
     ArrayList  <Object> n2=n;
                  
      n2.add("REFERNCES");
      
      System.out.println("N1-"+n);
      
      System.out.println("N2-"+n2);
      
    // System.out.println(Arrays.toString(str));
	
	 
  }
}
