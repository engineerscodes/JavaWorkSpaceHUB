package arrayslists;
import java.util.*;
public class insertfirst 
{  static ArrayList <Double> n=new ArrayList<>(); 
  public static void main(String ...arg)
  {
	  n.add(12.5);
	  n.add(100.0);
	  for(Double x:n)
	  {
		  System.out.print(x+" ");
		  
		  
	  }
	  System.out.println();
	  n=new ArrayList<>(10);
	  n.add(12.5);
	  n.add(100.0);
	  for(Double x:n)
	  {
		  System.out.print(x);
		
	  }System.out.println();
	  n.add(0,10.01); 
	  n.add(0,2.0);
	  n.add(4,5.55);// n.add(10,5556.66) error because size only 4 so it must be  lesser than =4
	  for(Double x:n)
	  {
		  System.out.println(x);
	  }
  }
}
