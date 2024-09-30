package Generics_Tree_Ppc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class Basics {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    static int ceil;
    static int floor;
    public static void main(String[] args) {

int[] arr= {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};
//int[] arr1= {10,20,-1,30,50,-1,60,-1,-1,40,-1,-1};

Node root = constructTree(arr);
//Node root1 = constructTree(arr1);

System.out.println("Original Tree:");
display(root);

//int sx= size(root);
//System.out.println();
//System.out.println( "SiZe iS::-->"+sx);
//
//int maxtree=maxValue(root);
//System.out.println();
//System.out.println("mAX VAUE==>>"+maxtree);
//
//int hgt=height(root);
//System.out.println(hgt);

// traversals(root);
//preOrder(root);
//postOrder(root);
//LevelOrder(root);
//levelorderLineWise(root);
//levelOrderZigZag(root);

//display(root);


//mirrorGenericTree(root);


System.out.println();
//System.out.println("After removing leaves:");

//removeLeaves(root);
//linearize(root);

//linearize2(root);
//display(root);
//boolean fic=findInGenericTree(root,50);
//
//System.out.println(fic);


//ArrayList<Integer> in=nodeToRootPath(root,50);

//Collections.reverse(in);
//System.out.println(in);
//int in=LowestCommonAncestors(root,20,50);
//
//System.out.println(in);


//int dis=DistanceBetweenNodes(root,20,50);
//System.out.println(dis);
//display(root);


//are similar in shape

//boolean truorfal=areSimilar(root,root1);
//
//System.out.println(truorfal);

//boolean shapesimialr=areshapesimilar(root,root1);
//System.out.println(shapesimialr);

//boolean issym=isSymmetric(root);
//System.out.println(issym);

//predecessor=null;
//successor=null;
//
//predesceesorAndSuccessor(root,50);
//if(predecessor==null) {
//	System.out.println("Predecessor:: = Not Found");
//}
//else {
//	System.out.println("Predecessor "+predecessor.data);
//
//}
//
//if(successor==null) {
//	System.out.println("successor:: = Not Found");
//
//}
//else {
//	System.out.println("Successor  : "+successor.data);
//
//}


// floor=Integer.MIN_VALUE;//smallest va of data gere
// ceil=Integer.MAX_VALUE;//nex tgreat
//ceilAndFloor(root,45);
//System.out.println("Ceil: " + ceil);
//System.out.println("Floor: " + floor);

//int lrg=KthLargestValue(root,3);
//
//System.out.println(lrg);

//int s=sumofmaxnode(root);
//System.out.println(s);

int h=diameterofatree(root);
System.out.println(h);
}

    static int dia=0;
  
	private static int diameterofatree(Node root) {
		int dch=-1;
		int sdch=-1;
		
		for(Node child:root.children) {
			int ch=diameterofatree(child);
			
			if(ch>dch) {
				sdch=dch;
				dch=ch;
			}
			else if(ch>sdch) {
				sdch=ch;
			}
		}
		
		int cand=dch+sdch+2;
		
		if(cand>dia) {
			dia=cand;
		}
		dch+=1;
		
		return dch;
	}





	static int msn=0;
    static int ms=Integer.MIN_VALUE;
    
    private static int sumofmaxnode(Node root) {
		int sum=0;
		
		for(Node child:root.children) {
			int csum=sumofmaxnode(child);
			sum+=csum;
		}
		
		sum+=root.data;
		
		if(sum>ms) {
			msn=root.data;
			ms=sum;
		}
		
		return sum;
	}




	private static int KthLargestValue(Node root, int k) {
    	 floor = Integer.MIN_VALUE;
    	    int fact = Integer.MAX_VALUE;

    	    for (int i = 0; i <k; i++) {
    	        ceilAndFloor(root, fact);
    	        fact = floor;
    	        floor = Integer.MIN_VALUE;
    	    }
    	    return fact;
    	
	}



	

    private static void ceilAndFloor(Node root, int i) {

    	 if (root == null) {
            // return Integer.MIN_VALUE;
    		 return;
         }

         if (root.data == i) {
             ceil = i;
             floor = i;
            return;
         }
         
         else if (root.data > i) {
             ceil = Math.min(ceil, root.data);
         } 
         else if (root.data < i) {
             floor = Math.max(floor, root.data);
         }

         for (Node child : root.children) {
             ceilAndFloor(child, i);
         }

       //  return Integer.MIN_VALUE;
	}



	static Node predecessor;
    static Node successor;
    static int state=0;
private static void predesceesorAndSuccessor(Node root, int data) {
		
	if(state==0) {
		if(root.data==data) {
			state=1;
		}
		else {
			predecessor=root;
		}
	}
	else if(state==1) {
		successor=root;
		state=2;
	}
	
	for(Node child:root.children) {
		
      predesceesorAndSuccessor(child, data);
	}
	
		
	}


private static boolean isSymmetric(Node root) {
	
	 return areMirror(root,root);
	
	
	}


private static boolean areMirror(Node root, Node root2) {
	
	if(root.children.size()!=root2.children.size()) {
		return false;
		
	}
	
	for(int i=0;i<root.children.size();i++) {
		
		int j=root.children.size()-1-i;
		
		Node c1=root.children.get(i);
		Node c2=root.children.get(j);
		
		if(areMirror(c1, c2)==false) {
			return false;
		}
		
	}
	return true;
	
}


private static boolean areshapesimilar(Node root, Node root1) {
	
    if(root.children.size()!=root1.children.size()) {
    	return false;
	}
    
    for(int i=0;i<root.children.size();i++) {
    	
    	int j=root.children.size()-1-i;
    	
    	Node c1=root.children.get(i);
    	Node c2=root1.children.get(j);
    	
    	if(areshapesimilar(c1,c2)==false) {
    		return false;
    	}
    }
    return true;
    
}


private static boolean areSimilar(Node root, Node root1) {
		if(root.children.size()!=root1.children.size()) {
			return false;
		}
		
		for(Node child:root.children) {
			Node c1=child;
			Node c2=child;
			
			if(areSimilar(c1, c2)==false) {
				return false;
			}
		}
		return true;
	}


private static int DistanceBetweenNodes(Node root, int i, int j) {
		ArrayList<Integer> p1=nodeToRootPath(root, i);
		ArrayList<Integer> p2=nodeToRootPath(root, j);
		
		int s1=p1.size()-1;
		int s2=p2.size()-1;
		
		while(s1>=0 && s2>=0 && p1.get(s1)==p2.get(s2) )
		{
			s1--;
			s2--;
		}

		s1++;
		s2++;
		
		return s1+s2;
	
	}


private static int  LowestCommonAncestors(Node root, int i, int j) {
		ArrayList<Integer> p1=nodeToRootPath(root, i);
		ArrayList<Integer> p2=nodeToRootPath(root, j);
       
		int s1=p1.size()-1;
		int s2=p2.size()-1;
		
		while(s1>=0 && s2>=0 && p1.get(s1)==p2.get(s2)) {
			s1--;
			s2--;
		}
	s1++;s2++;
	
	return p1.get(s1);
	}


private static ArrayList<Integer> nodeToRootPath(Node root, int i) {
	
	if(root.data==i) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(root.data);
		return list;
	
	}
	
	for(Node child:root.children) {
		ArrayList<Integer> ptc=nodeToRootPath(child, i);
		
		if(ptc.size()>0) {
			ptc.add(root.data);
			return ptc;
		}
	
	}

	return new ArrayList<>();
		
		
	}


private static boolean findInGenericTree(Node root,int k) {
		if(root.data==k) {
			return true;
		}
		
		for(Node child:root.children) {
			boolean fic=findInGenericTree(child, k);
			if(fic) {
				return true;
			}
		}
		return false;
	}


private static Node linearize2(Node root) {
	
		if(root.children.size()==0) {
			return root;
		}
		
		Node lkt=linearize2(root.children.get(root.children.size()-1));
		
		while(root.children.size()>1) {
			Node last=root.children.remove(root.children.size()-1);
		   Node sl=	root.children.get(root.children.size()-1);
		   
		   
		   Node slkt=linearize2(sl);
		   
		   slkt.children.add(last);
		}
		
		return lkt;
	} 


private static void linearize(Node root) {
		for(Node child:root.children) {
			linearize(child);
		}
		
		while(root.children.size()>1) {
			Node lc=root.children.remove(root.children.size()-1);
			Node sl=root.children.get(root.children.size()-1);
			
			Node slt=getTail(sl);
			slt.children.add(lc);
		}
		
	}
private static Node getTail(Node root) {
	while(root.children.size()==1) {
		root=root.children.get(0);
	}
	return root;
}


private static Node constructTree(int[] arr) {
    Node root = null;
    Stack<Node> st = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == -1) {
            st.pop();
        } else {
            Node t = new Node();
            t.data = arr[i];

            if (!st.isEmpty()) {
                st.peek().children.add(t);
            } else {
                root = t;
            }
            st.push(t);
        }
    }

    return root;
}

   
    private static void mirrorGenericTree(Node root) {
		for(Node child:root.children) {
			mirrorGenericTree(child);
		}
		Collections.reverse(root.children);
		
	}

	private static void levelOrderZigZag(Node root) {
		Stack<Node> ms=new Stack<>();
		ms.push(root);
		
		Stack<Node> cs=new Stack<>();
		int level=1;
		
		while(ms.size()>0) {
			root=ms.pop();
			
			System.out.println(root.data+" ");
			
			if(level%2==1) { 
				//odd level
				for(int i=0;i<root.children.size();i++) {
				Node child=root.children.get(i);
				cs.push(child);
				}
			}
		
			//even level
			else {
				for(int i=root.children.size()-1;i>=0;i--) {
					Node child=root.children.get(i);
					cs.push(child);
				}
			}
			
			if(ms.size()==0) {
				ms=cs;
				cs=new Stack<>();
				level++;
				System.out.println();
			}
			
		}
		
	}

	private static void levelorderLineWise(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
               root = queue.poll();
                System.out.print(root.data + " ");

                for (Node child : root.children) {
                    queue.add(child);
                }
            }

            System.out.println();
        }
    }


	private static void LevelOrder(Node root) {
		Queue<Node>q=new ArrayDeque<>();
		
		q.add(root);
		
		while(q.size()>0) {
			root=q.remove();
			
			System.out.print(root.data+"--> ");
			
			for(Node child:root.children) {
				q.add(child);
			}
		}
		System.out.println("null ");
		
		
	}

	private static void traversals(Node root) {
		System.out.println("Node Pre "+root.data);
		
		for(Node child:root.children) {
			System.out.println("Edge pre: "+root.data+" -->"+child.data);
			traversals(child);
			System.out.println("Edge post : "+root.data+"-->"+child.data);
		}
		System.out.println("Node Post "+root.data);
	}
    
    
    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        
        for (Node child : node.children) {
            preOrder(child);
        }
    }



    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        for (Node child : root.children) {
            postOrder(child);
        }

        System.out.println("Node: " + root.data);
    }



	private static int height(Node root) {
		int ht=-1;
		
		for(Node child:root.children) {
			int ch=height(child);
			
			ht=Math.max(ch, ht);
		}
		ht+=1;
		return ht;
	}

	private static int maxValue(Node root) {
		int max=Integer.MIN_VALUE;
		
		for(Node child:root.children) {
		
			int cm=maxValue(child);
			max=Math.max(cm, max);
			
		}
		max=Math.max(max, root.data);
		return max;
	}

	private static int size(Node node) {
		int s=0;
		
		for(Node child:node.children) {
			int cs=size(child);
			s=s+cs;
			
		}
		return 1+s;
		
	}
	
    private static void removeLeaves(Node node) {
    	
        for (int i = node.children.size() - 1; i >= 0; i--) {
            Node child = node.children.get(i);
            if (child.children.size() == 0) {
                node.children.remove(child);
            }
        }

        
        //non leaf nodes
        for (Node child : node.children) {
            removeLeaves(child);
        }
    }
	
	public static void display(Node node) {
	    System.out.print(node.data + " -> ");

	    for (Node child : node.children) {
	        System.out.print(child.data + ", ");
	    }
	    System.out.println(".");

	    for (Node child : node.children) {
	        display(child);
	    }
	}
}
