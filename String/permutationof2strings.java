package String;

import java.util.Arrays;

public class permutationof2strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 ="abc";
String s2="cdb";

Boolean s=isperu(s1,s2);
 System.err.println(s);
	}

	private static Boolean isperu(String s1, String s2) {
		if(s1.length()!=s2.length())
		{
			return false;
		}
		return sort(s1).equals(sort(s2));
	}

	private static Object sort(String s1) {
		
		char[] com=s1.toCharArray();
		Arrays.sort(com); 
		return Arrays.toString(com);
	}

}
