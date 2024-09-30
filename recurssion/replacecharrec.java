package recurssion;

public class replacecharrec {

	public static void main(String[] args) {

		String s="abacd";
		System.out.println(repchar(s,'a','x'));
		
	}

	private static String repchar(String s, char c, char d) {
		
		if(s.length()==0)
		{
			return s;
		}
		String sde=repchar(s.substring(1),c,d);
		if(s.charAt(0)==c)
		{
			return d+sde;
		}
		else {
			return s.charAt(0)+sde;
		}
		
	}

}
