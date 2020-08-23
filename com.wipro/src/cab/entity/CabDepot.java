package cab.entity;

import java.util.Arrays;

public class CabDepot 
{
    static Cab Cabs[];
    float rentAmount;
    Cab bookedCab;
	public CabDepot() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public void calculateRent(String cabType, int days) 
	{
		for(int i=0;i<Cabs.length;i++)
		{   if(Cabs[i].isAvailable==true && Cabs[i].cabType.equalsIgnoreCase(cabType))
			{   rentAmount=(getRatePerDay(cabType)*days);
				Cabs[i].isAvailable=false;
				bookedCab=Cabs[i];	
			}	
		}
		
	}
	public String getBookedCabDetails()
	{  
		String str="Cab Type:"+bookedCab.cabType+"\n"+"Cab No:"+bookedCab.regNo;
		//str=String.format("Cab Type:%s \n Cab No:%s",bookedCab.cabType,bookedCab.regNo);
		return str;
		
	}
	public float getRatePerDay(String cabType)
	{  double x;
	   float x1;
		if(cabType.equalsIgnoreCase("micro"))
		{ x =((2525.0f) + (0.1)*2525.0f);
		x1=(float)x;
		  return x1;
		}
		
		else if(cabType.equalsIgnoreCase("mini"))
		{  x=(3110.0+0.12*3110.0);
			x1=(float)x;
			return x1;
		}
		else if(cabType.equalsIgnoreCase("sedan"))
		{
		      x=((3500.0f)+((0.16)*3500.0f));
		      x1=(float)x;
		      return x1;
		}
		return 0;
	}

	public static Cab[] getCabs() {
		return Cabs;
	}

	public static void setCabs(Cab[] cabs) 
	{
		Cabs = cabs;
		
	}

	public float getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(float rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Cab getBookedCab() {
		return bookedCab;
	}

	public void setBookedCab(Cab bookedCab) {
		this.bookedCab = bookedCab;
	}

}
