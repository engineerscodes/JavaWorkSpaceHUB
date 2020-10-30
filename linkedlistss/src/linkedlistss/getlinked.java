package linkedlistss;
import java.util.*;
public class getlinked 
{ static Scanner nav=new Scanner(System.in);
  static node head;
	public getlinked() 
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
 {    node new_node=new node( new_data);
	 if(head==null)
	 {
		head=new_node;
		return;
	 }
	 new_node.next=head;
	 head=new_node;
 }
 public static int  getnode(int pos)
 {   int cnt=1;
	 if(head==null)
	 {
		 System.out.println("The list is empty");
		 return -1;
	 }
	 node temp=head;
	 while(temp!=null)
	 {
		 temp=temp.next;
		 cnt++;
	 }
	 pos=cnt-pos;
	 node last=head;
	 if(pos<=-1)
	 {
		 System.out.println("the size of list is smaller then the position");
		 return -1;
	 }
	 for(int i=1;i<pos;i++)
	 {   if(head.next==null)
		     return -1;
		 last=last.next;
	 }
	 return last.data;
 }
 public static void main(String agrs[])
 {
	 System.out.println("linked list ");
	 add(10);
	 add(50);
	 add(80);
	 System.out.println("NODE .DATA "+getnode(5));
 }
}
