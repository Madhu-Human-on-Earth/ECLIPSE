package String;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcdcba";
Boolean rev=reve(str);
System.out.println(rev);
	}

	private static Boolean reve(String str) {
		
		int l=0;
		int r=str.length()-1;
		while(l<r)
		{
			if(str.charAt(l)!=str.charAt(r))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

//	private static boolean reve(String str) {
//		String fd="";
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			fd+=str.charAt(i);
//		}
//		if(str.equals(fd)) {
//			return true;
//		}
//		return false;
//	}

}
