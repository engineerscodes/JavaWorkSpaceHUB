/**
 * 
 */
package linkedlist;

/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class linkedlist_end 
{
     static linkedlist l=new linkedlist();
	public linkedlist_end() 
	{
       super();
	}
   public static void last()
   {
	   l.d.addFirst(1000);
	   l.df.addFirst(1025.0);
	   System.out.println("New d list"+l.d); 
       System.out.println("New double list"+l.df); 
   }
	public static void main(String[] args) 
	{
          System.out.println("ADDING TO FRONT OF THE LIST"); 
          l.add();
          System.out.println("Initial d list"+l.d); 
          System.out.println("Initial double list"+l.df); 
          last();
	}

}
