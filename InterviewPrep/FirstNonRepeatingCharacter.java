package InterviewPrep;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s="abacabad";
		System.out.println(solution(s));
	}
	private static char solution(String s) {
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(s.indexOf(arr[i])==s.lastIndexOf(arr[i]))
			{
				return arr[i];
			}
		}
		return '_';
	}
}

//	private static char solution(String s) {
//		
//		char[] arr=s.toCharArray();
//	HashMap<Character,Integer> map=new HashMap<>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(map.containsKey(arr[i]))
//			{
//				map.put(arr[i],map.get(arr[i])+1);
//			}
//			else {
//				map.put(arr[i], 1);
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(map.get(arr[i])==1)
//			{
//				return arr[i];
//			}
//		}
//		
//		
//		
//		return '_';
//		
//	}
//
//}

//For s = "abacabad", the output should be
//solution(s) = 'c'.
//There are 2 non-repeating characters in the string:
//	'c' and 'd'. Return c