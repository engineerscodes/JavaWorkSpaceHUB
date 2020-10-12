import java.util.Scanner;
public class Main 
{   
    static int max,top;
	static Scanner nav=new Scanner(System.in);
	static int 	sta[]=new int[max];
	Main()
	{
		top=-1;
	}
    public static void push()
    {
    	if(top>max-1)
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
    		
    		String myStr1 = "Hello";
    		String myStr2 = "Hello";
    		String myStr3 = "Another Hello";
    		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
    		System.out.println(myStr1.equals(myStr3));
    		 System.out.println("Stack size"); 
    		    max = nav.nextInt();
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
    
    
    
    
    
    
    
    
