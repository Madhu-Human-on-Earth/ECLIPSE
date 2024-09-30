package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseStack {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt();
	            stack.push(x);
	        }

	        while (!stack.empty()) {
	            System.out.print(stack.peek() + " ");
	            stack.pop();
	        }
	    }
	}
