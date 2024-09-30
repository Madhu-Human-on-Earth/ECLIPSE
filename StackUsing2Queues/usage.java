package StackUsing2Queues;

public class usage {
	public static void main(String[] args) {
	    StackQueu stack = new StackQueu();
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    System.out.println("Top element: " + stack.top());
	    System.out.println("Size: " + stack.getSize());
	    System.out.println("Pop: " + stack.pop());
	    System.out.println("Pop: " + stack.pop());
	    System.out.println("Top element: " + stack.top());
	    System.out.println("Size: " + stack.getSize());
	    stack.push(40);
	    System.out.println("Top element: " + stack.top());
	    System.out.println("Size: " + stack.getSize());
	}

}

