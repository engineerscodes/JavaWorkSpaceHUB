import java.util.Scanner;

public class testdobbly 
{   static node head; 

	public testdobbly() 
	{
        head=null;

	}
	static  class node
	{
		node next,prev;
		int data;
		public  node(int d)
		{   data=d;
		   next=null;
		   prev=null;
		}
	}
    public  static  void insertbegin(int newdata)
    {
    	node newnode =new node(newdata);
    	if(head==null)
    	{
    		head=newnode;
    		return;
    	}
    	else
    	{
    		newnode.next=head;
    		head.prev=newnode;
    		head=newnode;
    		return;
    	}
    	
    }
    public static void insertend(int newdata)
    {
    	node newnode=new node(newdata);
    	if(head==null)
    	{
    		head=newnode;
    		return;
    	}
    	else
    	{
    		node last=head;
    		while(last.next !=null)
    		{
    			last=last.next;
    		}
    		last.next=newnode;
    		newnode.prev=last;
    		return;
    	}
    }
    
    public static void insertpos(node prevnode,int newdata)
    {
    	
        node newnode=new node(newdata);
    	if(prevnode==null)
    	{
    		System.out.println("NOT IMPOSSIBLE::::");
    		return;
    	}
    	else
    	{
    	   newnode.next=prevnode.next;
    	   newnode.prev=prevnode;
    	   prevnode.next.prev=newnode;
    	   prevnode.next=newnode;
    	   return;
    	}
    }
    
    public static void display()
    {
    	if(head==null)
    		System.out.println("LINKLIST IS EMPTY");
    	else
    	{
    		node dis=head;
    		System.out.println("THE list is null");
    		while(dis!=null)
    		{   System.out.println(" "+dis.data+" ");
    			dis=dis.next;
               
    		}
    	}
    }
    
    public static void deletstart()
    {
    	if(head==null)
    		System.out.println("NOT POSSIBLE");
    	else
    	{
    		System.out.println(head.data+" "+"element is delete ");
    		head=head.next;
    		head.prev=null;
    	}
    }
    
    public static void deleteend()
    {
    	if(head==null)
    		System.out.println("NOT POSSIBLE");
    	else
    	{
    		node last=head;
    		while(last.next!=null)
    			last=last.next;
    		
    		System.out.println(" "+last.data+"the elemnts is deletes");
    		last.prev.next=null;
    		
    	}
    }
    
    public static void deletepos(int pos)
    {
    	node temp=head;
    	if(head==null)
    		return;
    	else if(head.next==null)
    		head=null;
    	else if(pos==1)
    		{head=head.next;
    		 head.prev=null;
    		}
    	else 
    	{
    		for(int i=1;temp!=null&&i<pos;i++)
    		{
    			temp=temp.next;
    		}
    		temp.prev.next=temp.next;
    		temp.next.prev=temp.prev;
    	}
    	
    }
    	 public static void main(String[] args)
    	    {
    	    	testdobbly  list = new testdobbly ();
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
    	    {list.insertpos(temp, scan.nextInt());}
    	    else{
    	    for(int i=1;i<loc;i++) // to iterate
    	    {temp=temp.next;}
    	    list.insertpos(temp, scan.nextInt());}
    	    break;
    	    case 4:
    	    // Print the LinkedList
    	    System.out.println("\nCreated Linked list is: "); 
    	     list.display();
    	     break;
    	    case 5:  System.out.println("delention from start: "); 
    	    	list.deletstart();
    	    	break;
    	    case 6:  System.out.println("delention from end: "); 
    	    	list.deleteend();
    	    	break;
    	    	
    	    case 7:  System.out.println("delention at position:mention the position to delete  "); 
    		list.deletepos(scan.nextInt());
    		break;
    	    }
    	    
    	    System.out.println("\nDo you want to continue (Type y or n) \n");
    	     ch = scan.next().charAt(0);
    	    }while(ch == 'Y'|| ch == 'y');
    	    }
    	    }

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 
