
import java.util.Scanner;
public class stac 
{   
    static int max;
	static Scanner nav=new Scanner(System.in);
	static int 	sta[];
	static int top;
	stac(int n)
	{   max=n;
		top=-1;
		sta=new int[max];
	}
    public static void push()
    {
    	if(top>=max-1)
    		System.out.println(":::::OVERFLOW OF STACK::::");
    	else 
    	{   top++;
    		int ele=nav.nextInt();
    		sta[top]=ele;
    		System.out.println(sta[top]+"is pushed into stack");
    		
    	}
    }
    	public static void pop()
    	{
    		if(top<=-1)
    			System.out.println(":::::Stack under flow:::::");
    		else
    		{
    			int del=sta[top];
    			System.out.println(del+":::::is poped out from stack:::::");
    			top--;
    		}
    	}
    	public static void display()
    	{
    		if(top>=0)
    			{
    			    for(int i=top;i>=0;i--)
    			    	System.out.println(sta[i]+"\n");
    			}
    			    else 
    			    	System.out.println("::::: stack is empty:::::");
    	}
    			
    	public static void main(String agr[])
    	{    
    		 System.out.println("Stack size"); 
    		    int ma1 = nav.nextInt();
    		    stac na=new stac(ma1);
    		    int z1;
    		 System.out.print("1)push\n2)______________>>>>>>>>pop\n3)__________>>>>>peek\n4)>>>>>>>>>EXIT");
    		    do{
    		         z1=nav.nextInt();
    		       switch(z1) 
    		      {   
    		          case 1: System.out.print("enter to push ");
    		                   push();
    		               break;
    			     case 2:  System.out.print("pop ");
    			              pop();
    			            break;
    			       case 3: System.out.print("top display ");
    			             display();
    		               break;
    		            case 4: System.out.println("exit   :"); 
    		                 break;
    		           default:System.out.print("error ");
    		      }
    		    }while(z1!=4);
    		} 

    	
    }
    
    
    
    
    
    
    
    
