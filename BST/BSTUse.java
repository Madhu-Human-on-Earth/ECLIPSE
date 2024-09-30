package BST;

public class BSTUse {
	
	public static void main(String[] args) {
		BST_CLASS b=new BST_CLASS();
		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		
		b.printTree();
		b.deleteData(5);
		System.out.println(b.ispresent(5));
		b.printTree();
		
	}

}
