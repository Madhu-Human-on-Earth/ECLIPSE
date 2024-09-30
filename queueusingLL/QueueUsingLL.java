package queueusingLL;

import java.util.Queue;

class Node{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class QueueUsingLL {

	private Node front;
	private Node rear;
	private int size;
	
	public QueueUsingLL()
	{
		front=null;
		rear=null;
		size=0;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void enqueue(int data)
	{
		Node nn=new Node(data);
		if(front==null)
		{
			front=nn;
			rear=nn;
			
		}
		else {
			rear.next=nn;
			
			rear=nn;
		}
		size++;
		
		
	}
	
	public int dequeue()
	{
		if(front!=null)
		{
			int temp=front.data;
			front=front.next;
			size=size-1;
			return temp;
		}
		else {
			return -1;
		}
	}
	
	public int front()
	{
		if(front!=null)
		{
			return front.data;
		}
		else {
			return -1;
		}
	}
	
	
	
	
	
	
	
}
