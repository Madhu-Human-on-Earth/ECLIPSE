package TCS;

import java.util.HashMap;

public class CapFL {

	public static void main(String[] args) {
		String str="hello world";
		//HellO WorlD
		String cap=capitalized(str);
		HashMap<Character,Integer> map=charFreq(str);
		System.out.println(cap);
		System.out.println(map);

	}
	
	public static HashMap<Character,Integer> charFreq(String str){
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			
			if(Character.isLetter(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			
		}
		
		return map;
		
		
		
	}
	

	public static String capitalized(String str) {
		
		String[] res=str.split(" ");
		StringBuffer s=new StringBuffer();
		
		for(String word:res) {
			if(word.length()>1) {
				String cap=Character.toUpperCase(word.charAt(0))+
						   word.substring(1,word.length()-1)+
						   Character.toUpperCase(word.charAt(word.length()-1));
				
				s.append(cap).append(" ");
				
			}
			else {
				s.append(Character.toUpperCase(word.charAt(0)));
			}
		}
		
		
		return s.toString().trim();
	}

}
