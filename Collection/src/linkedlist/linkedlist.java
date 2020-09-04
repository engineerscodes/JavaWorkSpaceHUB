/**
 * 
 */
package linkedlist;
import java.util.*;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class linkedlist  extends abstract_linkedlist
{
	public linkedlist() 
	{
	   super();	
	}
    public  void add()
    {
    	for(int i=1;i<=10;i++)
    		 d.add(i);
    	for(int i=1;i<=10;i++)
    		 df.add((double)i);
    	for(int i=1;i<=10;i++)
   		 f.add((float)i);
    	String st="HELLO WORLD ITS THANOS AND IRONMAN";
    	String s[]=st.split(" ");
    	for(String i:s)
    		str.add(i);
    	char ch[]=new char[s.length];
    	for(int i=0;i<s.length;i++)
    	{
    		char temp=st.charAt(i);
    		c.add(temp);
    	}
    	obj.addAll(d);
    	obj.addAll(df);
    	obj.addAll(f);
    	obj.addAll(str);
    	obj.addAll(c);	
    }
    public  void display()
    {
    	System.out.println("Intger type Linked list \n"+d);
    	System.out.println("Double type Linked list \n"+df);
    	System.out.println("Float type Linked list \n"+f);
    	System.out.println("String type Linked list \n"+str);
    	System.out.println("Character type Linked list \n"+c);
    	System.out.println("Object type Linked list \n"+obj);
    	
    }
    public  void display2()
    {
    	System.out.println("Intger type Linked list \n"+d);
    	System.out.println("Double type Linked list \n"+df);
    	System.out.println("Float type Linked list \n"+f);
    	System.out.println("String type Linked list \n"+str);
    	System.out.println("Character type Linked list \n"+c);
    	System.out.println("Object type Linked list \n"+obj);
    	
    }
   
	public static void main(String[] args) 
	{
		abstract_linkedlist ad=new linkedlist();//abstract class reference objects
		//abstract_linkedlist a=new abstract_linkedlist(); abstract class cannot have objects
		linkedlist ln=new linkedlist();
		ad.add();
		ad.display();
		ln.add();   //adding element using subclass obj
		ln.display(); //displaying using subclass obj
		ln.display2();
	}

}
