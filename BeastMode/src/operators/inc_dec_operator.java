package operators;

public class inc_dec_operator {
	public static void main(String[] args) {
		/*
		 * 1. m=5, y=++m--> now, m=6,y=6
		 * here prefix: it first adds 1 to the operand and then the result is assigned to the variable on left.
		 * 
		 * 2. m=5, y=m++; --> m=6, y=5;
		 * here postfix: it first assigns the value to the variable on left and then increment the operands. 
		 * 
		 * */
		
		int m=10, n=20;
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println("++m="+ ++m);
		System.out.println("n++="+ n++);
		System.out.println("m="+m);
		System.out.println("n="+n);
		
		float sum;
		int i;
		sum=0.0f;
		 
		for(i=1;i<=10;i++) {
			sum=sum+1/(float)i;
			System.out.print("i= "+i);
			System.out.print("sum= "+sum);
			System.out.println();
		}
		
	}

}
