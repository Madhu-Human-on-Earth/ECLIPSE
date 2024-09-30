//package priorityqueue;
//import java.util.Collections;
//import java.util.PriorityQueue;
//
//public class Klargeerelemnts {
//    public static void main(String[] args) {
//        int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
//        int k = 4;
//        ksol(arr, k);
//    }
//
//    private static void ksol(int[] arr, int k) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//
//        for (int i = 0; i < arr.length; i++) {
//            pq.offer(arr[i]);
//        }
//
//        while (k > 0) {
//            System.out.println(pq.poll());
//            k--;
//        }
//    }
//}

package priorityqueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Klargeerelemnts {
public static void main(String[] args) {
	int[] arr= {10101,565,4921,60};
	int k=2;
	ksol(arr,k);
//	System.out.println(j);
	
}


//12
//16
//20
//25




private static  void ksol(int[] arr, int k) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	
	for(int i=0;i<arr.length;i++) {
		pq.offer(arr[i]);
	}
	System.out.println(pq);
	System.out.println(pq.size());
	while(pq.size()>k) {
		pq.poll();
	}
	
	System.out.println(pq.peek());
	
	
	
	
	
	}
	
	
	

}
