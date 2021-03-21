/**
 * 
 */
package Q1;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Banksmain {

	public static void main(String[] args) 
	{
		
		 ICICIBank icc=new  ICICIBank (123833383,"Naveen",4,5000,20);
		 System.out.println("ACCOUNT NUMBER :"+icc.accountNumber+" Name :"+icc.customerName+" AMOUNT :"+icc.calculateAmount());
		 
		 KotMBank kc=new KotMBank(54505151,"Rhea Sharma",5,5000,20);
		 System.out.println("ACCOUNT NUMBER :"+kc.accountNumber+" Name :"+kc.customerName+" AMOUNT :"+kc.calculateAmount());
	}

}


class ICICIBank extends GeneralBank
{
	 
	public ICICIBank(long accountNumber, String customerName, float rateOfInterest, int pAmount, int noOfYears) {
		super(accountNumber, customerName);
		this.rateOfInterest = (rateOfInterest)/100f;
		this.pAmount = pAmount;
		this.noOfYears = noOfYears;
	}

	private float rateOfInterest;
	
	int pAmount, noOfYears;
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	public int getpAmount() {
		return pAmount;
	}
	public void setpAmount(int pAmount) {
		this.pAmount = pAmount;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public double getInterestRate() { return (double)rateOfInterest ;}; //(Double ) not needed
	
	public double calculateAmount() {
		pAmount=(int)(pAmount+(rateOfInterest*noOfYears*pAmount));
		return (pAmount);
	}
	
}



class KotMBank  extends GeneralBank
{
	
	

	public KotMBank(long accountNumber, String customerName, float rateOfInterest, int pAmount, int noOfYears) {
		super(accountNumber, customerName);
		this.rateOfInterest = (rateOfInterest)/100f;
		this.pAmount = pAmount;
		this.noOfYears = noOfYears;
	}

	private float rateOfInterest;
	
	int pAmount, noOfYears;
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	public int getpAmount() {
		return pAmount;
	}
	public void setpAmount(int pAmount) {
		this.pAmount = pAmount;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public double getInterestRate() { return (double)rateOfInterest ;}; //(Double ) not needed
	
	public double calculateAmount() {
		 
		pAmount=(int)(pAmount+(rateOfInterest*noOfYears*pAmount));
		return pAmount;
	}
	
}


abstract class GeneralBank
{
	long accountNumber;
	String customerName;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public GeneralBank(long accountNumber, String customerName) {
	
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}
	
	abstract public double calculateAmount();
	
}









