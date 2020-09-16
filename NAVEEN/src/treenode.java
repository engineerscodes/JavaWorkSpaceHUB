import java.util.Scanner;

public class treenode 
{
	
	private int data;
	private treenode left,right;
	public treenode(int data)
	{
		this.data=data;
		left=right=null;
	}
	
	public int getdata()
	{
		return data;
	}
    public void setdata(int data)
    {
    	this.data=data;
    }
    public treenode getleft()
    {
    	return left;
    }
    public void setleft(treenode left)
    {
    	this.left=left;
    }
    public treenode getright()
    {
    	return right;
    }
    public void setright(treenode right)
    {
    	this.right=right;
    }
    
    public void insert(int value)
    {
    	if(value==data)
    	{	System.out.println("duplicate are not allowed in BTS");
    	    return ;
    	}
    	else if(value<data)
    	{
    		if(left==null)
    			left=new treenode(value);
    		else
    		{
    			left.insert(value);
    		}
    	}
    	else
    	{
    		if (right==null)
    			right=new treenode(value);
    		else
    		{
    			right.insert(value);
    		}
    	}
    }
    public void inorder()
    {
    	if(left!=null)
    	{
    		left.inorder();
    	}
    	System.out.print("data ="+data+",");
    	if(right!=null)
    	{
    		right.inorder();
    	}
    }
    public void postorder()
    {
    	if(left!=null)
    	{
    		left.postorder();
    	}
    	if(right!=null)
    	{
    		right.postorder();
    	}
    	System.out.print("data ="+data+",");
    }
    public void preorder()
    {   System.out.print("data ="+data+",");
    	if(left!=null)
    	{
    		left.preorder();
    	}
    	
    	if(right!=null)
    	{
    		right.preorder();
    	}
    }
    
    public boolean get(int value)
    {
    	if(value==data)
    	{
    		return true;
    		
    	}
    	else if(value<data)
    	{
    		if(left!=null)
    		{
    			return left.get(value);
    			  
    		}
    	}
    	else
    	{
    		if(right!=null)
    		{
    			return right.get(value);
    			
    		}
    	}
    	return false;
    }
}
    class tree1
    {
    	private treenode root;
    	
    	public tree1()
    	{
    		root=null;
    	}
    	
    	public void insert(int value)
    	{
    		if(root==null)
    		{
    			root=new treenode(value);
    		}
    		else
    		{
    			root.insert(value);
    		}
    	}
    	public void inorder()
    	{
    		if(root!=null)
    		{
    			root.inorder();
    			
    		}
    			
    	}
    	public void postorder()
    	{
    		if(root!=null)
    		{
    			root.postorder();
    			
    		}
    	}
    	public void preorder()
    	{
    		if(root!=null)
    		{
    			root.preorder();
    			
    		}
    	}
    	public boolean get(int value)
    	{
    		
    		
    		 return (root.get(value));
    		
    		
    	}
    }
    

    
  class nav
    {
    	public static void main(String arg[])
    	{
            
            Scanner scan = new Scanner(System.in);
     
            tree1 bt = new tree1(); 
            
            System.out.println("Binary Tree Test\n");          
            char ch;        
            do    
            {
                System.out.println("\nBinary Tree Operations\n");
                System.out.println("1. insert ");
                System.out.println("2. deletion");
               
     
                int choice = scan.nextInt();            
                switch (choice)
                {
                case 1 : 
                    System.out.println("Enter integer element to insert");
                    bt.insert(scan.nextInt());                     
                    break;                          
                                                       
             
                }
            
                System.out.print("\nPost order : ");
                bt.postorder();
                System.out.print("\nPre order : ");
                bt.preorder();
                System.out.print("\nIn order : ");
                bt.inorder();
     
                System.out.println("\n\nDo you want to continue (Type y or n) \n");
                ch = scan.next().charAt(0);                        
            } while (ch == 'Y'|| ch == 'y');               
        }
    	}
    





