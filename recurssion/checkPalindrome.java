package recurssion;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="";


System.out.println(pal(s));
	}

	private static boolean pal(String s) {
		
		if(s.length()<=1)
		{
			return true;
		}
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			return pal(s.substring(1,s.length()-1));
		}
		return false;
	}

}
