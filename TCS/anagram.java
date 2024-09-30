package TCS;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str1 = "listen";
	     String str2 = "silent";
	     
	     boolean res=are_anagramms(str1,str2);
	     if(res) {
	    	 System.out.println("YES");
	     }
	     else {
	    	 System.out.println("NO");
	     }
	        

	}

	private static boolean are_anagramms(String str1, String str2) {
		// TODO Auto-generated method stub
		   if(str1.length()!=str2.length()) {
			   return false;
		   }
		   
		   char[] a1=str1.toCharArray();
		   char[] a2=str2.toCharArray();
		   
		   Arrays.sort(a1);
		   Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
	}

}
