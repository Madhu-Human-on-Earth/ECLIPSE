package recurssion;

public class fibonacciseries {

	public static void main(String[] args) {

		        int n = 10; // change this number to adjust how many terms to print
		        int a = 0, b = 1;

		        System.out.print("Fibonacci series up to " + n + " terms: ");

		        for (int i = 1; i <= n; ++i) {
		            System.out.print(a + " ");

		            int sum = a + b;
		            a = b;
		            b = sum;
		        }
		    }

	
		
//		if(i==0 || i==1)
//		{
//			return 1;
//		}
//		return fibonacci(i-1)+fibonacci(i-2);
		
	
	

}
