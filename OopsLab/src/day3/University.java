/**
 * 
 */
package day3;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class University extends staff
{

	public University() 
	{
		super();
	}
    public University(String Professor_Grade,String technical_staffs_Grade,String name,String type,String Group,String period)
    {
    	super(Professor_Grade,technical_staffs_Grade,name,type,Group,period);
    }
	public static void main(String[] args) 
	{
		University un=new University();
		//System.out.println("======"+un.Professor_Grade+" "+un.technical_staffs_Grade+" "+un.type+" "+un.period+" "+un.name);
		University un2=new University();
		System.out.println("Professor_Grade :"+un2.Professor_Grade+"\ntechnical_staffs_Grade :"+un2.technical_staffs_Grade+"\nStudent Name :"+un.name+"\nStudent Gruop :"+un2.Group);
		System.out.println("Student Couse :"+un2.type+"\nStudent couse Period :"+un2.period);
				
		System.out.println("<======================Custome input===============================> Univerity Class");
		University un3=new University("Associate","A","NAVEEN","B.TECH","CSE","8");
		System.out.println("Professor_Grade :"+un3.Professor_Grade+"\ntechnical_staffs_Grade :"+un3.technical_staffs_Grade+"\nStudent Name :"+un3.name+"\nStudent Gruop :"+un3.Group);
		System.out.println("Student Couse :"+un3.type+"\nStudent couse Period :"+un3.period);
		
		System.out.println("<========= STAFF Class and University Constructor====================================>");
		staff st=new University("Associate","B","Rhea","B.TECH","EEE","8");
		System.out.println("Professor_Grade :"+st.getProfessor_Grade()+"\ntechnical_staffs_Grade :"+st.getTechnical_staffs_Grade()+"\nStudent Name :"+st.getName()+"\nStudent Gruop :"+st.getGroup());
		System.out.println("Student Couse :"+st.getType()+"\nStudent couse Period :"+st.getPeriod());
		st.setGroup("CSE");
		System.out.println("Modified Gruop of "+st.name +" :"+st.getGroup());
	}

}

class staff extends program
{
	String Professor_Grade;
	public String getProfessor_Grade() 
	{ System.out.println("Get the Professor_Grade");
		return Professor_Grade;
	}
	public void setProfessor_Grade(String professor_Grade) 
	{   System.out.println("Set the Professor_Grade");
		Professor_Grade = professor_Grade;
	}
	public String getTechnical_staffs_Grade() 
	{   System.out.println("Get the Technical_staffs_Grade");
		return technical_staffs_Grade;
	}
	public void setTechnical_staffs_Grade(String technical_staffs_Grade) 
	{    System.out.println("Set the Technical_staffs_Grade");
		this.technical_staffs_Grade = technical_staffs_Grade;
	}
	String technical_staffs_Grade; 
	staff()
	{
		Professor_Grade="Assistant";
		technical_staffs_Grade="C";
	}

	staff(String Professor_Grade,String technical_staffs_Grade)
	{   super();
		this.Professor_Grade = Professor_Grade;
		this.technical_staffs_Grade=technical_staffs_Grade;
		
	}
	
	staff(String Professor_Grade,String technical_staffs_Grade,String name,String type,String Group,String period)
	{   
		super(Group,type,period,name);
		this.Professor_Grade = Professor_Grade;
		this.technical_staffs_Grade=technical_staffs_Grade;
	
	}
}

class program
{   String name;
    String type;
    String Group;
    String period;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	program()
	{
		type="M.TECH";
		Group="ECE";
		period="4";
		name=" ";
	}
	program(String Group,String type,String period,String name)
	{
		this.period = period;
		this.type = type;
		this.Group = Group;
		this.name = name;
	}
	
}
