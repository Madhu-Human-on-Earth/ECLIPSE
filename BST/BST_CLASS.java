package BST;

import TREES_CODI.BinaryTreeNodes;//TAKEN FROM TREES_CODI PACKAGE.

public class BST_CLASS {
	private BinaryTreeNodes<Integer>root;
	private int size;
	
	private static boolean isPresentHelper(BinaryTreeNodes<Integer>node,int x)
	{
		if(node==null)
		{
			return false;
		}
		if(node.data==x)
		{
			return true;
			
		}
		if(node.data>x)
		{
			return isPresentHelper(node.left,x);
		}
		else {
			 return isPresentHelper(node.right,x);
		}
	}
	
	public boolean ispresent(int x)
	{
		
		return isPresentHelper(root,x);
	}
	public void insert(int x)
	{
		
	}
	public boolean deleteData(int x)
	{
		return false;
		
	}
	public int size()
	{
		return size;
		
	}
	
	private static void printHelper(BinaryTreeNodes<Integer>node)
	{
		if(node==null)
		{
			return;
		}
		System.out.println(node.data + ":");
		if(node.left!=null)
		{
		System.out.println("L"+ node.left.data + ", ");
			
		}
		if(node.right!=null)
		{
			System.out.println("R"+ node.right.data + ", ");
		}
		else {
			System.out.println();
		}
		printHelper(node.left);
		printHelper(node.right);
		
	}
	public void printTree()
	{
		printHelper(root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
