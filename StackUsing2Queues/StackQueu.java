package StackUsing2Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueu {

private Queue<Integer>q1;
private Queue<Integer>q2;

private int size;


public StackQueu()
{
	q1=new LinkedList<Integer>();
	q2=new LinkedList<Integer>();
	size=0;
}

public int getSize()
{
	return size;
}

public boolean isEmpty() {
	return size==0;
}
public void push(int ele) {
	q1.add(ele);
	size=size+1;
}

public int pop() {
	if(!q1.isEmpty())
	{
		return -1;
	}
	
	while(q1.size()>1)
	{
		q2.add(q1.remove());
	}
	int top=q1.remove();
	
	while(!q2.isEmpty())
	{
		q1.add(q2.remove());
	}
	size=size-1;
	return top;
}

public int top()
{
	if(q1.isEmpty())
	{
		return -1;
		
	}
	
	while(q1.size()>1)
	{
		q2.add(q1.remove());
	}
	int top=q1.peek();
	q2.add(q1.remove());
	
	while(!q2.isEmpty())
	{
		q1.add(q2.remove());
	}
	return top;
}
	
}
