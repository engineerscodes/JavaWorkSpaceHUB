import java.util.*;
public class cirque
{ static Scanner nav=new Scanner(System.in);
  static int front,rear,size;
  static int cirque[];
	public cirque(int n) 
	{ size=n;
	  cirque=new int[size];
	  front=rear=-1;
		
	}
	public static void enque()
	{
		if((rear+1)%size==front)
		{
			System.out.println("::OVERFLOW::");
		}
		else 
		{
			System.out.println("ENTER THE ELEMENT TO PUSH::");
			int ele=nav.nextInt();
			if(rear==-1&&front==-1)
			{ rear=front=0;
			  cirque[rear]=ele;
			}
			else
			{
				rear=(rear+1)%size;	
				cirque[rear]=ele;
			}
			System.out.println("the element"+cirque[rear]+"pushed ");
		}
	}
	public static void deque()
	{
		if(front==-1)
		{
			System.out.println("::underFLOW::");
		}
		else
		{  int del=cirque[front];
		System.out.println("the element"+del+"poped ");
			if(rear==front)
		{   
			rear=front=-1;
		}
		
			else
		{
			front=(front+1)%size;
		}
		}
	}
	
	 public static void display()
	    {  
	        if(rear==-1 && front==-1)
	        System.out.println("::underFLOW::");
	        else
	        for(int i=front;i<=rear;++i)
	        {
	            System.out.println("elements in queue+"+cirque[i]);
	         
	             
	        }
	    }
	 public static void main(String[] args)
	 {  System.out.println("ENTER THE SIZE ::");
	 	int na;
	 	int size1 =nav.nextInt();
	 	cirque n =new cirque(size1);
	 	do{
	 	System.out.println("ENTER THE CHOICES ::");
	 	 na=nav.nextInt();
	 	switch(na)
	 	{
	 	case 1: n.enque();
	 	        break;
	 	case 2: n.deque();
	 	         break;
	 	case 3: n.display();
	 	        break;
	 	case 4: System.out.println("::exit");
	 	        break;        
	 	}
	 	}while(na!=4);
	 }
}
