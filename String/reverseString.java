package String;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcde";
		String rv=reversed(str);
		System.out.println(rv);

	}

	private static String reversed(String str) {
		String reve="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reve+=str.charAt(i);
		}
//		for(int i=0;i<str.length();i++)
//		{
//			reve+=str.charAt(i);
//		}
		return reve;
		
	}

}
