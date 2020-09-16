import java.util.*;
public class Stack1
{
  static int top;
  static int size,size1;
  static int stac[];
  static Scanner sin=new Scanner(System.in);
  
 public Stack1(int n)
 {  size1=n;
	 top=-1;
	 stac=new int [size1];
	 
 }
public static void push()
{
if(top>size-1)
{
System.out.println("overflow");
}
else
{
top=top+1;
int elm=sin.nextInt();
stac[top]=elm;
System.out.println(elm+"pushed into stack");
}
 }
public static void pop()
{
if(top<=-1)
{
System.out.println("underflow");
}
else
{
int del=stac[top--];
System.out.println(del+"was poped out");
}
 }
public static void display()
{
if(top>=0)
{
for(int i=top;i>=0;i--)
{
System.out.println(stac[top]);
}
}
else
{
System.out.println("stack is empty");
}
}
public static void main(String arg[])
{ int z1;
System.out.println("enter the stack size");
size=sin.nextInt();
Stack1 n=new Stack1(size);

do
{
	z1=sin.nextInt();

switch(z1)
{
case 1:push();
      break;
case 2:pop();
        break;
case 3:display();
break;
case 4:System.out.println("error");
break;
}
}while(z1!=4);

}
}