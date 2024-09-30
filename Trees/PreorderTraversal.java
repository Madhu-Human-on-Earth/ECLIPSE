package Trees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PreorderTraversal {

public static void main(String[] args) {

    BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
   // printTreeDetails(root);
  //  PreorderTraversal(root);
//inorderTraversal(root);
  //  postorder(root);
    
    
//    int largest=LargestNode(root);
//System.out.println(largest);
    
//    int totalnodesgreaterthanX=NodesGreaterThanX(root,2);
//    System.out.println(totalnodesgreaterthanX);
    
//    int HEight=height(root);
//    System.out.println(HEight);
    
//    System.out.println(leafnodes(root));
//    NodeDepthK(root, 1);
   // NodeDepthrep(root,0);
//   System.out.println(isNodePresent(root, 2));
//    NodeWithOutSiblings(root);
    
//removleafNodes(root);
//    MirrorTree(root);
//    isBalancedBetter(root);
    
   // Diameteroftree(root);
    
    //levelWise(root);
//printTreeDetails(root);
    int h=minAndMax(root);
    ArrayList<Integer> path= nodeToRootPath(root,7);
    ArrayList<Integer> path2= nodeToRootPath2(root);

    System.out.println(path);
    
    System.out.println(path2);

    System.out.println(h);
    
}

private static int minAndMax(BinaryTreeNode<Integer> root) {
    if (root == null) {
        return -1;
    }
    
    BinaryTreeNode<Integer> curr = root;
    while (curr.left != null) {
        curr = curr.left;
    }
    
    return curr.data;
}

public static boolean isBST(BinaryTreeNode<Integer> root)
{
	if(root==null)
	{
		return true;
	}
	
	int leftMax=largest(root.left);
	
	if(leftMax>=root.data) {
		return false;
	}
	
	int rightmin=minimum(root.right);
	
	if(rightmin<root.data) {
		return false;
	}
	
	boolean isleftbst=isBST(root.left);
	boolean isRight=isBST(root.right);
	
	return isleftbst&& isRight;
	
}

private static boolean searchBST(BinaryTreeNode<Integer> root, int data)
{
	if(root==null)
	{
		return false;
	}
	
	if(root.data==data)
	{
		return true;
	}
	
	if(data<root.data) {
		return searchBST(root.left, data);
	}
	return searchBST(root.right, data);
}

private static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1,int k2) {
	
	if(root==null)
	{
		return;
	}
	
	if(root.data<k1) {
		printBetweenK1K2(root.right, k1, k2);
	}
	
	else if(root.data>k2) {
		printBetweenK1K2(root.left, k1, k2);
	}
	
	else {
		System.out.println(root.data);
		printBetweenK1K2(root.left, k1, k2);
		printBetweenK1K2(root.right, k1, k2);
	}
}

public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer>root, int X){
	ArrayList<Integer> arr=new ArrayList<>();
	
	if(search(root, X,arr)) {
		Collections.reverse(arr);
		return arr;
	}
	return null;
	
}

public static boolean search(BinaryTreeNode<Integer> root, int x,ArrayList<Integer>arr) {
	if(root==null) {
		return false;
	}
	
	if(root.data==x) {
		arr.add(root.data);
		return true;
	}
	
	if(search(root.left, x,arr)|| search(root.right, x,arr)) {
		arr.add(root.data);
		return true;
	}
	return false;
}


//private static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x){
//	
//	if(root==null) {
//		return null;
//	}
//	
//	if(root.data==x) {
//		ArrayList<Integer> output=new ArrayList<>();
//		output.add(root.data);
//		return output;
//	}
//	
//	ArrayList<Integer> leftoutput=nodeToRootPath(root.left,x);
//	if(leftoutput!=null) {
//		leftoutput.add(root.data);
//		return leftoutput;
//	}
//	
//	ArrayList<Integer> rightoutput=nodeToRootPath(root.right, x);
//	if(rightoutput!=null) {
//		rightoutput.add(root.data);
//		return rightoutput;
//	}
//	return null;
//}

private static ArrayList<Integer> nodeToRootPath2(BinaryTreeNode<Integer> root){
	
	if(root==null) {
		return new ArrayList<>();
	}
	
//	if(root.data==x) {
//		ArrayList<Integer> output=new ArrayList<>();
//		output.add(root.data);
//		return output;
//	}
	
	ArrayList<Integer> leftoutput=nodeToRootPath2(root.left);

	if(root==null) {
		return new ArrayList<>();
		
	}
	
	ArrayList<Integer> leftarray=nodeToRootPath2(root.left);
	ArrayList<Integer> rightaray=nodeToRootPath2(root.right);
	
	if(leftarray.size() >= rightaray.size()) {
		leftarray.add(0,root.data);
		//leftarray.add(root.data);//from leaf to root path
		return leftarray;
	}
	else {
		rightaray.add(0,root.data);
		//rightaray.add(root.data);//from leaf to root path
		return rightaray;
	}
	
	//	if(leftoutput!=null) {
//		leftoutput.add(root.data);
//		return leftoutput;
//	}
//	
//	ArrayList<Integer> rightoutput=nodeToRootPath2(root.right);
//	if(rightoutput!=null) {
//		rightoutput.add(root.data);
//		return rightoutput;
//	}
//	return null;
}

private static int minimum(BinaryTreeNode<Integer> root) {
	// TODO Auto-generated method stub
	
	        if(root==null){
	            return -1;
	        }
	        int largestLeft= largest(root.left);
	        int largestRight= largest(root.right);
	        return Math.min(root.data, Math.min(largestLeft, largestRight));
	    }


private static int largest(BinaryTreeNode<Integer> root) {
	if(root==null)
	{
		return -1;
	}
	
	int largestLeft=largest(root.left);
	int largestRight=largest(root.right);
	
	return Math.max(largestLeft, largestRight);
}

private static void levelWise(BinaryTreeNode<Integer> root) {
	
        if (root == null) {
            return;
        }

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> node = queue.poll();
            System.out.println(node.data);

            if (node.left != null) {
                queue.add(node.left);
            } else {
                System.out.println("-1:");
            }

            if (node.right != null) {
                queue.add(node.right);
            } else {
                System.out.println("-1:");
            }
        }
}


private static int Diameteroftree(BinaryTreeNode<Integer> root) {
	// TODO Auto-generated method stub
	if(root==null) return 0;
	
	return height(root.left)+height(root.right)+1;
	
	
}



//wc==o(n**2),,,,avg case==o(n)
//private static boolean isBalancedBinaryTree(BinaryTreeNode<Integer> root) {
//	// TODO Auto-generated method stub
//	if(root==null) return true;
//	
//	int left=height(root.left);
//	int right=height(root.right);
//	
//	if(Math.abs(left-right) >1) return false;
//	boolean isl=isBalancedBinaryTree(root.left);
//	boolean isr=isBalancedBinaryTree(root.right);
//	
//	return isl&&isr;	
//}
//private static boolean isBalancedBinaryTree(BinaryTreeNode<Integer> root) {
//	return checkBalance(root)!=-1;
//}
//
//private static int checkBalance(BinaryTreeNode<Integer> root) {
//	if(root==null) return 0;
//	
//	int leftHgt=checkBalance(root.left);
//	if(leftHgt==-1) return -1;  // Left subtree is unbalanced, no need to proceed further
//	
//	int rightHeight=checkBalance(root.right);
//	if(rightHeight==-1) {
//		return -1;  // Right subtree is unbalanced, no need to proceed further
//	}
//	
//	int heightDiff=Math.abs(leftHgt-rightHeight);
//	if(heightDiff>1) 
//	{  // Tree is unbalanced
//		return -1;
//	}
//	
//	return Math.max(rightHeight, heightDiff)+1;  Return height of the current node
//}
//
public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
    if(root==null){
      int height= 0;
      boolean isBal= true;
      BalancedTreeReturn ans= new BalancedTreeReturn();
      ans.height= height;
      ans.isBalanced= isBal;
      return ans;
    }
    BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
    BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
    boolean isBal= true;
    int height= 1+Math.max(leftOutput.height, rightOutput.height);

    if(Math.abs(leftOutput.height-rightOutput.height)>1){
      isBal= false;
    }
    if(!leftOutput.isBalanced || !rightOutput.isBalanced){
      isBal=false;
    }
    BalancedTreeReturn ans= new BalancedTreeReturn();
    ans.height= height;
    ans.isBalanced= isBal;
    return ans;
}

//
//private static BinaryTreeNode<Integer> MirrorTree(BinaryTreeNode<Integer> root) {
//	// TODO Auto-generated method stub
//	if(root==null)
//	{
//		return null;
//	}
//BinaryTreeNode<Integer> temp=root.left;
//root.left=root.right;
//root.right=temp;
//MirrorTree(root.left);
//MirrorTree(root.right);
//	
//return root;
//}

private static BinaryTreeNode<Integer> removleafNodes(BinaryTreeNode<Integer> root) {
if(root==null)
{
	return null;
}
if(root.right==null && root.left==null)
{
	return null;
}

root.left=removleafNodes(root.left);
root.right=removleafNodes(root.right);
return root;

	
}

private static void NodeWithOutSiblings(BinaryTreeNode<Integer> root)
{
	if(root==null)
	{
		return;
	}
	
	if(root.right==null && root.left!=null)
	{
		System.out.println(root.left.data+" ");
	}
	
	if(root.right!=null && root.left==null)
	{
		System.out.println(root.right.data+" ");
	}
	
	NodeWithOutSiblings(root.left);
	NodeWithOutSiblings(root.right);
}

	private static void postorder(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
		
	}
	
	private static boolean isNodePresent(BinaryTreeNode<Integer>root,int x)
	{
		if(root==null)
		{
			return false;
		}
		
		if(root.data==x)
		{
			return true;
		}
		
		return (isNodePresent(root.left, x)|| isNodePresent(root.right, x));
		
	}

private static void inorderTraversal(BinaryTreeNode<Integer> root) {
	if(root==null)
	{
		return;
	}

inorderTraversal(root.left);
System.out.println(root.data+" ");
inorderTraversal(root.right);
	
}

private static void PreorderTraversal(BinaryTreeNode<Integer> root) {
	if(root==null)
	{
		return;
	}
	
	System.out.print(root.data+" ");
	PreorderTraversal(root.left);
	PreorderTraversal(root.right);
	
}

//BFS OR LEVEL ORDER
public static void LevelBFS(BinaryTreeNode<Integer> root) {
	if(root==null)
	{
		return;
	}
	
	Queue<Integer> queue=new LinkedList<>();
	
	
}

//largest node in tree
private static int LargestNode(BinaryTreeNode<Integer> root)
{
	if(root==null)
	{
		return -1;
	}
	int leftlar=LargestNode(root.left);
	int rightLar=LargestNode(root.right);
return Math.max(root.data,Math.max(leftlar, rightLar));
			
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

private static int height(BinaryTreeNode<Integer>root)
{
	if(root==null)
	{
		return 0;
	}
	int left=height(root.left);
	int right=height(root.right);
	return 1+Math.max(left,right);
}

//print nodes at depth k
private static void NodeDepthK(BinaryTreeNode<Integer> root,int k)
{
	if(root==null || k<0)
	{
		return;
	}
	
	if(k==0)
	{
		System.out.println(root.data);
	}
	NodeDepthK(root.left, k-1);
	
	NodeDepthK(root.right, k-1);
	
	
}
private static void NodeDepthrep(BinaryTreeNode<Integer> root, int k) {
    if (root == null || k < 0) {
        return;
    }
    root.data = k;
   
    NodeDepthrep(root.left, k + 1);
    NodeDepthrep(root.right, k + 1);

   
}


private static int leafnodes(BinaryTreeNode<Integer>root)
{
	if(root==null)
	{
		return 0;
	}
	int count=0;
	if(root.left==null && root.right==null)
	{
		//System.out.println(root.data);
		count++;
		
	}
	count+=leafnodes(root.left);
	count+=leafnodes(root.right);
return count;
}

private static int NodesGreaterThanX(BinaryTreeNode<Integer>root,int X)
{
	if(root==null)
	{
		return 0;
	}
	
	int count=0;
	
	if(root.data>X)
	{
		count++;
	}
	
	count+=NodesGreaterThanX(root.left, X);
	count+=NodesGreaterThanX(root.right, X);
	return count;
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














