/**
 * 
 */
package in.exam.ice;

import in.exam.util.*;
import java.util.Scanner;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class IceCream {
  
	
	private String flavor;
	private int scoops;
	private final double PRICE_PER_SCOOP;//PRICE_PER_SCOOP=25 so fine 
	

	public IceCream() {
		super();
		PRICE_PER_SCOOP = 25d;
	}


	public String getFlavor() {
		return flavor;
	}


	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	public int getScoops() {
		return scoops;
	}


	public void setScoops(int scoops) {
		this.scoops = scoops;
	}

	public double getPRICE_PER_SCOOP() {
		return PRICE_PER_SCOOP;
	}
	
   
	public void getIceCream() throws IceCreamFlavorException,IceCreamScoopException  {
		 Scanner nav=new Scanner(System.in);
		System.out.print("Enter the ice cream flavor :");
		flavor =nav.nextLine();
		System.out.println("Enter the no. of scoops :");
		scoops=nav.nextInt();
		
		if(flavor.equalsIgnoreCase("Black Current")) {
			 throw  new IceCreamFlavorException () ;
		}
		 
		if(scoops>3) {
			throw new  IceCreamScoopException ();
		}
		System.out.println("Enjoy the Strawberry ice cream "+getFlavor() +" Please pay Rs "+25*scoops);
		
	}
}

