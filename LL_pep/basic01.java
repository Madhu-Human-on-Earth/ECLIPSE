package LL_pep;

import java.util.ArrayList;
import java.util.Scanner;

public class basic01 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

		public void addLast(Node head2, int val) {
			// TODO Auto-generated method stub
			
		}
    }

   

    public static void main(String[] args) {
        Node head = takeInput();

        // head = addLast(head, 3);

        // head = removeFirst(head);

//        int h = getFirst(head);
//        int l = getLast(head);
//        int pos = getAt(head, 3);

       // head=addFirst(head,98);
        
        
     //   head=addAtIndex(head,35,3);
        
       // head=removelast(head);
        
       // head=reverse(head);//DATA ITE
       // head=reversePi(head);
        
    //    head=removeAtInd_i(head,3);
        
        //head=KthfromEnd(head,4);
        
//        int mid=MiddleFromLL(head);
        
     //   head=RemoveDuplicates(head);
        
       // head=oddEven(head);
        
       // RecurssiveReverse(head);
    // RecurssiveReverse(head);
        boolean v=isPalindrome(head);
       // print(head);
     System.out.println(v);
    }

  

    private static boolean isPalindrome(Node head) {
		//find mid
    	Node f=head;
    	Node s=head;
    	while(f.next!=null && f.next.next!=null) {
    		f=f.next.next;
    		s=s.next;
    	}
    	
    	//1 ||2 |||3 -->s=2,f=3
    	
    	
    	if(f!=null) {
    		s=s.next;
    	}
    	
    	//reverse the list start from slow
    	Node revhead =reverse(s);
    	
    	while(revhead!=null) {
    		
    		if(revhead.data!=head.data)return false;
    		else {
    			revhead=revhead.next;
    			head=head.next;
    		}
    	}
    	return true;
    	
	}



	private static void RecurssiveReverse(Node head) {
		if(head==null) {
			return;
		}
		RecurssiveReverse(head.next);
		System.out.print(head.data+" ");
    	
    	
    	
    	
	}



	private static Node oddEven(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
           
                odd.next = even.next;
                odd = odd.next;
           
                even.next = odd.next;
                even = even.next;
            }
        

        odd.next = evenHead;

        return head;
    }


//	 private static Node addLast(Node head, int i) {
//	        Node newNode = new Node(i);
//
//	        if (head == null) {
//	            head = newNode;
//	        } else {
//	            Node temp = head;
//	            while (temp.next != null) {
//	                temp = temp.next;
//	            }
//	            temp.next = newNode;
//	        }
//
//	        return head;
//	    }
	private static Node RemoveDuplicates(Node head) {
		Node temp=head;
		while(temp.next!=null) {
			if(head==null) {
				return head;
			}
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
			}
			else
			{
				temp=temp.next;
			}
		}
		return head;
	}

	private static int MiddleFromLL(Node head) {
	
    	Node slow=head;
    	Node fast=head;
    	
    	while(fast.next!=null && fast.next.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return slow.data;
	}

	private static Node KthfromEnd(Node head, int k) {
//		Node temp=head;
//		Node temp1=head;
//		int len=0;
//		while(temp!=null) {
//			len++;
//			temp=temp.next;
//		}
//		for(int i=0;i<len-k;i++) {
//			temp1=temp1.next;
//		}
//		return temp1;
		
    	
    	//app-2
    	Node fast=head;
    	Node slow=head;
    	
    	//move fast pointer k nodes aheasd
    	for(int i=0;i<k;i++) {
    		if(fast==null) {
    			return null;
    		}
    		fast=fast.next;
    	}
    	
    	//move both pointers until fast reaches end
    	while(fast!=null) {
    		fast=fast.next;
    		slow=slow.next;
    	}
    	
    	return slow;
	}

	private static Node removeAtInd_i(Node head,int idx) {
		
    	int len=0;
    	Node temp=head;
    	Node temp3=head;
    	while (temp != null) {
            
            temp = temp.next;
            len++; // Increment len while iterating
        }
    	
    	if(idx<0 || idx>=len) {
    		return null;
    		
    	}
    	if(idx==0) {
    		removeFirst(head);
    	}
    	else if(idx==len-1){
    		removelast(head);
    		
    	}
    	else {
    		for(int i=0;i<idx-1;i++) {
    			temp3=temp3.next;
    		}
    		temp3.next=temp3.next.next;
    		len--;
    	}
		return head;
	}

	private static Node reversePi(Node head) {
		Node prev=null;
		Node curr=head;
		
		while(curr!=null) {
			Node next_nn=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next_nn;
		}
		
		return prev;
	}

	private static Node reverse(Node head) {  //Data Iterative
    	 Node temp = head;
         int len=0;
        
         while (temp != null) {
             
             temp = temp.next;
             len++; // Increment len while iterating
         }
    	
		int li=0;
		int ri=len-1;
		
	while(li<ri) {
		Node left=getNodeAt(head,li);
		Node right=getNodeAt(head, ri);
		int te=left.data;
		left.data=right.data;
		right.data=te;
		
		li++;
		ri--;
		
	}
	return head;
	}

    //part of reverse ll
    private static Node getNodeAt(Node head,int idx) {
    	Node temp=head;
    	for(int i=0;i<idx;i++) {
    		temp=temp.next;
    	}
    	return temp;//total node
    	
    }
    
    
	private static Node removelast(Node head) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) { // If there's only one element
            head = null;
            
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) { // Traverse to the second last node
            temp = temp.next;
        }
        temp.next = null; // Remove the last node

         // Decrement len

        return head;
    }


	private static Node addAtIndex(Node head, int val,int idx) {
    	 Node temp = head;
         int len=0;
         Node temp2 = head;
         Node nn=new Node(val);
         while (temp != null) {
             
             temp = temp.next;
             len++; // Increment len while iterating
         }
         
         if (idx < 0 || idx > len) {
             return null;
         }
         if(idx==0) {
        	 addFirst(head, val);
         }
         else {
        	 for (int i = 0; i < idx-1; i++) {
                 temp2 = temp2.next;
             }
        	nn.next=temp2.next;
        	 
        	 temp2.next=nn;
            
         }
return head;
        
	}

	private static Node addFirst(Node head,int k) {
    	Node nn=new Node(k);
    	if(head==null) {
			
			return nn;
		}
    	nn.next=head;
    	head=nn;
		
		
		return head;
	}

	private static int getAt(Node head, int pos) {
        Node temp = head;
        int len=0;
        Node temp2 = head;
        while (temp != null) {
            
            temp = temp.next;
            len++; // Increment len while iterating
        }
        
        if (pos < 0 || pos >= len) {
            return -1;
        }

        for (int i = 0; i < pos; i++) {
            temp2 = temp2.next;
        }

        return temp2.data;
    }

    private static int getLast(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    private static int getFirst(Node head) {
        return head.data;
    }

    private static Node removeFirst(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        return head.next;
    }

    private static void print(Node head) {
        Node temp = head;
       int  len = 0; // Reset len to 0 before printing

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            len++; // Increment len while iterating
        }
      
        System.out.println();
    }

    private static Node takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null;
        Node tail = null;

        while (data != -1) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            data = sc.nextInt();
        }

        return head;
    }
}
