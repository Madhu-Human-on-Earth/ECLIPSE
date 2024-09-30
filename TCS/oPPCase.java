package TCS;

public class oPPCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String input = "Hello World! This is a Test String.";
		  
		  String oppcase=convertoppcase(input);
		  System.out.println(oppcase);
		  
		  String[] a=input.split(" ");
		  System.out.println(a.length);

	}

	private static String convertoppcase(String input) {
		StringBuilder res=new StringBuilder();
		
		for(char ch:input.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				res.append(Character.toLowerCase(ch));
			}
			
			else if(Character.isLowerCase(ch)) {
				res.append(Character.toUpperCase(ch));
			}
			else {
				res.append(ch);
			}
		}
		return res.toString();
	}

}
