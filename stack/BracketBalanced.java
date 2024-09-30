package stack;

import java.util.Stack;

public class BracketBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="()()(()";
System.out.println(Isbalanced(s));
	}

	private static boolean Isbalanced(String s) {
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			
		
			if(s.charAt(i)=='(' || s.charAt(i)=='{')
			{
				stack.push(s.charAt(i));
			}
			
			else if(s.charAt(i)==')' || s.charAt(i)=='}')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				
				if(s.charAt(i)==')')
				{
				if(stack.peek()=='(')
				{
					stack.pop();
				}
				
				else {
					return false;
				}
				}
				
				if(s.charAt(i)=='{')
				{
					if(stack.peek()=='}')
					{
						stack.pop();
					}
					else {
						return false;
					}
				}
				
				
		}
			else {
				
			}
			
	}
	
	if(stack.isEmpty())
	{
		return true;
	}
	else {
		return false;
	}
	
	
}
}


