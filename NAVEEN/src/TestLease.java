import java.util.*; 
public class TestLease 
{  public TestLease(String name, long number, float rent, int lease_mouths) {
		
		this.name = name;
		this.number = number;
		this.rent = rent;
		this.lease_mouths = lease_mouths;
	}

public String name;
   long number;
   float rent;
   int lease_mouths;
   boolean pet=false;
   TestLease ()
   {
	   name="XXX";
	   number=0;
	   rent=1000;
	   lease_mouths=12;
   }
   
   public void addPet()
   {   if(pet)
   { rent=rent+(10*lease_mouths);}
	   explainPetPolicy();
   }

public TestLease(String name, long number, float rent, int lease_mouths, boolean pet) {
	super();
	this.name = name;
	this.number = number;
	this.rent = rent;
	this.lease_mouths = lease_mouths;
	this.pet = pet;
	addPet();
}

public boolean isPet() {
	return pet;
}

public void setPet(boolean pet) {
	this.pet = pet;
}

private static void explainPetPolicy() {
	
	System.out.println("Pets are charged 10 dollar per month");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getNumber() {
	return number;
}

public void setNumber(long number) {
	this.number = number;
}

public float getRent() {
	return rent;
}

public void setRent(float rent) {
	this.rent = rent;
}

public int getLease_mouths() {
	return lease_mouths;
}

public void setLease_mouths(int lease_mouths) {
	this.lease_mouths = lease_mouths;
}

public String toString()
{  System.out.println("1)name of apt :"+name+"\n2)apt number :"+number+"\n3)Rent :"+rent+"\n4)lease Months :"+lease_mouths +"\n5)Pet is there  :"+pet);
	return "";
	}
public static void main(String[] args) 
{ 
	 TestLease t=new TestLease("DARKHOUSE", 005, 3000,24, true);
	 t.toString();
} 
}