package recurssion;

public class removeduplicatechars {
//remove duplicates consecutaviely..
	public static void main(String[] args) {

		String s="xxxyyyzwwzzzx";
		System.out.println(redupchar(s));
	}

	private static String redupchar(String s) {
		
		if(s.length()<=1)
		{
			return s;
			
		}
		if(s.charAt(0)==s.charAt(1))
		{
			return redupchar(s.substring(1));
			
		}
		else {
			return s.charAt(0)+redupchar(s.substring(1));
		}
	}

}
