import java.io.*;
import java.util.*;
// Java program to implement
// a Singly Linked List
public class LinkedList2 {
static Node head; // head of list
static class Node {
int data;
Node next;
// Constructor
Node(int d)
{
data = d;
next = null;
}
}
/* Inserts a new Node at front of the list. */
 public void push(int new_data)
 { 

 Node new_node = new Node(new_data);


 new_node.next = head;


 head = new_node;
 }
/* Appends a new node at the end */
 public void append(int new_data)
 {

 Node new_node = new Node(new_data);

 /* If the Linked List is empty, then make the new node as head */
 if (head == null)
 {
 head = new_node;
 return;
 }

 /* This new node is going to be the last node, so
 make next of it as null */
 new_node.next = null; 

 /* Else traverse till the last node */
 Node last = head;
 while (last.next != null)
 last = last.next;

 /* Change the next of last node */
 last.next = new_node;
 return;
 }
/* Inserts a new node after the given prev_node. */
 public void insertAfter(Node prev_node, int new_data)
 {

 if (prev_node == null)
 {
 System.out.println("There are no elements in the list: This operation is invalid for the time being");
 return;
 }

 
 Node new_node = new Node(new_data);


 new_node.next = prev_node.next;


 prev_node.next = new_node;
 return;
 }
/* This function prints contents of linked list starting from the given node */
 public void printList()
 {
 Node tnode = head;
if(tnode==null)
{System.out.print("empty list");
}
 while (tnode!= null)
 {
 System.out.print(tnode.data+" ");
 tnode = tnode.next;
 }
 } 
 public void pop()
 {
	 if(head==null)
	 {
		 System.out.println(":underlow:");
	 }
	 else
	 { System.out.println("poping element:"+head.data+"from linkedlist");
	    head=head.next;
	 }
	      
 }
public static void main(String[] args)
{
LinkedList2 list = new LinkedList2();
list.head=null;
Scanner scan = new Scanner(System.in);
char ch;
do
{
System.out.println("\nLinked list Operations");
System.out.println("1. insert at begining");
System.out.println("2. insert at end");
System.out.println("3. insert at specified location");
System.out.println("4. display");
int choice = scan.nextInt();
switch (choice)
{case 1 :
System.out.print("Insert at begining:");
list.push(scan.nextInt());
break;
case 2:
System.out.print("Insert at end:");
 list.append(scan.nextInt());
break;
case 3:
System.out.print("Insert the location after which u want to insert:");
int loc=scan.nextInt();
Node temp;
temp=head;
System.out.print("Insert the data:");
if(loc==1)
{list.insertAfter(temp, scan.nextInt());}
else{
for(int i=1;i<loc;i++) // to iterate
{temp=temp.next;}
list.insertAfter(temp, scan.nextInt());}
break;
case 4:
// Print the LinkedList
System.out.println("\nCreated Linked list is: "); 
 list.printList();
}
System.out.println("\nDo you want to continue (Type y or n) \n");
 ch = scan.next().charAt(0);
}while(ch == 'Y'|| ch == 'y');
}
}
