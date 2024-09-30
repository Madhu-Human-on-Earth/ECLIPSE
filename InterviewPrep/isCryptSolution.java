package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class isCryptSolution {

	public static void main(String[] args) {
		String[] crypt=new String[] {"ONE","ONE","TWO"};
         char[][] solution=new char[][] {
        	 {'O', '0'},
             {'T', '1'},
             {'W', '2'},
             {'E', '5'},
             {'N', '3'} 
         };
         System.out.println(isCryptSolution(crypt,solution));
	}

	private static boolean isCryptSolution(String[] crypt, char[][] solution) {
		
		Map<Character,Integer> map=new HashMap<>();
		for(char[] c:solution)
		{
			map.put(c[0],c[1]-'0');
		}
		
		long[] nums=new long[3];
		for(int i=0;i<3;i++)
		{
			String word=crypt[i];
			if(word.length()>1 && map.get(word.charAt(0))==0)
			{
				return false;
			}
			long num=0;
			for(char c:word.toCharArray())
{
	num=num*10+map.get(c);
}
			nums[i]=num;
		}
		return nums[0]+nums[1]==nums[2];
	}

}
