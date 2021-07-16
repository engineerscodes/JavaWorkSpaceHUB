
import static java.lang.System.out;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int n3;
		out.print("[ "+n1+" , "+n2);
		for (int i=2;i<10;i++)
		{
			n3=n1+n2;
			out.print(" , "+n3);
			n1=n2;
			n2=n3;
			
		}
		
		out.print("]");
   
	}

}

