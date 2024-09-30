package TCS;

//import java.util.PriorityQueue;
import java.util.*;
public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//MIN_HEAP (BY DEFAULT)_>ELE ARE SORTED IN ASC ORDER ..SAMLL TO BIG
		
		 // Create a min-heap PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(15);
        minHeap.add(5);
        
        System.out.println(minHeap);
        
        //MIN_ELE-> top ele
        System.out.println(minHeap.peek());
        
        //poll().. removes and returns the head of ele
        System.out.println(minHeap.poll());
		
		
*/
		
		
		//MAX_HEAP  -> USE CUSTOM OPERATOR ::
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
		
		 // Add elements to the PriorityQueue
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(15);
        maxHeap.add(5);
		
        
        // Display the PriorityQueue
        System.out.println(maxHeap);
        
        // Remove and return the head of the PriorityQueue

        System.out.println(maxHeap.poll());
        

        // Display the PriorityQueue after removal
        System.out.println("Max-Heap after removal: " + maxHeap);

        // Peek the head of the PriorityQueue without removing it
        System.out.println("Head of the Max-Heap: " + maxHeap.peek());

        // Display the PriorityQueue
        System.out.println("Max-Heap: " + maxHeap);
        
		
		
	}

}
