package LL_pep;
import java.util.LinkedList;

public class LL_Queue_adapter {

    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

    void add(int val) {
    	list.addLast(val);
    }
    int remove() {
    	if(list.size()==0) {
    		return -1;
    	}
    	else {
    		return list.removeFirst();
    	}
    }
    
    int peek() {
    	if(size()==0) {
    		return -1;
    	}
    	else {
    		return list.getFirst();
    	}
    }
    
    }

    public static void main(String[] args) {
        LLToQueueAdapter queue = new LLToQueueAdapter();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.remove()); // Output: 1
        System.out.println(queue.remove()); // Output: 2

        queue.add(4);
        System.out.println(queue.remove()); // Output: 3

        System.out.println(queue.peek()); // Output: 4
        System.out.println(queue.remove()); // Output: 4
        System.out.println(queue.remove()); // Output: -1 (Empty queue)
    }
}
