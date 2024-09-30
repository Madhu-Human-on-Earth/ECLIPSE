package LL;

import java.util.Scanner;

public class FindANodeRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeiNp();
		
		
		
		//	inc(head);
		int index=	FindPos(head, 2020);
		System.out.println(index);
	}
	
	private static int FindPos(Node<Integer> head, int ele) {
		if(head==null)
		{
			return -1;
		}
		if(head.data.equals(ele))
		{
			return 0;
		}
	
		int sol=FindPos(head.next, ele);
		if(sol==-1)
		{
			return -1;
		}
		return sol+1;
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
