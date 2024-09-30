package priorityqueue;

import java.util.PriorityQueue;
import java.util.*;


public class baisc {
public static void main(String[] args) {
	

	//By default it is min heap;
	PriorityQueue<Integer> pqueue=new PriorityQueue<>(10);
//	pqueue.add(100);
//	pqueue.add(15);
//	pqueue.add(20);
//	
//	System.out.println(pqueue.peek());
//	System.out.println(pqueue.poll());
//	System.out.println(pqueue.peek());
	
//	for(int i=0;i<3;i++) {
//		pqueue.add(i);
//		pqueue.add(1);
//	}
	
//	pqueue.add("Geeks");
//	pqueue.add("FOR");
//	pqueue.add("GEEKS");
//	 System.out.println("Initial PriorityQueue ");
//	 
//	System.out.println(pqueue);
//	
//	
//	pqueue.remove("GEEKS");
//	System.out.println(pqueue);
//
//	pqueue.poll();
//
//	
//	System.out.println(pqueue);

	//iterator
//	 pqueue.add("Geeks");
//     pqueue.add("For");
//     pqueue.add("Geeks");
//     
//     Iterator iterator=pqueue.iterator();
//     
//     while(iterator.hasNext()) {
//    	 System.out.println(iterator.next()+" ");
//     }
//     
	
	
     pqueue.add(1);
     pqueue.add(2);
     pqueue.add(5);
     pqueue.add(4);
     
     System.out.println("Priority queue: " + pqueue);
     
     //peek
     System.out.println("peek queue: " + pqueue.peek());
     
     //remove the top ele of thr queue
     pqueue.poll();
     
     System.out.println("Priority queue: " + pqueue);
     // Check if the queue contains a specific element
     System.out.println("Does the queue contain 3? " + pqueue.contains(3));
     
     // Get the size of the queue

     System.out.println(pqueue.size());
     
     // Remove all elements from the queue

     pqueue.clear();
     
     //check if queue is empty
     
     System.out.println(pqueue.isEmpty());

     
     

     
	
	
}
}
