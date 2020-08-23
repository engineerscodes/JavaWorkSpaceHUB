package cab.main;
import cab.entity.*;
import cab.service.*;
public class Main {

	public static void main(String[] args) throws Exception {
		//Cab depot
				Cab cabs[] = new Cab[3];
				cabs[0]=new Cab(601, "mini", "TN37AP0007", true);
				cabs[1]=new Cab(602,"micro","TN06CX7536",false);
				cabs[2]=new Cab(603, "sedan", "TN28JA1234", true);
				//cabs[0].display();
				CabDepot.setCabs(cabs);	
				CabRentalService carService = new CabRentalService();
				System.out.println(carService.bookCab("TEN", "CBE", "mini", 1)); 
		} 


}
