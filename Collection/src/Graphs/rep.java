/**
 * 
 */
package Graphs;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class rep 
{
  
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();
	
	public static void main(String ...strings)
	{
		for(int i=0;i<5;i++)
		{
			graph.add(new ArrayList<Integer>()); //allocates the memeory
		}
		
		System.out.println(graph);
		graph.get(0).add(1);
		graph.get(0).add(4);
		graph.get(1).add(3);
		graph.get(1).add(4);
		graph.get(1).add(0);
		graph.get(2).add(1);
		graph.get(2).add(3);
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(4).add(3);
		graph.get(4).add(0);
		

		
		System.out.println(graph);
	}
	   

}

