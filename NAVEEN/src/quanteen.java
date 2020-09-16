import java.util.*;
public class quanteen 
{
    static Scanner nav=new Scanner(System.in);
    static int top,size;
    static int arr[];
	public quanteen(int n) 
	{
		top=-1;
		size=n;
		arr=new int[size];
	}
    public static void push(int d)
    {   if(top==size-1)
    {
    	System.out.println("queue overflow");
    	return;
    }
    	top+=1;
    	arr[top]=d;
    	System.out.println("THE ELEMENTS IS POPED"+arr[top]);
    }
    public static void main(String arg[])
    {
    	int m,ch;
    	System.out.println("enter the number");
    	m=nav.nextInt();
    	quanteen r=new quanteen( m);
    	do
    	{ System.out.println("1)) instert ");
    	  ch=nav.nextInt();
    	  switch(ch)
    	  {
    	  case 1: r.push(nav.nextInt());
    	  }
    	}while(ch!=4);
    	return ;
    }
}
