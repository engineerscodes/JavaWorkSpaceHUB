/**
 * 
 */
package day3;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Vehicle extends owner
{
   private String type;
   private String reg;
   private String size,work;
   public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getWork() {
	return work;
}

public void setWork(String work) {
	this.work = work;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getReg() {
	return reg;
}

public void setReg(String reg) {
	this.reg = reg;
}
	public Vehicle()
	{
	    type="";
	    reg="";
	}
    
	public Vehicle(String type ,String reg)
	{
		super();
		this.type=type;
		this.reg=reg;
	}
	public Vehicle(String type ,String reg,String size,String work,String name,String add)
	{
		super(name,add);
		this.type=type;
		this.reg=reg;
		this.size=size;
		this.work=work;
	}
	public static void main(String[] args) 
	{
		Vehicle v=new Vehicle("two wheeler","GA05AF4567","Medium","travelling","Naveen","Ram Nager Goa") ;
		System.out.println("Type of vehicle :"+v.type+"\n reg number :"+v.reg);
		System.out.print(" vehicle drive :");
		v.drive();
		System.out.print(" vehicle purpose :");
		v.purpose();
		System.out.print(" vehicle Size :");
		v.size();
		System.out.print(" vehicle Strucuture :");
		v.structure();
		
	}
	
	public void drive()
	{
		System.out.println("Way to drive long or short");
		
	}
	public void structure()
	{
		System.out.println("metal and carbon fiber");
	}
	
	public void purpose()
	{
		System.out.println("Purpose is for "+work);
	}
   public void size()
   {
	   System.out.println("SIZE OF THE Vehicle is "+size);
   }
   
}

class owner{
	public String name;
	public String add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	owner()
	{
		name="";
		add="";
	}
	owner(String name,String add)
	{
		this.name=name;
		this.add=add;
	}
}
