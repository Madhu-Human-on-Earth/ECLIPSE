package stack;

import java.util.Stack;

public class stackBasic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};
        stack.push(5);
        stack.push(10);

      System.out.println(arr[stack.pop()]);
    }
}
