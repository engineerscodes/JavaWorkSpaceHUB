/**
 * 
 */
package arrayslists;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class replace_arraylist extends arraylist
{
	public replace_arraylist() 
	{
		super();
	}
  public void replace()
  {
	  System.out.println("Initial Arraylist d -"+d);
	  
	  for(int i=10,j=0;i>=1;i--,j++) //using set method-set(index,value)
		  d.set(j,i);
	  System.out.println("After replacing Arraylist d -"+d);
  }
	public static void main(String[] args) 
	{ 
		new replace_arraylist().replace();
	}

}
