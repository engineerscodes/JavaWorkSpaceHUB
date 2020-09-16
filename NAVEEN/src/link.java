import java.util.Scanner;

public class link 
{     
	static node head;
	link()
	{
		head=null;
	}
	public static class node
	{
		int data;
		node next;
		public node(int m)
	    {
	       data=m;
	       next=null;
	    }
		
	}
    public static void insertbegin(int newdata)
    {
    	node newnode = new node(newdata);
    	newnode.next=head;
    	head=newnode;
    	
    	}
	
     
      public static void insertpos(node prevnode,int newdata)
      {
    	  if(prevnode==null)
    	  {
    		  System.out.println("not possible");
    	  }
    	  node newnode=new node( newdata);
    	  newnode.next=prevnode.next;
    	  prevnode.next=newnode;
      }
      public void insertend(int newdata)
      {

      node newnode = new node(newdata);

      if (head == null)
      {
      head = newnode;
      return;
      }


      newnode.next = null; 

      node last = head;
      while (last.next != null)
      last = last.next;

      last.next = newnode;
      return;
      }
      public static void display()
      {    node tnode=head;
    	  if(tnode==null)
    	  {System.out.println("empty");}
    	  else
    	  {  while((tnode.next)!=null)
    	  {  System.out.print(tnode.data+" ");
    		  tnode=tnode.next;
    	  }
    	  System.out.print(tnode.data+" ");
    	  }
      }
      public static void pop()
      {
    	  if(head==null)
    	  {
    		  System.out.println("empty");
    	  }
    	  else
    	  {
    		  head=head.next;
    	  }
      }
      public static void  search( int x)

      {

          node current = head;    

          while (current != null)

          {

              if (current.data == x)
                  System.out.println("dfound ");
              current = current.next;
          }

          System.out.println("NOT  found ");  

      }
      
      public static void main(String[] args)
      {
      link list = new link();
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
      case 5:
    	  list.pop();
    	  break;
      case 6:
    	  System.out.println("enter the ement to search");
    	 list.search(scan.nextInt());
    	 break;
      }
      
      System.out.println("\nDo you want to continue (Type y or n) \n");
       ch = scan.next().charAt(0);
      }while(ch == 'Y'|| ch == 'y');
      }
      }

