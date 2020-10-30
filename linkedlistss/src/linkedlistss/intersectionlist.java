package linkedlistss;
/*  Author-M.NAVEEN
 *  engineerscodes
 *  code --single_LinkedList intersectionlist 
 *  list2=1-->2-->3-->4
 *  list2=0-->1-->9-->2
 *  output=1,2
 *  sr.code-LL8
 *  */
import java.util.*;

import linkedlistss.linkedswap.node;
public class intersectionlist                              //class name 
{  static Scanner nav=new Scanner (System.in);            // calling Scanner and creating object nav
   static node headx,heady,head;                         
	public  intersectionlist()                           //constructor of class  intersectionlist
	{
		headx=heady=null;                             //intersectionlist
		head=null;
	}
	public static class node                       //second class node
	{
		node next; 
		int data;
		node (int data)                         // constructor of class node
		{
			next=null;                        //initialization of next to null
			this.data=data;                  //initialization of instances variable of class node using this()
		}
	}
	public static void addx(int new_data) //insert at begin in 1st list
	{
		node new_node=new node (new_data);
		new_node.next=headx;
		headx=new_node;
	}
	public static void addy(int new_data) //insert at begin in 2rd list
	{
		node new_node=new node (new_data);
		new_node.next=heady;
		heady=new_node;
	}
	
	public static void instersection()  //method to find common elements in list
	{   
		 node x=headx;  //temp node x,y are used for traversing and finding common nodes 
		 node y =heady;
		 System.out.println(" list --->>>>");
		while(x!=null)
		{ 
		    node tempy=y;      //traverse the second list and till first list is null
			while(tempy!=null)        
			{ 
				if(x.data==tempy.data)   //if first--node is equal to second node 
				{  
					tempy=new node(x.data);  //creating new node 
					tempy.next=head;    //tempy.mext=head; for first element head=null and head keeps a track of intersection List;
					head=tempy;         //head= tempy
				}
				tempy=tempy.next;
			}
			x=x.next;
		}
	}
	
	 public static void display() //display mathod  
	   {  System.out.println(" list ---");
		   node last=head;
		   while(last!=null)
		   {
			   System.out.print(last.data+" , ");
			   last=last.next;
		   }
		   
	   }
	 
	 
	 public static void main(String[] args)  //main method
		{   intersectionlist  n=new intersectionlist();
		/*This program is only for sorting a linkedlist 
	     * So,I have directly given values in add fuction u can edit this my caliing add function and adding values at runtime 
	     * For futhure information plz check r singllyLinkeList program and DoubllyLinkedlist code in Git
	     * 
	     * */
			addx(10);
			addx(5);
			addx(30);
			addx(40);
			addx(50);
			addx(60);
			addx(13);
			addy(1);
			addy(3);
			addy(5);
			addy(40);
			addy(55);
			addy(60);
			addy(45);
			addy(1200);
			addy(13);
			instersection();
			display();

		}
}
