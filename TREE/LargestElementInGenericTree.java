package TREE;


import java.util.LinkedList;
import java.util.Queue;

public class LargestElementInGenericTree {

    public static int findLargestElement(TreeNode<Integer> root) {
    	
    	int maxvalue=Integer.MIN_VALUE;
    	int smax=-1111111;
    Queue<TreeNode<Integer>> queue=new LinkedList<>();
    queue.add(root);
    
    while(!queue.isEmpty()) {
    	TreeNode<Integer>currentNode=queue.poll();
    	
    	if(currentNode.data>maxvalue) {
    		maxvalue=currentNode.data;
    	}
    	
    	else if(currentNode.data<maxvalue && currentNode.data>smax) {
    		smax=currentNode.data;
    	}
    	for(TreeNode<Integer> children:currentNode.children) {
    	queue.add(children);
    	}
    	
    	
    }
    return smax;
    	
    	
//        int maxValue = Integer.MIN_VALUE;
//
//        Queue<TreeNode<Integer>> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//        	TreeNode<Integer> currentNode = queue.poll();
//
//            if (currentNode.data > maxValue) {
//                maxValue = currentNode.data;
//            }
//
//            for (TreeNode<Integer> child : currentNode.children) {
//                queue.add(child);
//            }
//        }
//
//        return maxValue;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(10);
        root.children.add(new TreeNode<>(2));
        root.children.add(new TreeNode<>(34));
        root.children.add(new TreeNode<>(56));
        root.children.add(new TreeNode<>(100));

        root.children.get(0).children.add(new TreeNode<>(77));
        root.children.get(0).children.add(new TreeNode<>(88));

        root.children.get(2).children.add(new TreeNode<>(1));
        root.children.get(2).children.add(new TreeNode<>(7));
        root.children.get(2).children.add(new TreeNode<>(8));
        root.children.get(2).children.add(new TreeNode<>(9));

        System.out.println("The largest element in the tree is: " + findLargestElement(root));
    }
}

