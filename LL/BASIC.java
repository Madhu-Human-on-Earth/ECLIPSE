package LL ;
class BASIC {
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node<Integer> head = createLinkedList();
	      //Node<Integer> n1= new Node<>(10);
	    
	    //increment 
	    increment(head);
	      print(head);
//	      System.out.println(n1);
//	      System.out.println(n1.data);
//	      System.out.println(n1.next);
	}
	 private static void increment(Node<Integer> head) {
		// TODO Auto-generated method stub
		// head.data++;temp.n
		 Node<Integer> temp=head;
		 while(temp!=null)
		 {
			 temp.data++;
			 temp=temp.next;
		 }
		
	}
	public static Node<Integer> createLinkedList(){
		    Node<Integer> n1= new Node<>(10);
		    Node<Integer> n2= new Node<>(20);
		    Node<Integer> n3= new Node<>(30);
		    Node<Integer> n4= new Node<>(40);
		    n1.next=n2;
		    //System.out.println("n1 "+n1+ " data "+ n1.data+" next "+n1.next);
		    n2.next=n3;
		    //System.out.println("n2 "+n2+ " data "+ n2.data+" next "+n2.next);
		    n3.next=n4;
		    //System.out.println("n3 "+n3+ " data "+ n3.data+" next "+n3.next);
		    //System.out.println("n4 "+n4+ " data "+ n4.data+" next "+n4.next);
		    return n1;

		    }

		  public static void print(Node<Integer> head){
			  Node<Integer> temp=head;
		     while(temp!=null)
		     {
		    	 System.out.println(temp.data);
		    	 temp=temp.next;
		     }
System.out.println();
		  }	
		

}
