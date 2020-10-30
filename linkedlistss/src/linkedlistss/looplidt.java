package linkedlistss;
import java.util.*;

public class looplidt
{  static Scanner nav=new Scanner (System.in);
   static int qu[],top;
   static node head;

	public looplidt() 
	{ qu=new int[10];
     
     head=null;
	}
public static class node
{
	node next;
	int data;
	public node(int  data)
	{
		this.data=data;
		next=null;
	}
}
public static void add(int new_data)
{
	 node new_node= new node(new_data);
	 if(head==null)
	 {
		 head=new_node;
		 return;
	 }
	 
}
public static void countloop()
{
	int cnt=0;
	node last=head;
	for(int i=0;i<4;i++)
	{
	   qu[i]=last.data; 	
	   last=last.next;
	}
}
public static void main(String naveen[])
{
	System.out.println("Looped linkedlist ");
	add(1);
	node last=head;
	last.next=new node(2);
	last.next.next=new node(3);
	last.next.next.next=new node(4);
	last.next.next.next.next=last;
}
}
