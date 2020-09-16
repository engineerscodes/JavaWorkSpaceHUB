import java.util.Scanner;
public class REVSTR 
{ static Scanner nav=new Scanner(System.in);
  static char  rev[]=new char [25];
  static int top;
  REVSTR()
  {
	  top=-1;
  }
  public static void main(String arg[])
  {
	  System.out.println("enter the orignal:::------>>>>>");
	  String str=nav.nextLine();
	  for(int i=0;i<str.length();i++)
	  {
		  push(str.charAt(i));
	  }
	  System.out.println("the reverse string:::------>>>>>");
	  for(int i=top;i>=0;--i)
	  {
		  pop();
	  }
  }
  public static void push( char c)
  {   top++;
          
	  rev[top]=c;
	  System.out.println(c);
	  
  }
  
  public static void pop()
  {
	  System.out.print(rev[top]+" ");
	  top--;
  }
  
  
  
  
  

}
