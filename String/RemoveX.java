package String;

public class RemoveX {

	public static void main(String[] args) {

		String s="xaxb";
		System.out.println(remove(s,'x'));
	}

	private static String remove(String s, char string) {
	
		if(s.length()==0)
		{
			return s;
		}
		
		String sde=remove(s.substring(1),string);
		if(s.charAt(0)=='x')
		{
			return sde;
		}
		else {
			return s.charAt(0)+sde;
		}
	}

}
