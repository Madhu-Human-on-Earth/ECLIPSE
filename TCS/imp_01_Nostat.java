package TCS;

public class imp_01_Nostat {
	
	public static void main(String[] args) {
	
	
 
//	The main method needs to be static because it is the entry point of the program, and it is called by the Java Virtual Machine (JVM) before any objects of the class are created.
	
//	public static  int main(String[] args) {
//		System.out.println("Hell0 world..");
//		return 1;
//	}
//	
//It must return void and not an int. Changing the return type to int will result in a compilation error because the JVM 
//looks for the void return type for the main method
	
	
	//multiple main mtds:
	
	//When you run a Java program, the JVM looks for this exact method signature to start execution.(public static void main(String[] args) 
	//Overloaded main methods with different parameter types or different return types 
	//will not be automatically invoked by the JVM. They can be invoked manually within the code, 
	//but they are not entry points for the program.
	
//	public static void main(String[] args) {
//		System.out.println("Hello");
//		main(33);
//		main("Hel");
//	}
//	public static void main(int args) {
//		System.out.println("INT");
//	}
//	
//	public static void main(String args) {
//		System.out.println("STRIMG");
//		
//	}
	
	/*
	//Multiple catch blocks with single try  block
	
	int y=10/0;
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	
	try {
		System.out.println("DIVISIBLE "+y);
	}

	catch (Exception e) {
		e.printStackTrace();
		
*/
		
	
//		try block with multiple catch blocks

		
	/*try {
		
		int[] arr= {1,2,3};
		
		System.out.println(arr[10]);
		
		String text=null;
		System.out.println(text.length());
		
	}
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
	}
		
	catch(NullPointerException e) {
		System.out.println("NullPointerException "+e.getMessage());
		
	}
	
	catch(Exception e) {
		System.out.println("generic Exception"+ e.getMessage());
	}
	
	finally {
		System.out.println("This Block Is Always Executed");
	}
	*/
		
		 try {
	            // First try-catch-finally block
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[10]);  // This will throw ArrayIndexOutOfBoundsException
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught an ArrayIndexOutOfBoundsException in the first try block: " + e.getMessage());
	        } 
	        finally {
	            System.out.println("First finally block executed.");
	        }

	        try {
	            // Second try-catch-finally block
	            String text = null;
	            System.out.println(text.length());  // This will throw NullPointerException
	        } 
	        catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException in the second try block: " + e.getMessage());
	        } 
	        finally {
	            System.out.println("Second finally block executed.");
	        }

	        try {
	            // Third try-catch-finally block
	            int result = 10 / 0;  // This will throw ArithmeticException
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Caught an ArithmeticException in the third try block: " + e.getMessage());
	        } 
	        finally {
	            System.out.println("Third finally block executed.");
	        }
		
}


}
