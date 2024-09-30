package HashMap;

import java.util.HashMap;

public class extractUniqueChars {
public static void main(String[] args) {
	String s="ababacd";
	
	String sol=sol(s);
	System.out.println(sol);
}

private static String sol(String s) {
String sol="";
HashMap<Character,Integer> map=new HashMap<>();
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(map.containsKey(c)) {
		continue;
	}
	sol+=c;
	map.put(c, 1);
}


	return sol;
}
}
