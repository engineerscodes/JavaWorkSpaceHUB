import java.util.Scanner;

public class dobllylinked 
{    static node head;

	public  dobllylinked() 
	{
		head=null;
	}
    static class node
    { 
    	int data;
		node next;
		node prev;
		
    	public node(int d)
    	{
    		data=d;
    		next=null;
    		prev=null;		
    	}
    	
    }
    public static void insertbegin(int newdata)
    {
    	node newnode=new node (newdata);
    	if(head==null)
    	{
    		head=newnode;
    		return ;
    	}
    	else
    	{
    		newnode.next=head;
    		head.prev=newnode;
    		head=newnode;
    		return ;
    	}
    	
    }
    public static void insertend(int newdata)
    {
    	node newnode=new node(newdata);
    	if (head ==null)
    	{
    		head=newnode;
    		return ;
    	}
    	else
    	{
    		 node last=head;
    		 while(last.next!=null)
    		 {
    			 last=last.next;
    		 }
    		 last.next=newnode;
    		 newnode.prev=last;
    		 return ;
    	}
    }
    public static void insertafter(node prenode,int newdata)
    {
    	
    	if(prenode==null)
    	{
    		System.out.println("NOT POSSIBLE");
    		return;
    	}
    	else
    	{  node newnode =new node(newdata);
    	   newnode.next=prenode.next;
    	   newnode.prev=prenode;
    	   prenode.next.prev=newnode;
    	   prenode.next=newnode;
    		return;
    	}
    }
    
    public static void display()
    {
    	if(head==null)
    	{
    		System.out.println("linkedlist is empty");
    		return ;
    	}
    	System.out.print(" nodes in list are ");
    	node last=head;
    	while(last!=null)
    	{	System.out.print(" "+last.data+" ");
    		last=last.next;
    	}
    	return;
    }
    
    public static void deletestart()
    {
      if(head==null ||head.next==null)
      {   System.out.println(head.data+" "+"has been deleted");
    	  head=null;
    	  return;
      }
      else
      {   System.out.println(head.data+" "+"has been deleted");
    	  head=head.next;
          head.prev=null;
          return;
      } 	  
    }
    public static void deleteend()
    {
    	if(head==null)
    	{
    		System.out.println("no element");
    		return;
    	}
    	else
    	{
    		node del=head;
    		while(del.next!=null)
    		{
    			del=del.next;
    		}
    		System.out.println(del.data+" "+"has been deleted");
    		del.prev.next=null;
    	}
    }
    public static void delpos(int delpos)
    {   node temp=head;
    	if(head==null)
    		return;
    	else if(head.next==null)
    	{
    		System.out.println(head.data+" "+"has been deleted");
    		head=null;
    		return;
    	}
    	else if(delpos==1)
    	{
    		head=head.next;
    		head.prev=null;
    		return;
    	}
    	
    	else
    	{
    	
    		for( int i=1;temp!=null&&i<delpos;i++)
    		{
    			temp=temp.next;
    		}
    		  temp.prev.next=temp.next;
    		  temp.next.prev=temp.prev;
    		return;
    	}
    	
    }
    public static void main(String[] args)
    {
    	dobllylinked  list = new dobllylinked ();
    Scanner scan = new Scanner(System.in);
    char ch;
    do
    {
    System.out.println("\nLinked list Operations");
    System.out.println("1. insert at begining");
    System.out.println("2. insert at end");
    System.out.println("3. insert at specified location");
    System.out.println("4. display");
    System.out.println("5.delention from start");
    System.out.println("6.delention from end");
    System.out.println("7.delention AT position");

    int choice = scan.nextInt();
    switch (choice)
    {case 1 :
    System.out.print("Insert at begining:");
    list.insertbegin(scan.nextInt());
    break;
    case 2:
    System.out.print("Insert at end:");
     list.insertend(scan.nextInt());
    break;
    case 3:
    System.out.print("Insert the location after which u want to insert:");
    int loc=scan.nextInt();
    node temp;
    temp=head;
    System.out.print("Insert the data:");
    if(loc==1)
    {list.insertafter(temp, scan.nextInt());}
    else{
    for(int i=1;i<loc;i++) // to iterate
    {temp=temp.next;}
    list.insertafter(temp, scan.nextInt());}
    break;
    case 4:
    // Print the LinkedList
    System.out.println("\nCreated Linked list is: "); 
     list.display();
     break;
    case 5:  System.out.println("delention from start: "); 
    	list.deletestart();
    	break;
    case 6:  System.out.println("delention from end: "); 
    	list.deleteend();
    	break;
    	
    case 7:  System.out.println("delention at position:mention the position to delete  "); 
	list.delpos(scan.nextInt());
	break;
    }
    
    System.out.println("\nDo you want to continue (Type y or n) \n");
     ch = scan.next().charAt(0);
    }while(ch == 'Y'|| ch == 'y');
    }
    }
