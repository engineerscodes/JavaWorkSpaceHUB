/**
 * 
 */
package Days8;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Multithreadings
{

	public Multithreadings() 
	{
		
	}

	public static void main(String[] args)
	{    System.out.println("... Multithreading ");
		new read().start();
        new vowels().start();
        System.out.println("... Multithreading is over ");
	}

}

class read extends Thread
{ 
	public void run()
	{   
		 ObjectInputStream obj;
		    int n1;
		   String s[];
			try {
				obj=new ObjectInputStream(new FileInputStream("output.ser"));
				s=(String[]) obj.readObject();
				 System.out.println(" serilzation Arrays :"+Arrays.toString(s));
				 System.out.println("String Lenght More than 3>");
				 for(int i=0;i<s.length;i++)
				 {
					if(s[i].length()>3) 
						System.out.println(s[i]);
				 }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}

class vowels extends Thread
{
	public void run()
	{
		 ObjectInputStream obj;
		   String s[];
			try {
				obj=new ObjectInputStream(new FileInputStream("output.ser"));
				s=(String[]) obj.readObject();
				 System.out.println(" serilzation Arrays :"+Arrays.toString(s));
				 System.out.println("String  Of Volwels>");
				 for(int i=0;i<s.length;i++)
				 {  int vowels=0;
					char h[]=s[i].toLowerCase().toCharArray();
                     for(int j=0;j<h.length;j++)
                     {
                    	 if(h[j] == 'a' || h[j] == 'e' || h[j] == 'i' || h[j] == 'o' || h[j] == 'u')
                    	 {
                                 ++vowels;
                    	 }
                     }
                     if(vowels>0) {System.out.println(Arrays.toString(h));}
				 }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	}


