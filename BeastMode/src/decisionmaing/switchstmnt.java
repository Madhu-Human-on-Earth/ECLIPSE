package decisionmaing;

public class switchstmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char choice;
		System.out.println("Select Your Choice:");
		System.out.println("M-> MATHS");
		System.out.println("B-> BORDER");
		System.out.println("C-> CHEMIST");
		
		System.out.println("CHoice->>>");
		System.out.flush();//clears the output stream after writing the left over bytes (if any):
		
		try {
			switch(choice=(char) System.in.read()) {
			case 'M':
			case 'm':System.out.println("MATHS: STATISTICS:");
			break;
			case 'B':
				case 'b':System.out.println("BORDER: Y THIS");
				break;
				
				case 'C':
					case 'c':System.out.println("CHEMIST LEARN THRM");
				break;
			
			default:System.out.println("INVALID CHOICE");
				
			
			
			}
		}
		catch(Exception e) {
			System.out.println("error");
			
		}

	}

}
