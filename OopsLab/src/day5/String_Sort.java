/**
 * 
 */
package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class String_Sort 
{
	static ArrayList<String> list=new ArrayList();
	public String_Sort() 
	{
		
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the String to Sort :");
		
		list.add("development");
		list.add("Development");
		list.add("aa");
		list.add("AA");
		list.add("Aa");
		list.add("55");
		System.out.println("String :"+list);
		Collections.sort(list);
		System.out.println("Sorted Array :");
		System.out.println(list);
		len();
		find("AA");
		
	}
	
	public static  <Object>void find(Object i)
	{ 
		if(list.contains(i))
		{
			System.out.println("String Conatians in "+":"+i);
		}
		
	}
	public static void len()
	{
		Map <String,String> map=new LinkedHashMap();
		for(String s:list)
		{
			int l=s.length();
			map.put(s,l+"");
		}
		System.out.println(" string length :");
		System.out.println(map);
		
	}

}

