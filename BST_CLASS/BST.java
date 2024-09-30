package BST_CLASS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

import TREES_CODI.BinaryTreeNodes;
import Trees.BinaryTreeNode;

public class BST {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	
	public class NodeValue{
		public int maxNode,minNode,maxSize;
		
		NodeValue(int minNode,int maxNode,int maxSize){
			this.maxNode=maxNode;
			this.minNode=minNode;
			this.maxSize=maxSize;
		}
	};
	
	
	//insert
	private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int value) {
		
		if(root==null) {
			BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(value);
			return newNode;
					
		}
		if(value<root.data) {
			root.left=insert(root.left, value);
		}
		else {
			root.right=insert(root.right, value);
		}
		return root;
	}
	
	public NodeValue largestBSTSubtreeHelper(BinaryTreeNode<Integer> root) {
		//an empty tre is a BST size 0
		if(root==null) {
			return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
		}
		//get values from left and right subtree of curremt tree
		NodeValue left=largestBSTSubtreeHelper(root.left);
		NodeValue right=largestBSTSubtreeHelper(root.right);
		
		//current node is grtr than max in left AND smaller than min in right
		
		//bst
		if(left.maxNode<root.data && root.data<right.minNode) {
			//BST
			return new NodeValue(Math.min(root.data,left.minNode),Math.max(root.data, right.maxNode),left.maxSize+right.maxSize+1);
		}
		//other wise return [-inf, inf] so that parent cant be valid BST
		return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE,Math.max(left.maxSize, right.maxSize));
		
		
	}
	public int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		return largestBSTSubtreeHelper(root).maxSize;
	}
	
	

//	public static Node insert(BinaryTreeNode<Integer> root, int val) {
//		if(root==null) {
//			root=new Node(val);
//			return root;
//		}
//		
//		if(root.data >val) {
//			//left 
//		root.left=	insert(root.left,val);
//		
//		}
//		
//		else {
//			root.right=insert(root.right,val);
//		}
//		return root;
//	}
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
	public static BinaryTreeNode<Integer> deletenode(BinaryTreeNode<Integer> root, int k) {
		
		if(root==null) {
			return null;
		}
		if(k<root.data) {
			root.left=deletenode(root.left, k);
			
		}
		if(k>root.data) {
			root.right=deletenode(root.right, k);
		}
		else {//if root.data==data
			if(root.left==null && root.right==null) {
				return null;//delte curr node
			}
			else if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			
			else {//3rd
				BinaryTreeNode<Integer> minnode=root.right;
				while(minnode.left!=null) {
					minnode=minnode.left;
				}
//				root.data=minnode.data;
				root.right=deletenode(root.right,minnode.data);
				
				
			}
			
		}
		return root;
		
//	    if (root == null) {
//	        return null;
//	    }
//	    
//	  //case:1 -->  no child(leaf node).. delete node & return null to parent
//	  		//case 2:: one child , delete node & replace with child node
//	  		//case 3: two child , replace value with inorder successor(always have 0 or 1 child) & delete the node for inorder successor
//	  		
//
//	    if (root.data > k) {
//	        root.left = deletenode(root.left, k);
//	    } 
//	    else if (root.data < k) {
//	        root.right = deletenode(root.right, k);
//	    } 
//	    else { 
//	    	
//	        if (root.left == null && root.right == null) {
//	            return null;
//	        }
//	        
//	        if (root.left == null) {
//	            return root.right;
//	        }
//	        
//	        if (root.right == null) {
//	            return root.left;
//	        }
//	        
//	        Node IS = inorderSuccessor(root.right);
//	        root.data = IS.data;
//	        root.right = deletenode(root.right, IS.data);
//	    }
//	    return root;
	}
//
//		
//	
	
	public static Node inorderSuccessor(Node root) {
		while(root.left!=null) {
			root=root.left;
		}
		
		return root;
	}
	
	public static void levelorder(Node root) {
		Queue<Node> mq=new ArrayDeque<>();
		mq.add(root);
		while(mq.size()>0) {
			int count=mq.size();
			for(int i=0;i<count;i++) {
				root=mq.remove();
				System.out.println(root.data+" ");
				
				if(root.left!=null) {
					mq.add(root.left);
				}
				
				if(root.right!=null) {
					mq.add(root.right);
				}
			}
			System.out.println();
		}
		
		
	}
	
//	public static void printroottoleaf(Node root) {
//	    printroottoleafHelper(root, new ArrayList<>());
//	}
	

//	private static void printroottoleafHelper(Node root, ArrayList<Integer> path) {
//	    if (root == null) {
//	        return;
//	    }
//
//	    path.add(root.data);
//
//	    if (root.left == null && root.right == null) {
//	        printpath(path);
//	    } else {
//	        printroottoleafHelper(root.left, path);
//	        printroottoleafHelper(root.right, path);
//	    }
//
//	    path.remove(path.size() - 1);
//	}
	private static void printHelper(BinaryTreeNode<Integer> root)
	{
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
	    printHelper(root.left);
	    printHelper(root.right);
	
		
	}
	
//	private static void printpath(ArrayList<Integer> path) {
//	    for (int i = 0; i < path.size(); i++) {
//	        System.out.print(path.get(i) + "->");
//	    }
//	    System.out.print("null");
//	    System.out.println();
//	}

	
	public static boolean search(Node root, int key) {
	    if (root == null || root.data == key) {
	        return root != null; // Return true if the root is not null, false otherwise
	    }

	    if (root.data > key) {
	        return search(root.left, key); // Search in the left subtree
	    }
	    if (root.data < key) {
	        return search(root.right, key); // Search in the right subtree
	    }

	    return false;
	}
	
	public static void printNodesSum(BinaryTreeNode<Integer>root, int s) {
		if(root==null) {
			return;
		}
		
		
		ArrayList<Integer> arr=convertArry(root);
		int i=0,j=arr.size()-1;
		
		while(i<j) {
			if(arr.get(i)+arr.get(j)==s) {
				int x=arr.get(i);
				int y=arr.get(j);
				System.out.println(x+" "+y);
				i++;
				j--;
			}
			else if(arr.get(i)+arr.get(j)<s) {
				i++;
			}
			else {
				j--;
			}
		}
	}
	
	
	private static ArrayList<Integer> convertArry(BinaryTreeNode<Integer> root) {
		// 
		if(root==null) {
			return new ArrayList<Integer>();
			
		}
		
		ArrayList<Integer> lt=convertArry(root.left);
		lt.add(root.data);
		ArrayList<Integer>rt=convertArry(root.right);
		for(int i=0;i<rt.size();i++) {
			lt.add(rt.get(i));
		}
		return lt;
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
	
	public static void inRange(Node root, int a, int b) {
	    if (root == null) {
	        return;
	    }

	    if (root.data >= a && root.data <= b) {
	        inRange(root.left, a, b);
	        System.out.print(root.data + " ");
	        inRange(root.right, a, b);
	    } else if (root.data < a) {
	        inRange(root.right, a, b);
	    } else {
	        inRange(root.left, a, b);
	    }
	}

	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
//		insert(root,4);
//	    int[] values = {8,5,3,6,10,11,14};
//	    Node root = null;
//
//	    for (int i = 0; i < values.length; i++) {
//	        root = insert(root, values[i]);
//	    }
//
	    root = deletenode(root, 18);
//	    inorder(root);
	    printHelper(root);
//	    System.out.println();
//	    levelorder(root);
	   // printroottoleaf(root);
	   // inRange(root, 2, 6);

	   // System.out.println(search(root, 7));
	}
	


}
