package Trees;

public class printRecurssively {

	public static void main(String[] args) {

		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<Integer>(3);

		
		 root.left=rootLeft;
		 root.right=rootRight;
		 
		BinaryTreeNode<Integer> tworoot=new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> threeroot=new BinaryTreeNode<Integer>(5);
		
		rootLeft.left=tworoot;
		rootRight.right=threeroot;
		
		print(root);

//		1 
//		L1 R1 2 
//		L2 4 
//		3 
//		R3 5 
	
	}

	private static void print(BinaryTreeNode<Integer> root) {

		if(root==null)
		{
			return;
		}
		System.out.println(root.data+" ");
		if(root.left!=null)
		{
			System.out.print("L "+root.left.data+", ");
		}
		if(root.right!=null)
		{
			System.out.print("R "+root.right.data);
		}
		
		print(root.left);
			print(root.right);
		
	}

}
