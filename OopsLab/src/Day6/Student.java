/**
 * 
 */
package Day6;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Student 
{
    protected String name;
    protected String reg;
    protected String Age;
    protected float marks;
    public String project;
    public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	private String add;
    protected String number;
    
   public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

static ArrayList <Student>n=n=new ArrayList();
	public Student() 
	{
		
	}

	Student(String name, String reg, String age, float marks, String add, String number) 
	{
		this.name = name;
		this.reg = reg;
		Age = age;
		this.marks = marks%500;
		this.add = add;
		this.number = number;
	}
	
	public void remark(){
		System.out.println("Nothing");
	}

	void getdata()
	{   
		Student st=new Student("NAVEEN","19BCN7185","19",450,"RAM NAGAR GOA","6383128594");
		Student st1=new Student("PRAVEEN","19BCD7168","19",490,"TAMIL NADU","6383128515"); 
		n.add(st);
		n.add(st1);
	}
	public static void main(String[] args)
	{
		Student s=new Student();
	}

}

class Employee 
{
	protected String name;
	protected String reg;
	protected String age;
	 protected float Grade;
	private String add;
	private String number;
	Employee(String name, String reg, String age, float grade, String add, String number) {
		super();
		this.name = name;
		this.reg = reg;
		this.age = age;
		Grade = grade;
		this.add = add;
		this.number = number;
	}
	
	public static void main(String ...strings)
	{
		Student student =new Student();
		student.getdata();
		  ArrayList <Student> n1=student.n;
		  Student s1=n1.get(0);
		  System.out.println(" student name : "+s1.name+" student number :"+s1.getAdd());
	}
	
}


