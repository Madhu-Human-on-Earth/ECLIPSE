package queueusingLL;

public class QueueUse {
	public static void main(String[] args) {
	    QueueUsingLL q = new QueueUsingLL();

	    // Enqueue some elements
	    q.enqueue(10);
	    q.enqueue(20);
	    q.enqueue(30);

	    // Dequeue elements and print them
	    while (!q.isEmpty()) {
	        System.out.println(q.dequeue());
	    }

	    // Enqueue some more elements
	    q.enqueue(40);
	    q.enqueue(50);

	    // Print the front element of the queue
	    System.out.println("Front element: " + q.front());
	}

}
