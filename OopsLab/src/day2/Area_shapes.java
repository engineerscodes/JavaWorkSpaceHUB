/**
 * 
 */
package day2;

import java.util.Scanner;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Area_shapes 
{
    private double area,cir;
	public Area_shapes() 
	{
		area=0;cir=0;
	}
    
	public Area_shapes(double side) 
	{
		area=side*side;
		cir=4*side;
	}
	
	public Area_shapes(double h,double w) 
	{
		area=h*w;
		cir=2*(h+w);
	}
	public Area_shapes(double h,double b,double c) 
	{
		area=(0.5)*(h*b);
		cir=h+b+c;
	}
	public static void main(String[] args) 
	{ Scanner nav=new Scanner(System.in);
      System.out.println("enter the Sides of Square to find Area");
      Area_shapes s=new Area_shapes(nav.nextDouble());
      System.out.println("Area of Squre is :"+s.area +"circumference :"+s.cir);
      System.out.println("enter the Sides of Rectangle to find Area");
      Area_shapes rect=new Area_shapes(nav.nextDouble(),nav.nextDouble());
      System.out.println("Area of Rectangle is :"+rect.area +"circumference :"+rect.cir);
      System.out.println("enter the Sides of Tirangle to find Area");
      Area_shapes tri=new Area_shapes(nav.nextDouble(),nav.nextDouble(),nav.nextDouble());
      System.out.println("Area of Rectangle is :"+tri.area +"circumference :"+tri.cir);
      
      
	}

}



