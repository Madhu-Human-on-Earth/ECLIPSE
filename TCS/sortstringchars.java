package TCS;

import java.util.Arrays;

public class sortstringchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		
		char[] a=s.toCharArray();
		Arrays.sort(a);
		
		
      // Convert the sorted character array back to a string

		String res=new String(a);
		
		System.out.println(res);
		

	}

}
