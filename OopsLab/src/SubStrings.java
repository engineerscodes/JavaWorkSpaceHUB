/**
 * 
 */
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class SubStrings 
{  String str;
  ArrayList <String> n=new ArrayList<>();
   static Scanner nav=new Scanner(System.in);
	public SubStrings(String str) 
	{
		this.str=str;
	}
    
	public void Substr()
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				n.add(str.substring(i, j));
			}
		}
		System.out.println("Substring of String "+str +" are :");
		System.out.println(n);
	}
	public void UpperCase()
	{  //str=str.toUpperCase();
		char st[]=str.toCharArray();
		for(int i=0;i<st.length;i++)
		{
			if((int)st[i]<=122 && (int)st[i]>=97)
			{
				st[i]=(char)((int)st[i]-32);
			}
			
		}
		System.out.println(Arrays.toString(st));
		
	}
	
	public void ToLowerCase()
	{  //str=str.toUpperCase();
		char st[]=str.toCharArray();
		for(int i=0;i<st.length;i++)
		{
			if((int)st[i]<=90 && (int)st[i]>=65)
			{
				st[i]=(char)((int)st[i]+32);
			}
			
		}
		System.out.println(Arrays.toString(st));
		
	}
	public static void main(String[] args) 
	{
     System.out.println(" Enter a String :");
     String s=nav.nextLine();
     SubStrings temp=new SubStrings(s);
     
     while(true)
     {
    	 System.out.println("1)SubString \n2)TOupperCase \n3)TOlowerCase \n4)Exit()");
    	 switch(nav.nextInt())
    	 {
    	 case 1: temp.Substr();
    	         break;
    	 case 2:temp.UpperCase();
    	 break;
    	 case 3: temp.ToLowerCase();
    	 break;
    	 case 4:System.exit(0);
    	 }
     }
	}

}

