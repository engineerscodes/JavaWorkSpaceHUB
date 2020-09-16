
import java.util.Scanner;
public class que
{   static Scanner nav=new Scanner(System.in);
    static int front ,rear,dell,size;
    static int que[];
    
    public que(int n)
    {   size=n;
        front =-1;
        rear=-1; 
       que=new int [n];
    }

   
    public static void push()
    {  
        if(rear==size-1)
        System.out.println("::OVERFLOW::");
       
        else  if((rear ==-1)&&(front==-1))
        {  
            front =0;
              rear=0;
             System.out.println("ENTER THE ELEMENT TO PUSH::");
             int ele=nav.nextInt();
             que[rear]=ele;
             
             System.out.println(+ele+":the element is pushed::");
        }
        else{
         int qele=nav.nextInt();
         rear=rear+1;
         que[rear]=qele;
         System.out.println(qele+":the element is pushed::");
           
        }
    }
   
    public static void  pop()
    {   // System.out.println("elements to pop::");
        // int g=nav.nextInt();
         //int y;
         //for(int i=front;i<=rear;i++)
            // if(que[i]==g)
                //  { dell=i;
                  //   push2();
                 // }
                   
         if(rear==-1 && front==-1)
         System.out.println("::underFLOW::");
         else if(rear==front)
         {
             int x=que[front];
             rear=rear-1;
             front=front-1;
             System.out.println("the element"+x+"poped ");
         }
         else
         {
             int del;
             del=que[front];
             front++;
             System.out.println("the element"+del+"poped ");
         }
    }
    public static void display()
    {  
        if(rear==-1 && front==-1)
        System.out.println("::underFLOW::");
        else
        for(int i=front;i<=rear;++i)
        {
            System.out.println("elements in queue");
             System.out.print(que[i]);
             
        }
       
       
    }
    public static void main(String[] args)
    {  System.out.println("ENTER THE SIZE ::");
    	int na;
    	int size =nav.nextInt();
    	que n =new que(size);
    	do{
    	System.out.println("ENTER THE CHOICES ::");
    	 na=nav.nextInt();
    	switch(na)
    	{
    	case 1: n.push();
    	        break;
    	case 2: n.pop();
    	         break;
    	case 3: n.display();
    	        break;
    	case 4: System.out.println("::exit");
    	        break;        
    	}
    	}while(na!=4);
    }
}
