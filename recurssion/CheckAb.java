package recurssion;
//a. The string begins with an 'a'
//b. Each 'a' is followed by nothing or an 'a' or "bb"
//c. Each "bb" is followed by nothing or an 'a'


public class CheckAb {

	public static void main(String[] args) {
		String s="abb";
		System.out.println(sjd(s));
	}

	private static boolean sjd(String s) {
		if(s.length()==0)
		{
			return true;
		}
		if(s.charAt(0)=='a')
		{
			if(s.substring(1).length()>1 && s.substring(1,3).equals("bb"))
			{
				return sjd(s.substring(3));
			}
			else {
				return sjd(s.substring(1));
			}
		}
		return false;
	}
}
