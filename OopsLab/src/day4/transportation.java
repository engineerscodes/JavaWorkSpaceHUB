/**
 * 
 */
package day4;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class transportation 
{
   int price;
   int pricekg;
   Object obj;
   int total=0;
	public transportation() 
	{
		
	}

	public transportation(bus b,int number,int price) 
	{
		b.number=number;
		this.price=price;
		this.pricekg=0;
		sum(number,0,price,0);
	}
	public transportation(cars c,int number,int price) 
	{
		c.number=number;
		this.price=price;
		this.pricekg=0;
		sum(number,0,price,0);
	}
	public transportation(truck t,int numberkg,int price) 
	{
		t.numberkg=numberkg;
		this.price=0;
		this.pricekg=price;
		sum(numberkg,0,price,0);
	}
	public transportation(ship sp,int number,int numberkg,int price,int pricekg) 
	{
		sp.number=number;
		sp.numberkg=numberkg;
		this.price=price;
		this.pricekg=pricekg;
		sum(number,numberkg,price,pricekg);
	}
	
	public transportation(flight f,int number,int numberkg,int price,int pricekg) 
	{
		f.number=number;
		f.numberkg=numberkg;
		this.price=price;
		this.pricekg=pricekg;
		sum(number,numberkg,price,pricekg);
	}

    public void sum(int number,int numberkg,int price,int pricekg)
    {
    	 total=price*number +pricekg*numberkg;
    	 System.out.println("flare of :"+number+" people "+" number of kg :"+numberkg+" price per head :"+price+" price per kg :"+pricekg+" Total"+total);
    }
	public static void main(String[] args)
	{   System.out.println("Bus");
		transportation  bt=new transportation (new bus(),5,500);
		 System.out.println("CARS");
		transportation  car=new transportation (new cars(),3,1000);
		 System.out.println("TRUCKS");
		transportation  truck=new transportation (new truck(),3,1000);
		 System.out.println("SHIP");
		transportation  ship=new transportation (new ship(),3,5,1000,500);
		 System.out.println("FLIGTH");
		transportation  f=new transportation (new flight(),3,15,100,500);
	}

}

class bus {
   String function="people"	;
   int number=0;
   
}
class cars{
	 String function="people"	;
	 int number=0;
	 
}
class truck{
	 String function="Load"	;
	 int numberkg=0;
}
class ship{
	 String function="Both"	;
	 int number=0;
	 int numberkg=0;
	
}
class flight{
	 String function="Both"	;
	 int number=0;
	 int numberkg=0;
	
}
