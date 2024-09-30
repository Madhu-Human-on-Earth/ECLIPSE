package LL_pep;

import java.util.LinkedList;

public class LL_Stack_adaptar {

    public static class LLToStackAdapter {
        LinkedList<Integer> list;

        public LLToStackAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addFirst(val);
        }

        int pop() {
            if (size() == 0) {
                return -1;
            } else {
                return list.removeFirst();
            }
        }
        int top() {
        	if(size()==0) {
        		return -1;
        	}else {
        		return list.getFirst();
        	}
        }

        void addFirst(int k) {
            list.addFirst(k);
        }

        int getFirst() {
            if (size() == 0) {
                return -1;
            } else {
                return list.getFirst();
            }
        }

        void removeFirst() {
            if (size() > 0) {
                list.removeFirst();
            }
        }
    }

    public static void main(String[] args) {
        LLToStackAdapter stack = new LLToStackAdapter();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.pop()); // Output: 1
        System.out.println(stack.pop()); // Output: -1 (Empty stack)

        stack.addFirst(10);
        stack.addFirst(20);

        System.out.println(stack.getFirst()); // Output: 20

        stack.removeFirst();
        System.out.println(stack.getFirst()); // Output: 10
    }
}
