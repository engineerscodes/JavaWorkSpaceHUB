import java.util.*;
public class lab1stack 
{  static Scanner nav=new Scanner(System.in);
   static int stack[];
   static int size,top;
	public lab1stack(int n) 
	{
		size=n;
		stack=new int[size];
		top=-1;
	}
  public  static void push()
  {    
	  if(top==size-1)
	  {
		  System.out.print("STACK OVERFLOW");
		  return;
	  }
	  else
	  {  top++;
	  System.out.print("ENTER ELEMNETS VALUE");
	  int ele=nav.nextInt();
	  
	  stack[top]=ele;
	  System.out.println("the elment is pushed into stack:"+stack[top]);
	  }
  }
  
  public static void pop()
  {
	  if(top==-1)
	  {
		  System.out.println("STACK UNDER FLOW");
		  return;
	  }
	  int del=stack[top];
	  top--;
	  System.out.println("the elment is pushed into stack:"+del);
	  
  }
  public static void display()
  {
	  if(top==-1)
		  System.out.println("STACK UNDERFLOW");
	  else
	  {  System.out.println("DISPLAYING ELEMENT");
		  for(int i=top;i>=0;i--)
			  System.out.println(stack[top]);
	  }
  }
  
  public static void main(String agr[])
  {   int ch;
	  System.out.println("enter the size of stack");
	  int s=nav.nextInt();
	  lab1stack n=new lab1stack(s);
	  do
	  {  System.out.println("1>push");
	     System.out.println("2>pop");
	     System.out.println("3>Display");
	     System.out.println("4>Exit()");
	     ch=nav.nextInt();
	     switch(ch)
	     {
	      case 1:  n.push();
	               break;
	      case 2 :n.pop();
	               break;
	      case 3: n.display();
	               break;
	      case 4: System.out.println("ERROR");         
	     }
		  
	  }while(ch!=4);
  }
}
