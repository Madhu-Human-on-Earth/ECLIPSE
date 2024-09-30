package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseAqueue {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println("Original Queue:: "+ queue);
		
reverse(queue);
		System.out.println("Reversed Queue::"+ queue);

	}

	private static void reverse(Queue<Integer> queue) {
		Stack<Integer> stack=new Stack<Integer>();
		while(!queue.isEmpty())
		{
			stack.push(queue.remove());
		}
		
		while(!stack.isEmpty())
		{
			queue.add(stack.pop());
		}

}
}
