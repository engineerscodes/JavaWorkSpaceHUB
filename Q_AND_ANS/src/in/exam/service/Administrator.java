/**
 * 
 */
package in.exam.service;
import java.util.*;
import in.exam.ice.*;
import in.exam.util.IceCreamFlavorException;
import in.exam.util.IceCreamScoopException;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Administrator {

	public static void main(String[] args) {
	  
		IceCream c1=new IceCream();
		try {
			c1.getIceCream();
		} catch (IceCreamFlavorException e) {
			
			System.out.println(e);
		} catch (IceCreamScoopException e) {
			System.out.println(e);
		}
		
	}

}

