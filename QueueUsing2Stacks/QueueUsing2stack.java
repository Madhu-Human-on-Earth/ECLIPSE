package QueueUsing2Stacks;

import java.util.Stack;

public class QueueUsing2stack {
	
	
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	
	
	public QueueUsing2stack() {
		stack1=new Stack<Integer>();
		stack2=new Stack<Integer>();	
	}
	
	public void enqueue(int data)
	{
		stack1.push(data);
	}
	
	public int dequeue() {
		if(stack1.isEmpty() && stack2.isEmpty())
		{
			throw new RuntimeException("Queue is empty");
		}
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	public int peek()
	{
		if(stack1.isEmpty() && stack2.isEmpty())
		{
			throw new RuntimeException("Queue is Empty");
		}
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}
	
	public boolean isEmpty()
	{
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public int size()
	{
		return stack1.size()+stack2.size();
	}

}
