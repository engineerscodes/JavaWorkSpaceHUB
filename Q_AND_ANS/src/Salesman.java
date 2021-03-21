/**
 * 
 */
  import java.util.*;
/**
 *  @author Dr. S. GOPIKRISHNAN
 *  
 */
public class Salesman 
{   String name,salesman_code;
     int salesman_amount;
     double commission;
	public Salesman(String name, String salesman_code, int salesman_amount) {
		super();
		this.name = name;
		this.salesman_code = salesman_code;
		this.salesman_amount = salesman_amount;
		commission =0;
	}
	public Salesman() 
	{
		name="";
		salesman_code="";
	}
	public double  calcommission()
	{   
		if(salesman_amount<2000) {commission =(8.0/100.0)*salesman_amount; return commission;}
		
		else if (salesman_amount>=2000 && salesman_amount<=5000 ) {commission =(10.0/100.0)*salesman_amount; return commission;}
		else 
			commission =(12.0/100.0)*salesman_amount; return commission;
	}
	public String toString()
	{
		return " Salesman Name :"+name+"\nSalesman Code :"+salesman_code+"\nSalesman Amount :"+salesman_amount+"\nCommission :"+commission+"\n";
	}
    
	//getter setter are not must but its good practise 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalesman_code() {
		return salesman_code;
	}
	public void setSalesman_code(String salesman_code) {
		this.salesman_code = salesman_code;
	}
	public int getSalesman_amount() {
		return salesman_amount;
	}
	public void setSalesman_amount(int salesman_amount) {
		this.salesman_amount = salesman_amount;
	}
	public static void main(String ...strings)
	{   Salesman s1=new Salesman("Naveen","STD1005",1500);
		System.out.println(s1.calcommission());
		System.out.println(s1);
		Salesman s2=new Salesman("Sharma","STD1007",4500);
		System.out.println(s2.calcommission());
		System.out.println(s2);
		
		Salesman s3=new Salesman("Rhea","STD10098",6000);
		System.out.println(s3.calcommission());
		System.out.println(s3);
		
	}
	
}

