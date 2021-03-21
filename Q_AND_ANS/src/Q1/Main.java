/**
 * 
 */
package Q1;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Main {

	public static void main(String[] args) 
	{
		Worker w1=new Worker(1,30);
		w1.calWage();
		System.out.println(w1);
		Worker w2=new Worker(1,50);
		w2.calWage();
		System.out.println(w2);
		Worker w3=new Worker(2,50); //Number of weeks 2
		w3.calWage();
		System.out.println(w3);
		Worker w4=new Worker(1,80d,5d); //int numberofweeks, double total_hr, double hr
		w4.calWage();
		System.out.println(w4);
	}

}



class Worker{
	
	double hr,overtimehr; //hour rate
    int	numberofweeks;
    double Total_hr;
    double hr_per_week;
    double wage;
	public Worker( int numberofweeks, double total_hr, double hr) {
	
		this.numberofweeks = numberofweeks;
		Total_hr = total_hr;
		 this.hr=hr;
		 hr_per_week=(Total_hr/numberofweeks);
	}
	
	
	
	
	public Worker(int numberofweeks, double total_hr) {
	    hr=5;
		this.numberofweeks = numberofweeks;
		Total_hr = total_hr;
		 hr_per_week=(Total_hr/numberofweeks);
	}




	public double calWage()
	{
		 if(hr_per_week<=30) {wage=5*hr_per_week*numberofweeks; return wage;}
		 else {
			   
			   overtimehr = hr_per_week-30;
			   
			   if( overtimehr<=25 ) { wage=hr*30*numberofweeks+(1.5*hr*overtimehr*numberofweeks);}
			   else {
				   wage=hr*30*numberofweeks+  (2*hr*overtimehr*numberofweeks);
			   }
			return wage; 
		 }
	}
    
     public String toString()
     {
    	 return "Wage :"+wage +"\nTotal Work HR :"+Total_hr +" Overtime HR :"+overtimehr+"No of weeks :"+numberofweeks;
     }
	  
}

