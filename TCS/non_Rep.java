package TCS;

import java.util.HashMap;

public class non_Rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is a test string with some words of different lengths";
		
		
		
		String[] words=s.split(" ");
		String samllest=findsmallest(words);
		String largest=largestwords(words);
		
		System.out.println(samllest);
		System.out.println(largest);
		
		char ch=findFirstNonRepeatingCharacter(s);
		System.out.println(ch);

	}
	
	private static String findsmallest(String[] words) {
		
		if(words.length==0) {
			return "";
		}
		
		String small=words[0];
		
		for(String word:words) {
			if(word.length()<small.length()) {
				small=word;
			}
		}
		return small;
		
		
	}

	private static String largestwords(String[] words) {
		if(words.length==0) {
			return "";
		}
		
		String largest=words[0];
	
		for(String word:words) {
			if(word.length()>largest.length()) {
				largest=word;
			}
		}
		return largest;
	}

	public static char findFirstNonRepeatingCharacter(String s) {
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char c:s.toCharArray()) {
			
			map.put(c,map.getOrDefault(c, 0)+1);
			
		}
		
		for(HashMap.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		
		
		return '\0';
	}
	

}
