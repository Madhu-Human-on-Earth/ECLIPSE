package operators;

public class floatingpoint_arithmetic {
	
	public static void main(String[] args) {
		float a=20.5F,b=6.4F;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Mixed Mode arithmetic
		// when one of the operands is real and other is integer, it is called: mixed-mode arithmetic exp;
		// if either operands is of the real type, then the operand is converted to real and real arithmetic is performed.
		//  15/10.0=1.5
		//  15/10=1
		//  15.2/10=1.52
		
		System.out.println(15.2/10);
		
	}
	


}
