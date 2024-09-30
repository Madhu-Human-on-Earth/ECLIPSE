package stack;

import java.util.Scanner;
import java.util.Stack;

public class printsameinputinstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        Stack<Integer> stack = new Stack<>();
	        Stack<Integer> helper = new Stack<>();

	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt();
	            stack.push(x);
	        }
	        
	        reverseStack(stack,helper);
	       

	}

	private static void reverseStack(Stack<Integer> input, Stack<Integer> helper) {

		if(input.size() <=1)
		{
			return ;
		}
		int top=input.pop();
		
		reverseStack(input, helper);
		
		while(!input.isEmpty())
		{
			helper.push(input.pop());
		}
		
		input.push(top);
		
		while(!helper.isEmpty())
		{
			input.push(helper.pop());
		}

		while(!input.isEmpty())
		{
			System.out.print(input.peek()+" ");
			input.pop();
		}
		
		
	}

}
