import java.io.Serializable;

/**
 * 
 */

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Employee implements Serializable{
  public String name;
  public String last;
  public int num;
	public Employee() {
		name="";
		last="";
		num=0;
	}
	public Employee(String name,String last,int num)
	{
		this.name=name;
		this.last=last;
		this.num=num;
	}

}

