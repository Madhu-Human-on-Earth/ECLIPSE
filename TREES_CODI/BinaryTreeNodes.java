package TREES_CODI;

public class BinaryTreeNodes<T>{//T rep what kind od data we represent there
 public  T data;
  public BinaryTreeNodes<T> left;
  public BinaryTreeNodes<T> right;

   
   public BinaryTreeNodes(T data) {//constructor
	   this.data=data;
   }
}
