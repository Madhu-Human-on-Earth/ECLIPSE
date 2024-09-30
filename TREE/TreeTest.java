package TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class TreeTest {
    public static TreeNode<Integer> takeInputLevelWise() {
        System.out.println("Enter root Data: ");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);

        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter the number of children for " + front.data);
            int numChild = sc.nextInt();

            for (int i = 0; i < numChild; i++) {
                System.out.println("Enter " + i + "th child of " + front.data);
                int childData = sc.nextInt();
                TreeNode<Integer> child = new TreeNode<>(childData);
                front.children.add(child);
                pendingNodes.add(child);
            }
        }

        return root;
    }

    public static int countNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int count = 1;
        for (TreeNode<Integer> child : root.children) {
            count += countNodes(child);
        }

        return count;
    }

    public static int sumofnodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int sum = root.data;

        for (TreeNode<Integer> child : root.children) {
            sum += sumofnodes(child);
        }

        return sum;
    }
    
    public static int nodesgreaterthanX(TreeNode<Integer> root,int x) {
    	if(root==null) {
    		return 0;
    	}
    	
    	int c=0;
    	if(root.data>x) {
    		c++;
    	}
    	
    	for(TreeNode<Integer> children:root.children) {
    		c+=nodesgreaterthanX(root, x);
    	}
		return c;
    }
    
    public static void PrintPostOrder(TreeNode<Integer> root) {
    	if(root==null) {
    		return;
    	}
    	
    	for(TreeNode<Integer> children:root.children) {
    		PrintPostOrder(children);
    	}
    	System.out.println(root.data);
    }
public static boolean checkIfContainsX(TreeNode<Integer>root, int x) {
	if(root==null) {
		return false;
	}
	if(root.data==x) {
		return true;
	}
	
	for(TreeNode<Integer> children:root.children) {
		if(checkIfContainsX(children,x)){
			return true;
		}
	}
	return false;
}

public static TreeNode<Integer> maxsumnodes(TreeNode<Integer> root){
	if(root==null) {
		return null;
	}
	TreeNode<Integer> result = null;
	int maxsum=Integer.MIN_VALUE;
	int sum=0;
	int cs=root.data;
	for(TreeNode<Integer>children:root.children) {
		cs+=children.data;
		maxsumnodes(children);
	}
	if(cs > maxsum) {
		result=root;
		maxsum=cs;
	}
	return result;
}

public static boolean checkidentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
	if(root1==null && root2==null) {
		return true;
	}
	
	if((root1==null && root2!=null)|| (root1!=null && root2==null)){
		return false;
	}
	if(root1.data!=root2.data) {
		return false;
	}
	if(root1.children.size()!=root2.children.size()) {
		return false;
	}
	for(TreeNode<Integer> children: root1.children) {
		if(!checkidentical(root1, root2)) {
			return false;
		}
		
	}
	return true;
}

    public static void printTree(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            if (root.children.get(i).data != 0) {
                System.out.print(root.children.get(i).data + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < root.children.size(); i++) {
            printTree(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println("Number of nodes: " + countNodes(root));
        System.out.println("Tree Structure:");
        printTree(root);
        System.out.println("Sum of nodes: " + sumofnodes(root));
       
        
    }
}
