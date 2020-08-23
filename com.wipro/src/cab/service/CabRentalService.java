package cab.service;
import cab.entity.*;
public class CabRentalService 
{  CabDepot cap=new CabDepot();

	public CabRentalService() {
		
	}
	public String validateRoute(String source, String destination)
	{
		if(source.length()==0||destination.length()==0||source.equalsIgnoreCase(destination))
		{  //System.out.println("Invalid Route");
			return("Invalid Route");
		}
		else
		{  // System.out.println(" Route");
		   // System.out.print(source);
			String rout[]={"CBE", "MAD", "TEN", "KDL","OTY"};
		   for(int i=0;i<5;i++)
		   {     //System.out.println(rout[i]); 
			   if(source.equalsIgnoreCase(rout[i]))
			   {    // System.out.println(rout[i]); 
				   for(int j=0;j<rout.length;j++)
				   {  
					   if(destination.equalsIgnoreCase(rout[j]))
						 //  System.out.println(rout[j]);
						   return "Available" ;
				   }
			   } 
				   
		   }
			
		}
		return "Unavailable";
	}
	public String validateData(String source, String destination, String cabType, int days)
	{    
		if(validateRoute(source,destination).equalsIgnoreCase("Available"))
		{  
			if((cabType.equalsIgnoreCase("micro")||cabType.equalsIgnoreCase("mini")||cabType.equalsIgnoreCase("sedan"))&&days>=1)
			{  
				return "Valid";
			}
			else
			{
				return "InValid";
			}
				
		}
		else
		{
			return validateRoute(source,destination);
		}
	}
	public String bookCab(String source, String destination, String cabType, int days)
	{    Cab n=new Cab();
	     String r=validateData(source,destination,cabType,days);
		if(r.equalsIgnoreCase("Valid"))
		{  
			cap.calculateRent(cabType,days);
			
		
		if(cap.getRentAmount()==0.0)
		{
			return "Car Not Available" ;
		}
		if(cap.getRentAmount()!=0.0)
		{
			String str=cap.getBookedCabDetails()+"Amount:Rs."+cap.getRentAmount();
			 System.out.println(str); 
		}
		}
	return "";
	}
}
