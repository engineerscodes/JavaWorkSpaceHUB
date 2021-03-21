/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Employee 
{
  private  String name;
  private  int id;
  public Employee(String name, int id) 
  {
	
	     this.name = name;
	     this.id = id;
   }
	
  public String getName() {
	return name;
}

public int getId() {
	return id;
}

public String toString()
  {
	  return "Name :"+name+"\nId :"+id;
  }
   public static void main(String ...strings)
   {
	   Employee e1;
	   PartTimeEmployee pe=new PartTimeEmployee("NAVEEN",5,10.0d);
	   pe.calulateSalary(5);//number of hours
	   e1=pe;
	   System.out.println(e1);
	   
	   FullTimeEmployee fe=new FullTimeEmployee("praveen",6,60d);
	   fe.calulateSalary(5); //number of Days 
	   e1=fe;
	   System.out.println(e1);
   }

}

class PartTimeEmployee extends Employee
{
  private double salary,hourlyRate;

public PartTimeEmployee(String name, int id, double hourlyRate) {
	super(name, id);
	this.hourlyRate = hourlyRate;
}
	public double calulateSalary(int numberofHours)
	{
		salary=numberofHours*hourlyRate;
		return salary;
	}
	public String toString()
	{
		return "Name :"+super.getName()+"\nId :"+super.getId()+"\nHourly Rate :"+hourlyRate+"\nsalary :"+salary+"\n";
	}
}


class FullTimeEmployee extends Employee
{
	

	private double salary,weeklyPayRate;

	public FullTimeEmployee(String name, int id, double weeklyPayRate) {
		super(name, id);
		
		this.weeklyPayRate = weeklyPayRate;
	}
	
	public double calulateSalary(int numberofDays)
	{
		salary=numberofDays*weeklyPayRate;
		return salary;
	}
	public String toString()
	{
		return "Name :"+super.getName()+"\nId :"+super.getId()+"\nWeekly Pay Rate :"+weeklyPayRate+"\nsalary :"+salary+"\n";
	} 
	
}
