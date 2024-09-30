package BST_PP;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Basic {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}

	public static class Pair{
		Node root;
		int state;
	
	Pair(Node node,int state){
		this.root=node;
		this.state=state;
	}
	}
	
	public static void main(String[] args) throws Exception {
		
		Integer[] arr= {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
           
		Node root=new Node(arr[0],null,null);
		
		Pair rp=new Pair(root,1); 
		
		Stack<Pair> st=new Stack<>();
		
		
		st.push(rp);
		
		int idx=0;
		while(st.size()>0) {
			Pair top=st.peek();
			if(top.state==1) {//left
				idx++;
				if(arr[idx]!=null) {
					top.root.left=new Node(arr[idx],null,null);
			
					Pair lp=new Pair(top.root.left,1);
					st.push(lp);
				}
				
				else {
					top.root.left=null;
				}
				top.state++;
			}
			
			else if(top.state==2) {//right
				idx++;
				if(arr[idx]!=null) {
					top.root.right=new Node(arr[idx],null,null);
			
					Pair rgtpair=new Pair(top.root.right,1);
					st.push(rgtpair);
				}
				
				else {
					top.root.right=null;
				}
				top.state++;	
			}
			
			else {
				st.pop();
			}
		}
		
	display(root);
		
//		int size=sizeofbst(root);
//		int sum=sumofbst(root);
//		int max=maxofbst(root);
//		int hgt=heightbst(root);
//		
//		System.out.println(sum);
//		System.out.println(size);
//		System.out.println(max);
//		System.out.println(hgt);

//		System.out.println("Inorder traversal:");
//        inorder(root);
//        System.out.println();
//
//        System.out.println("Preorder traversal:");
//        preorder(root);
//        System.out.println();
//
//        System.out.println("Postorder traversal:");
//        postorder(root);
//        System.out.println();
//		
//         System.out.println("Level Ordre traversal:: ");
//         levelOrder(root);
//         System.out.println();
         
//		printExtremeNodes(root);
//		System.out.println(root);
		
//		iterativePrePostInordTraver(root);
		path=new ArrayList<>();
//		boolean s=find(root,70);
//		System.out.println();
//		
//		System.out.println(s);
//		Collections.reverse(path);
//	System.out.println(path);
		
		
//		printlevelKdown(root,2);//exact levvel, 0,1,2
		
		printKnodesAway(root,25,2);
//		printlevelKdownBlocker(root,2,3);
	}


	
	private static void printKnodesAway(Node root,int data, int k) {
		 path=new ArrayList<>();
		 find(root,data);

	        for (int i = 0; i < path.size(); i++) {
	        	printlevelKdownBlocker(path.get(i), k - i,i==0?null:path.get(i));
	        }
	}

	private static void printlevelKdownBlocker(Node root, int i, Node blocker) {
	    if (root == null || i < 0 || root == blocker) {
	        return;
	    }

	    if (i == 0) {
	        System.out.println(root.data + " ");
	    }

	    printlevelKdownBlocker(root.left, i - 1, blocker);
	    printlevelKdownBlocker(root.right, i - 1, blocker);
	}


	private static void printlevelKdown(Node root, int i) {

		if(root==null|| i<0) {
			return;
		}
		
		if(i==0) {
			System.out.println(root.data+" ");
		}//pre order
		printlevelKdown(root.left,i-1);
		printlevelKdown(root.right, i-1);
	}

	static ArrayList<Node> path;
	private static boolean find(Node root, int i) {
		
		
		if(root==null) {
			return false;
		}
		
		if(root.data==i) {
			
			path.add(root);
			return true;
		}
		
		boolean left=find(root.left,i);
		if(left) {
			path.add(root);
			return true;
		}
		
		boolean right=find(root.right,i);
		if(right) {
			path.add(root);
			return true;
		}
		
		return false;
	}



//	static ArrayList<Integer> path;
//	private static boolean find(Node root, int i) {
//		
//		
//		if(root==null) {
//			return false;
//		}
//		
//		if(root.data==i) {
//			
//			path.add(root.data);
//			return true;
//		}
//		
//		boolean left=find(root.left,i);
//		if(left) {
//			path.add(root.data);
//			return true;
//		}
//		
//		boolean right=find(root.right,i);
//		if(right) {
//			path.add(root.data);
//			return true;
//		}
//		
//		return false;
//	}
//



	private static void iterativePrePostInordTraver(Node root) {
		
		Stack<Pair> st=new Stack<>();
		
		Pair rtp=new Pair(root,1);
		
		st.push(rtp);
		String pre="";
		String post="";
		String in="";
		
		while(st.size()>0) {
			
			Pair top=st.peek();
			
			if(top.state==1) {//pre, s++, left
				pre+=top.root.data+" ";
				
				top.state++;
				
				if(top.root.left!=null) {
					Pair lp=new Pair(top.root.left,1);
					st.push(lp);
				}
				
			}
			else if(top.state==2) { //in, s++, right
                   
				in+=top.root.data+" ";
				top.state++;
				
				if(top.root.right!=null) {
					Pair lp=new Pair(top.root.right,1);
					st.push(lp);
				}
			}
			
			else { // post,pop
                     post+=top.root.data+" ";
			
				st.pop();
			}
			
		}
		
		System.out.println(pre);
		System.out.println(in);
		System.out.println(post);
		
		
	}




	private static void printExtremeNodes(Node root) {

		 if (root == null) {
	            return;
	        }
	        Queue<Node> queue = new LinkedList<>();
	        queue.add(root);
	        boolean printLeft = true;

	        while (!queue.isEmpty()) {
	            int nodeCount = queue.size();
	            int n = nodeCount;

	            for (int i = 0; i < n; i++) {
	                Node currentNode = queue.poll();

	                if (printLeft && i == 0) {
	                    System.out.print(currentNode.data + " "); // Leftmost node
	                }

	                if (!printLeft && i == n - 1) {
	                    System.out.print(currentNode.data + " "); // Rightmost node
	                }

	                if (currentNode.left != null) {
	                    queue.add(currentNode.left);
	                }
	                if (currentNode.right != null) {
	                    queue.add(currentNode.right);
	                }
	            }
	            
	            printLeft = !printLeft; // Invert the flag for the next level
	        }
	    }
		


	private static void levelOrder(Node root) {
		
		
		if (root == null) {
	        return;
	    }

	    Queue<Node> qu = new ArrayDeque<>();
	    qu.add(root);

	    while (qu.size() > 0) {
	        int count = qu.size();

	        for (int i = 0; i < count; i++) {//orer amin, puts each level level in one order,.
	            root = qu.remove();

	            System.out.println(root.data + " ");

	            if (root.left != null) {
	                qu.add(root.left);
	            }
	            if (root.right != null) {
	                qu.add(root.right);
	            }
	        }

	        System.out.println();
	    }
		
		
//	    if (root == null) {
//	        return;
//	    }
//	    
//	    Queue<Node> queue = new ArrayDeque<>();
//	    Stack<Node> stack = new Stack<>();
//	    
//	    queue.add(root);
//	    
//	    while (!queue.isEmpty()) {
//	        Node current = queue.remove();
//	        stack.push(current);
//	        
//	        if (current.left != null) {
//	            queue.add(current.left);
//	        }
//	        
//	        if (current.right != null) {
//	            queue.add(current.right);
//	        }
//	    }
//	    
//	    while (!stack.isEmpty()) {
//	        Node node = stack.pop();
//	        System.out.print(node.data + " ");
//	    }
	}


	private static void inorder(Node root) {
if(root==null) {
	return;
}
  inorder(root.left);
  System.out.print(root.data+" ");
  inorder(root.right);
  
  
		
	}

	private static void postorder(Node root) {
if(root==null) {
	return;
}
	postorder(root.left);
	
	postorder(root.right);
	System.out.print(root.data+" ");
}
		
	
	private static void preorder(Node root) {

		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

	private static int heightbst(Node root) {
		if(root==null) {
			return -1;//edges
		}
		
		int left=heightbst(root.left);
		int right=heightbst(root.right);
		
		return 1+Math.max(left, right);
		
		
	}

	private static int maxofbst(Node root) {
		
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		
		int lm=maxofbst(root.left);
		int rm=maxofbst(root.right);
		
		int tm=Math.max(root.data,Math.max(lm, rm));
		
		return tm;
	}

	private static int sumofbst(Node root) {
		
		if(root==null) {
			return 0;
		}
		
		int lsm=sumofbst(root.left);
		int rsm=sumofbst(root.right);
		
		return root.data+lsm+rsm;
	}

	private static int sizeofbst(Node root) {
		if(root==null) {
			return 0;
		}
		
		int left=sizeofbst(root.left);
		int right=sizeofbst(root.right);
		
		return 1+left+right;
	}

	private static void display(Node root) {
		//pre order
		
		if(root==null) {
			return;
		}
		String str="";
		str+=root.left==null ? "null": root.left.data+" ";
		str+="<-"+root.data+"->";
		str+=root.right==null ? "null": root.right.data+" ";

		System.out.println(str);
		
		display(root.left);
		display(root.right);
		
	}

}
