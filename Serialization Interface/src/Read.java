/**
 * 
 */
import java.util.*;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Read {

	public static void main(String[] args) 
	{   ObjectInputStream obj;
	ArrayList n1 = null;
		try {
		obj=new ObjectInputStream(new FileInputStream("output.md"));
		 n1=(ArrayList)obj.readObject();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	Employee e[]=new Employee[3];
	for(int i=0;i<3;i++)
		e[i]=(Employee)n1.get(i);
    for(int i=0;i<e.length;i++)
    {
    	System.out.println(i+1+")"+" Name :"+e[i].name+" Last :"+e[i].last+" REG :"+e[i].num);
    }
	}

}

