/**
 * 
 */
import java.util.*;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Write  {

	public static void main(String[] args) 
	{
		Employee e1=new Employee("Naveen","CSENS",7185);
		Employee e2=new Employee("Bala","CSENS",7195);
		Employee e3=new Employee("Praveen","CSECD",7168);
		
		ArrayList n1=new ArrayList();
		n1.add(e1);
		n1.add(e2);
		n1.add(e3);
		System.out.println("ArrayList :"+n1);
	 /*  try {
		FileOutputStream f=new FileOutputStream("Output.txt");
		try {
			ObjectOutputStream obj=new ObjectOutputStream(f);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}*/
		//instead 
		try {
			FileOutputStream f=new FileOutputStream("Output.ser");	
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(n1);
			obj.flush();
			obj.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

