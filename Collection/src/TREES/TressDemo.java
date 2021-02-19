/**
 * 
 */
package TREES;
import java.util.*;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class TressDemo
{
   static Scanner nav =new Scanner(System.in); 
	
	static class node {
		 node left,right;
		 int data;
		 
		 node (int data){this.data =data;}
	}
	public static node createTree()
	{    node root =null;
		System.out.println("Enter the Data :");
		int data=nav.nextInt();
		if(data==-1) {
			return null;
		}
	    
		root =new node(data);
		System.out.println("The data entered on Left :"+data);
		root.left =createTree();
		System.out.println("The data entered on Right :"+data);
		root.right=createTree();
	
		
		return root;
		
	}

	public static void  inOrder(node root)
	{ 
		   if(root ==null) {return ;}
		   
		inOrder(root.left);
		System.out.print(root.data +" ");
		inOrder(root.right);
	}
	
	public static void PerOrder(node root)
	{
		  if(root ==null) {return ;}
		  System.out.print(root.data +" ");
		  PerOrder(root.left);
			
		  PerOrder(root.right);
	}
	
	public static  void PostOrder(node root)
	{
		 if(root ==null) {return ;}
		  
		 PostOrder(root.left);
			
		 PostOrder(root.right);
			System.out.print(root.data +" ");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Tree");
		node root =createTree();
		System.out.println("Inorder !!!!");
		inOrder(root);
		
		System.out.println("\nPostorder !!!!");
		PostOrder(root);
		System.out.println("\nPreOrder  !!!!");
		PerOrder(root);
	}

}

