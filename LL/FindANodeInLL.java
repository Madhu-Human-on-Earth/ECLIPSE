package LL;

import java.util.Scanner;

public class FindANodeInLL {
	
public static void main(String[] args) {
	Node<Integer> head=takeiNp();
	
	
	
	//	inc(head);
	int index=	FindPos(head, 6);
	System.out.println(index);
}



private static int FindPos(Node<Integer> head, int pos) {
	if(head==null)
	{
		return -1;
	}
	int c=0;
	while(head!=null)
	{
		
		if(head.data==pos)
		{
			return c;
		}
		c++;
		head=head.next;
	}
	
	return -1;
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
