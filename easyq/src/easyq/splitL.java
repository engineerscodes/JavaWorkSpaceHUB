/**
 * 
 */
package easyq;

/**
 * @author M.NAVEEN
 * RANDOM CODER'S
 *
 */
public class splitL {


	public static void main(String[] args) {
		
		String str="JavaISBALA";
		int n=4;
		for(int i=0;i<str.length();i=i+n) {
			if(i+n<str.length())
			  System.out.println(str.substring(i, i+n));
			else 
			   System.out.println(str.substring(i,str.length()));
		}

	}

}
