package linkedlistss;
import java.util.*;
public class linkedswap
{ static Scanner nav=new Scanner (System.in);
  static node head,prevX,prevY,currX,currY;
	public linkedswap()
	{
		head=null;
	}
	
	public static class node
	{
	  node next;
	  int data;
	  node(int data)
	  {
		  this.data=data;
		  next=null;
	  }
	}
	
	public static void add(int new_data)
	{
		node new_node=new node (new_data);
		new_node.next=head;
		head=new_node;
	}
   public static void getx(int x)
   {
	   prevX=null;
	   currX=head;
	   while(currX!=null&& currX.data!=x)
	   {
		   prevX=currX;
		   currX=currX.next;
	   }
   }
   public static void gety(int y)
   {
	 prevY=null;currY=head;
	 while(currY!=null&&currY.data!=y)
	 {
		 prevY=currY;
		 currY=currY.next;
	 }
	 
   }
   public static void swap()
   {
	   if(prevX!=null)
		   prevX.next=currY;
	   else
		   head=currY;
	   
	   if(prevY!=null)
	   prevY.next=currX;
	   else
		   head=currX;
	   
	   node temp=currX.next;
	   currX.next=currY.next;
	   currY.next=temp;
   }
   public static void display()
   {
	   node last=head;
	   while(last!=null)
	   {
		   System.out.print(last.data+" , ");
		   last=last.next;
	   }
   }
   public static void main(String[] args) 
	{
		add(10);
		add(20);
		add(30);
		add(40);
		add(50);
		add(60);
		System.out.println(" list ---");
		display();
		System.out.println("enter x and y");
		getx(nav.nextInt());
		gety(nav.nextInt());
		swap();
		System.out.println(" list --->>>>");
		display();

	}

}
