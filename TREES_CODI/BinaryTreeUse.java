package TREES_CODI;

import java.util.Scanner;

public class BinaryTreeUse {
	
	public static BinaryTreeNodes<Integer>takeInputBetter(boolean isroot,int parentData,boolean isLeft){
		if(isroot)
		{
			System.out.println("Enter root data");
		}
		else {
			if(isLeft)
			{
				System.out.println("Enter left child of"+ parentData);
			}
			else {
				System.out.println("Enter right child of"+ parentData);
			}
		}
		
	//	System.out.println("Enter root data");
		Scanner sc= new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryTreeNodes<Integer>root=new BinaryTreeNodes<Integer>(rootData);
		BinaryTreeNodes<Integer>leftChild=takeInputBetter(false,rootData,true);
		BinaryTreeNodes<Integer>rightChild=takeInputBetter(false,rootData,false);
		root.left=leftChild;
	    root.right=rightChild;
	    return root;
		
	}
	public static void mirrorBinaryTree(BinaryTreeNodes<Integer> root){
		//Your code goes hereroot.
        if(root==null)
        {
            return;
        }
         BinaryTreeNodes<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
    
System.out.println(root.left);
mirrorBinaryTree(root.left);
System.out.println(root.right);
     mirrorBinaryTree(root.right);
      //  return root;
        
        
	}
	
	
//	public static BinaryTreeNodes<Integer>takeInput(){
//		System.out.println("Enter root data");
//		Scanner sc= new Scanner(System.in);
//		int rootData=sc.nextInt();
//		if(rootData==-1)
//		{
//			return null;
//		}
//		BinaryTreeNodes<Integer>root=new BinaryTreeNodes<Integer>(rootData);
//		BinaryTreeNodes<Integer>leftChild=takeInput();
//		BinaryTreeNodes<Integer>rightChild=takeInput();
//		root.left=leftChild;
//	    root.right=rightChild;
//	    return root;
//		
//	}
public static void printTreeDetail(BinaryTreeNodes<Integer>root) {
		
		if(root==null)
		{
		return;
		}
		
		  System.out.print(root.data+":");
		  
		  
		  if(root.left!=null)
		    System.out.print("L"+ root.left.data+", ");
		  if(root.right!=null)
		    System.out.print("R"+root.right.data);
		  System.out.println();
		  printTreeDetail(root.left);
		  printTreeDetail(root.right);
}
	
	
//	public static void printTree(BinaryTreeNodes<Integer>root) {
//		
//		if(root==null)
//		{
//		return;
//		}
//		
//		  System.out.println(root.data); 
//		  printTree(root.left);
//		  printTree(root.right);
		//---2nd pro--  
		  
//		if(root==null)
//		{
//		return;
//		}
//		
//		  System.out.println(root.data);
//		  if(root.left!=null)
//		    printTree(root.left);
//		  if(root.right!=null)
//		    printTree(root.right);
	//}
	
public static int numNodes(BinaryTreeNodes<Integer> root)
{
	if(root==null)//O(N)
		return 0;
	
	int leftNodeCount=numNodes(root.left);
	int rightNodeCount=numNodes(root.right);
	return 1+leftNodeCount+rightNodeCount;//if we dont include 1..it will return 0 as ans
	

	
}
public static BinaryTreeNodes<Integer>removeLeaves(BinaryTreeNodes<Integer>root)
{
	if(root==null)
	{
		return  null;
	}
	if(root.left==null && root.right==null)
	{
		return null;
	}
	root.left=removeLeaves(root.left);
	root.right=removeLeaves(root.right);
	return root;
	
}

public static int largest(BinaryTreeNodes<Integer>root)
{
	if(root==null)
	{
		return -1;
	}
	int larleft=largest(root.left);
	int larright=largest(root.right);
	return Math.max(root.data,Math.max(larleft,larright));
}
	public static void numleaves(BinaryTreeNodes<Integer>root)
	{
//		if(root==null)//O(N)
//		{
//			return 0;
//		}
//		if(root.left==null && root.right==null)
//		{
//			return 1;
//		
//		}
//		return numleaves(root.left)+numleaves(root.right);
		if(root==null)
		{
			return;
		}
		if(root.left==null && root.right==null)
		{
			System.out.println(root.data);
		}
		numleaves(root.left);
		numleaves(root.right);
		
		
		                              
		
		
	}
	
	
	public static int numTrees(int n) {
        if (n <= 0) {
            return 0;
        }

        // dp array to store the number of unique BSTs for each number i
        int[] dp = new int[n + 1];
        dp[0] = 1; // There is one empty tree (base case)

        // Calculate the number of unique BSTs for each number from 1 to n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // The number of unique BSTs with root as j is the product of
                // the number of unique BSTs in its left subtree and right subtree
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }
	
	
	//depth k sum
	public static int printAtDepthK(BinaryTreeNodes<Integer> root, int k) {
	    if (root == null) {
	        return 0;
	    }
	    
	    if (k == 0) {
	        return root.data;
	    }

	    // Recursively calculate sum from left and right subtrees
	    int sumLeft = printAtDepthK(root.left, k - 1);
	    int sumRight = printAtDepthK(root.right, k - 1);

	    // Return the sum of the current node and the sums from left and right subtrees
	    return sumLeft + sumRight;
	}

	
//	public static void printAtDepthK(BinaryTreeNodes<Integer>root,int k)
//	{//O(N)
//		if(root==null)
//		{
//			return;
//		}
//		if(k==0)
//		{
//			System.out.println(root.data);
//			return;
//		}
//		printAtDepthK(root.left,k-1);
//		printAtDepthK(root.right,k-1);
//		
//	}
	//height or max depth of a tree
	public static int height(BinaryTreeNodes<Integer>root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		return 1+Math.max(leftHeight, rightHeight);
	}
	public static boolean BalancedTree(BinaryTreeNodes<Integer>root)
	{
		if(root==null)
		{
			return true;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		if(Math.abs(leftHeight-rightHeight)>1)
		{
			return false;
		}
		boolean isleftBalanced=BalancedTree(root.left);
		boolean isrightBalanced=BalancedTree(root.right);
		
		return isleftBalanced && isrightBalanced;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNodes<Integer>root=new BinaryTreeNodes<Integer>(1);
//		
//		BinaryTreeNodes<Integer>rootLeft=new BinaryTreeNodes<Integer>(2);
//		BinaryTreeNodes<Integer>rootRight=new BinaryTreeNodes<Integer>(3);
//		root.right=rootRight;
//		root.left=rootLeft;
//		
//		
//		BinaryTreeNodes<Integer>twoRight=new BinaryTreeNodes<Integer>(4);
//		BinaryTreeNodes<Integer>threeLeft=new BinaryTreeNodes<Integer>(5);
//		
//		rootLeft.right=twoRight;
//		rootRight.left=threeLeft;
//		BinaryTreeNodes<Integer>root=takeInputBetter(true,0,true);
//		
//		printTreeDetail(root);
		
//		System.out.println("NUMOFNodes:"+ numNodes(root));
//		System.out.println("lArgest AMONG "+ largest(root));
		//System.out.println("num of leaves" +numleaves(root));
//System.out.println("is BALANCED:"+ BalancedTree(root));
//		numleaves(root);
	//	System.out.println("depth ");
//		printAtDepthK(root,2);
//int g=printAtDepthK(root,2);
//System.out.println(g);
System.out.println(numTrees(5));
//		BinaryTreeNodes<Integer>newRoot=removeLeaves(root);
		//printTreeDetail(newRoot);
	//	System.out.println("Mirror" +mirrorBinaryTree(root));
		
	}

}
