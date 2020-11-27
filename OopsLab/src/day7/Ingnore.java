/**
 * 
 */
package day7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Ingnore 
{
   int sum;
   int a,b;
    int array[]=new int[10];
	public Ingnore() 
	{  sum=0;
	   a=0;
	   b=0;
		
	}
public void sum(int a) throws ArithmeticException
{
	 sum=a/b;
	 System.out.println(sum);
}

public void array() throws ArrayIndexOutOfBoundsException
{
	for(int i=0;i<=array.length;i++)
	{
		array[i]=i;
	}
}

public void serializeObject()
{    String a[]= {"naveen","Bala","Praveen","Hi","Hel","FVV"};
	try {
		FileOutputStream f=new FileOutputStream("Output.ser");	
		ObjectOutputStream obj=new ObjectOutputStream(f);
		//obj.write(sum);
		obj.writeObject(a);
		//obj.writeUTF(Arrays.toString(array));
		obj.flush();
		obj.close();
	}
	catch(Exception e) {
		System.out.println(e.getClass().getName());
	}
}
	public static void main(String[] args) 
	{
		Ingnore v=new Ingnore();
		try {
		v.sum(4);}
		catch(ArithmeticException e)
		{
			System.out.println("Sum not possible (a+b)");
		}
        
		try {
			v.array();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bounds");
		}
		
		v.serializeObject();
		v.read();
	}
	
	private void read() 
	{  ObjectInputStream obj;
	    int n1;
	   String s[];
		try {
			obj=new ObjectInputStream(new FileInputStream("output.ser"));
			 n1=obj.read();
			 System.out.println(" serilzation Sum :"+n1);
			 s=(String[]) obj.readObject();
			 System.out.println(" serilzation Arrays :"+Arrays.toString(s));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

