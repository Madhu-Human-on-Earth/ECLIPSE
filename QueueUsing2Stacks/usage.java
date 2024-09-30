package QueueUsing2Stacks;

public class usage {
	public static void main(String[] args) {
	    QueueUsing2stack queue = new QueueUsing2stack();

	    queue.enqueue(1);
	    queue.enqueue(2);
	    queue.enqueue(3);

	    System.out.println("Peek: " + queue.peek()); // Output: Peek: 1

	    System.out.println("Dequeue: " + queue.dequeue()); // Output: Dequeue: 1

	    System.out.println("Peek: " + queue.peek()); // Output: Peek: 2

	    System.out.println("Size: " + queue.size()); // Output: Size: 2

	    System.out.println("Is empty: " + queue.isEmpty()); // Output: Is empty: false
	}

}
