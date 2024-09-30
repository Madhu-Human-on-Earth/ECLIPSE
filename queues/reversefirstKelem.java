package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversefirstKelem {

    public static void main(String[] args) {
        Queue<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        int k = 3;
        Queue<Integer> output = reverseFirstKElements(input, k);

        System.out.println("Input queue after removing first " + k + " elements:");
        while (!input.isEmpty()) {
            System.out.print(input.poll() + " ");
        }
        System.out.println();

        System.out.println("Output queue after removing first " + k + " elements and reversing:");
        while (!output.isEmpty()) {
            System.out.print(output.poll() + " ");
        }
        System.out.println();
    }

    public static Queue<Integer> reverseFirstKElements(Queue<Integer> input, int k) {
        if (input.isEmpty() || k > input.size()) {
            return input;
        }
        if (k <= 0) {
            return input;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(input.poll());
        }
        while (!stack.isEmpty()) {
            input.add(stack.pop());
        }
        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.poll());
        }
        return input;
    }
}
