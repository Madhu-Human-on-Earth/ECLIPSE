package decisionmaing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringSwitch {
	public static void main(String[] args) {
		
		String choice=new String();
		InputStreamReader isr=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("CHOOSE DIVISION: ");
		
		System.out.println("HONORS");
		System.out.println("FIRST");
		System.out.println("SECOND");
		System.out.println("THIRD");
		System.out.println("WAITING..");
		
		System.out.println("CHOOSE DIVISION:");
		
		try {
			choice=br.readLine();
			System.out.flush();
			
			switch(choice) {
			case "HONORS":
				System.out.println("MARKS >=80%");
				break;
			case "FIRST":
				System.out.println("MARKS >=65% AND <80%");
			case "SECOND":
				System.out.println("MARKS >=55% AND <65%");
			case "THIRD":
				System.out.println("MARKS >=40% AND <55%");
			case "WAITING":
				System.out.println("MARKS < 40%");
			break;
			default:
				System.out.println("INVALID CHOICE:");


				
			}
		}

		catch (Exception e) {
			System.out.println("I/O Errors:");
		}


		
		
		
	}

}
