package LL;

import java.util.Scanner;

public class DeleteaNoDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head=takeiNp();
		
		
		
	//	inc(head);
	head=	DEltparpos(head, 2);
	print(head);
	}
	private static void print(Node<Integer> head) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			  Node<Integer> temp=head;
			     while(temp!=null)
			     {
			    	 System.out.println(temp.data);
			    	 temp=temp.next;
			     }
		System.out.println();
			
		
	}
	private static Node<Integer> DEltparpos(Node<Integer> head, int pos) {
		if(head==null)
		{
			return head;
		}
		if(pos==0)
		{
			return head.next;
		}
		int c=0;
		Node<Integer> prev=head;
		while(c<pos-1 && prev!=null)
		{
			
			prev=prev.next;
			c++;
		}
		if(prev==null && prev.next==null)
		{
			return head;
		}
		prev.next=prev.next.next;
		return head;
	}

	

	
	private static Node<Integer> takeiNp() {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		while(data!=-1)
		{
			Node<Integer> cn=new Node<Integer>(data);
			
			if(head==null)
			{
				head=cn;
			}
			else {
				Node<Integer> temp=head;
			while(temp.next!=null)
				{
					//System.out.print(temp.data+" ");
					temp=temp.next;
				}
				temp.next=cn;
			}
			data=sc.nextInt();
	}
		return head;
		
	
	}
	

	}


