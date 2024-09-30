package LL;

import java.util.Scanner;

public class AddlastNtoFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head=takeiNp();
	
		
		//	inc(head);
		head=AddLastN(head, 3);
		print(head);
	}

	private static void print(Node<Integer> head) {
		// TODO Auto-generated method stub
		  Node<Integer> temp=head;
		     while(temp!=null)
		     {
		    	 System.out.println(temp.data);
		    	 temp=temp.next;
		     }
	System.out.println();
		
	}

	private static Node<Integer> AddLastN(Node<Integer> head, int pos) {
		
		if(head==null || pos==0)
		{
			return head;
		}
		Node<Integer> temp=head;
		int len=0;
		while(temp!=null)
		{
			len++;
			temp=temp.next;
		}
		
		pos=pos%len;
		if(pos==0)
		{
			return head;
		}
		temp=head;
		
		for(int i=1;i<len-pos;i++)
		{
			temp=temp.next;
		}
		Node<Integer> nn=temp.next;
		
		temp.next=null;
		temp=nn;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		return nn;
		
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
