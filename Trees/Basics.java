package Trees;

public class Basics {
public static void main(String[] args) {
	
	BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);
	BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<Integer>(2);
	BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<Integer>(3);

  root.left=rootLeft;
  root.right=rootRight;
  print(root);
	BinaryTreeNode<Integer> tworoot=new BinaryTreeNode<Integer>(4);
	BinaryTreeNode<Integer> threeroot=new BinaryTreeNode<Integer>(5);

    rootLeft.right=tworoot;
    rootRight.left=threeroot;
    print(root);
    
    
   
}

private static void print(BinaryTreeNode<Integer> root) {
if(root==null)
{
	return;
}
System.out.println(root.data);
print(root.left);
print(root.right);
	
}
}
