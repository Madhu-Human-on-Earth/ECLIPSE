package Trees;

import java.util.Scanner;

public class sumofnodes {
	public static void main(String[] args) {
		 BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
	      printTreeDetails(root);
	      System.out.println("Total sum of nodes is "+sumofnodes(root));
	     
	}
	
	private static int sumofnodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftsum=sumofnodes(root.left);
		int rightsum=sumofnodes(root.right);
		return root.data+leftsum+rightsum;
	}
	
	
	   private static void printTreeDetails(BinaryTreeNode<Integer> root) {
	        if (root == null) {
	            return;
	        }
	        System.out.print(root.data + ": ");
	        if (root.left != null) {
	            System.out.print("L" + root.left.data + ", ");
	        }
	        if (root.right != null) {
	            System.out.print("R" + root.right.data);
	        }
	        System.out.println();
	        printTreeDetails(root.left);
	        printTreeDetails(root.right);
	    }
	
	 private static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft) {

	        if (isRoot) {
	            System.out.println("Enter root data:");
	        } else {
	            if (isLeft) {
	                System.out.println("Enter left child of " + parentData);
	            } else {
	                System.out.println("Enter right child of " + parentData);
	            }
	        }

	        Scanner sc = new Scanner(System.in);
	        int rootData = sc.nextInt();
	        if (rootData == -1) {
	            return null;
	        }

	        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
	        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
	        root.left = leftChild;
	        root.right = rightChild;

	        return root;
	    }
}
