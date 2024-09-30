package Datatypes;
import java.io.*;
import java.util.Scanner;
//import java.io.DataInputStream;

public class read_data_from_keyboard {
	
	
	public static void main(String[] args) throws IOException {
//		DataInputStream in=new DataInputStream(System.in);
//		
//		int intNumber=0;
//		float floatNumber=0.0f;
//		
//		try {
//			System.out.println("Enter an Integer:");
//			intNumber=Integer.parseInt(in.readLine());
//			System.out.println("Enter FloatNumber:");
//			floatNumber=Float.valueOf(in.readLine()).floatValue();
//		}
//		catch(Exception e) {
//			System.out.println("Error: Input: "+ e);
//			
//		}
//		
//		System.out.println("Int NumBER:"+intNumber);
//		System.out.println("FloatNum:"+floatNumber);
		
		//1. Use System.Console class.
//		System.out.println("What is your name ?:");
//		String name=System.console().readLine();
//		System.out.println("Your name is: "+name);
		
//	1. System.console().readLine();  ->>  System.Console().readLine() it doesn't work as C 
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.Console.readLine()" because the return value of "java.lang.System.console()" is null
//				at BeastMode/Datatypes.read_data_from_keyboard.main(read_data_from_keyboard.java:30)

		
	// 2. Scanner class
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		System.out.println("Entered String is : "+s);
		
		/*
		 * Some different functions of Scanner class are: 
		 * public String next() -> it finds and returns the next complete token from the scanner
		 * public String nextLine() -> it moves the scanner position to next line and returns input as a string
		 * public byte nextByte() -> it scans the next tooken as a byte
		 * public short nextShort()-> it scans the next token as  a byte
		 * public int nextInt()-> ::
		 * public long nextLong()
		 * public float nextFloat()
		 * public double nextDouble()
		 * 
		 * ==IMP=
		 * if the input is a blank line then the next() function will skip the blank line; 
		 * while nextLine() will read the line as an empty string "". 
		 * 
		 * To read one word next() function is preferred.
		 * 
		 * 
		 * */
		
	/*	3. Use BufferedReader class.
	The java.io package contains BufferedReader class that takes input as an argument that is an object 
	of InputStreamReader.
	  
	  first import the java.io package. Then create the instance of inputStreamReader class with System.in as parameter that
	  indicates default input device is the keyboard. 
	  
	  Then create the instance of BufferReder class. 
	  Use the readLine() of BufferReader class that treats the input as a string. To convert the String to integer we use
	  the wrapper class integer's parseInt function. 
	  This readLine() function may generate a runtime IOException. 
	  so, we write the code in try-catch block.
	  
	  
		*/
		
		//create BufferedReader class object.
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		try {
			String input=br.readLine(); //reads the line of text as a string.
			int n=Integer.parseInt(input);//convert the string to integer.
			System.out.println("square is:"+ n*n);
			
		}
		catch(IOException ioe) {
			System.out.println("Input Error "+ioe);
			
		}
		
		br.close();
		
	}

}
