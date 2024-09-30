package stack;

import LL.Node;

public class StackUsingLL<t> {

	private Node<t> head;
	private int size;
	private Node<t> tail;
	
	public StackUsingLL()
	{
		head=null;
		size=0;
	}
	
	public int size()
	{
		return size;
		
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	//pushing happening at the begining of the LL
	public void push(t elem)
	{
		Node<t> newNode=new Node<t>(elem);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	public t top() throws StackEmptyException
	{
		if(head==null)
		{
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public t pop() throws  StackEmptyException{
		if(head==null)
		{
			throw new StackEmptyException();
			
		}
		//since we are pushing data in the front so the so we must remove the data from the front itself
	
	t temp=head.data;
	head=head.next;
	size--;
	return temp;
	}
	
}
