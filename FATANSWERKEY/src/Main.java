/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Main {

	public static void main(String[] args) 
	{  
		 bank customer1=new bank(1000);
		 Customer  c1=new Customer(customer1);
		 Customer   c2=new Customer(customer1);
		 Thread t1=new Thread(c1);
		 Thread t2=new Thread(c2);
		 t1.start();
		 t2.start();
	}

}


class Customer implements Runnable{
    bank b;
    Scanner nav=new Scanner (System.in);
    public Customer(bank b)
    {
    	this.b=b;
    }
	
	public void run() {
		 System.out.println("Enter the Amount to Withdraw :");
		 b.withdraw(nav.nextInt());
	}
	
}

class bank
{   int balances;
    Scanner nav=new Scanner (System.in);
	bank(int amount)
	{
	   balances=amount;	
	}
	
	public synchronized void withdraw(int amount)
	{    if(amount>balances) {
		System.out.println("Money not Sufficent !! Deposit Money to Withdraw Money!!");
		 deposit(amount);
		
		
		
	}
	     balances=balances-amount;
		
		System.out.println("Amount Balance"+Thread.currentThread().getName()+" :"+balances);
	}
	
	public  synchronized void deposit(int needmoney)
	{  System.out.println("Enter the Amount to Your Account :");
		int newamount=nav.nextInt();
		 balances=balances+newamount;	
		 
		 if(balances<needmoney) {deposit(needmoney);System.out.println("Add more moeny!!");}
		// notifyAll();
	}
}

