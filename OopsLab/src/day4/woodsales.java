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
public class woodsales {

	public woodsales() {
		
	}

	public static void main(String[] args) 
	{
	
	//	father f=new father();
		father f=new father(500,100,1.8f,2);
		f.cal();
		f.cal_profit();
System.out.println(" profit :"+f.profit+" raw wood cost :"+f.raw_wood_cost+" making_charges :"+f.making_charges+" size : ("+f.w+" ,"+f.h+")");
    System.out.println("Cost of production :"+f.cost_of_pro);
    
    son s=new son(500,100,3.8f,2);
    s.cal();
    s.cal_profit();
    s.discount();
    System.out.println(" profit :"+s.profit+" raw wood cost :"+s.raw_wood_cost+" making_charges :"+s.making_charges+" size : ("+s.w+" ,"+s.h+")");
    System.out.println("Cost of production :"+s.cost_of_pro +" Discount :"+s.dicount);
	}
	

}

class father{
	
	static  float profit;
	float raw_wood_cost;
	float making_charges;
	float w,h;
	float cost_of_pro;
	father()
	{
		profit=0;
		raw_wood_cost=0;
		making_charges=0;
		w=0;
		h=0;
		cost_of_pro=0;
	}
	
	father(float cost,float charges,float w,float h)
	{
		raw_wood_cost=cost;
		making_charges=charges;
		if(w%1==0)
			this.w=w;
		else
			this.w=((int)w/1)+1;
		if(h%1==0)
			this.h=h;
		else
			this.h=((int)w/1)+1;
		cost_of_pro=0;
	}
	
	public static float getProfit() {
		return profit;
	}
	public static void setProfit(float profit) {
		father.profit = profit;
	}
	public float getRaw_wood_cost() {
		return raw_wood_cost;
	}
	public void setRaw_wood_cost(float raw_wood_cost) {
		this.raw_wood_cost = raw_wood_cost;
	}
	public float getMaking_charges() {
		return making_charges;
	}
	public void setMaking_charges(float making_charges) {
		this.making_charges = making_charges;
	}
	public float getW() {
		return w;
	}
	public void setW(float w) {
		this.w = w;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	public float getCost_of_pro() {
		return cost_of_pro;
	}
	public void setCost_of_pro(float cost_of_pro) {
		this.cost_of_pro = cost_of_pro;
	}
	
	public float cal()
	{   
		cost_of_pro=(raw_wood_cost*(w*h)+making_charges );
		return cost_of_pro;
	}
	
	public float cal_profit()
	{
		return profit=profit+cost_of_pro;
	}
}

class son extends father
{  float dicount =0;
     son()
     {
    	 super();
     }
     
     son(float cost,float charges,float w,float h)
     {
    	super(cost,charges,w,h);
    	super.w=w;
    	super.h=h;
     }
     
     public float cal()
     {
    	 cost_of_pro=raw_wood_cost*(w*h)+making_charges;
 		return cost_of_pro;
     }
     public float cal_profit()
 	{
 		return profit=profit+cost_of_pro;
 	}
     public float discount()
     {
    	 if(w*h<=10)
    	 {
    		 dicount=super.cost_of_pro/10;
    	 }
    	 if(w*h>10)
    	 {
    		 dicount=super.cost_of_pro/15;
    	 }
    	 profit=profit-dicount;
    	 return dicount;
     }
     
}

