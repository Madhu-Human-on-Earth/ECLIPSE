package decisionmaing;

public class nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=325, b=712, c=478;
		
		int lar=Math.max(a, Math.max(b, c));
		System.out.print(lar);
		
		System.out.println(" LARGEST VALUE:");
		
		if(a>b) {
			if(a>c) {
				System.out.println("LARGEST : "+ a);
			}
			else {
				System.out.println("LARGEST IS: "+c);
			}
		}
		else {
			if(c>b) {
				System.out.println("LARGEST IS: "+c);
			}
			else {
				System.out.println("LARGEST IS: "+b);
			}
		}

	}

}
