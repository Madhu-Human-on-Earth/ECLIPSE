package queues;

public class queue_use {
	public static void main(String[] args) {
	    QueueUsingArray queue = new QueueUsingArray(5);

	    try {
	        // Adding elements to the queue
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        // Printing the front element of the queue
	        System.out.println("Front element is: " + queue.front());

	        // Removing elements from the queue
	        System.out.println(queue.dequeue() + " dequeued from the queue");
	        System.out.println(queue.dequeue() + " dequeued from the queue");

	        // Printing the front element of the queue after removing elements
	        System.out.println("Front element is: " + queue.front());

	        // Adding more elements to the queue
	        queue.enqueue(40);
	        queue.enqueue(50);

	        // Printing the size of the queue
	        System.out.println("Queue size is: " + queue.size());

	        // Removing elements from the queue
	        System.out.println(queue.dequeue() + " dequeued from the queue");
	        System.out.println(queue.dequeue() + " dequeued from the queue");

	        // Printing the size of the queue after removing elements
	        System.out.println("Queue size is: " + queue.size());
	    } catch (QueueFullException e) {
	        System.out.println("Queue is full!");
	    } catch (QueueEmptyException e) {
	        System.out.println("Queue is empty!");
	    }
	}

}
