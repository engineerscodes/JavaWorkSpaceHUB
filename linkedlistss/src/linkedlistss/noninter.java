package linkedlistss;
/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList non intersection list 
 *  list2=1-->2-->3-->4
 *  list2=0-->1-->9-->2
 *  output=3,4,0,9
 *  sr.code-LL9
 *  */
import java.util.*;

import linkedlistss.intersectionlist.node;
public class noninter                                                  //class name 
{
	 static Scanner nav=new Scanner (System.in);                     // calling Scanner and creating object nav
	 static node headx,heady,head;
	public noninter()                                              //constructor of noninter
	{
      headx=head=heady=null;                                     //initialization 

	}
	public static class node                                  //second class node
	{
		node next;
		int data;
		node(int data)                                    // constructor of class node
		{
			this.data=data;                             //initialization of instances variable of class node using this()
			next=null;                                 //initialization of next to null
		}
	}
	public static void addx(int new_data)           //insert at begin in 1st list
	{
		node new_node=new node (new_data);
		new_node.next=headx;
		headx=new_node;
	}
	public static void addy(int new_data)     //insert at begin in 2rd list
	{
		node new_node=new node (new_data);
		new_node.next=heady;
		heady=new_node;
	}
	public static void noninter()        //method to find uncommon elements in list
	{
		 node x=headx;             //temp node x,y are used for traversing and finding uncommon nodes
		 node y =heady;
		 System.out.println(" list --->>>>");
		while(x!=null)
		{  System.out.println("x="+x.data);
		    node tempy=y;          //traverse the second list and till first list is null
			while(tempy!=null)            
			{ System.out.println(" y="+tempy.data);
				if(x.data!=tempy.data)       
				{   System.out.println(" y="+tempy.data);
					tempy=new node(x.data);
					tempy.next=head;
					head=tempy;
				}
				tempy=tempy.next;
			}
			x=x.next;
		}
	}
	 public static void display()
	   {  System.out.println(" list ---");
		   node last=head;
		   while(last!=null)
		   {
			   System.out.print(last.data+" , ");
			   last=last.next;
		   }
		   
	   }
	 
	 
	 public static void main(String[] args) 
		{   intersectionlist  n=new intersectionlist();
			addx(10);
			addx(5);
			addx(30);
			addx(40);
			addx(50);
			addx(60);
			addx(13);
			
			addy(5);
			addy(40);
			addy(55);
			addy(60);
			addy(45);
			addy(1200);
			addy(13);
			noninter();
			display();

		}

}
