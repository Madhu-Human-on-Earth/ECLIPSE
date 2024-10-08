package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Basics {
public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();
	
	//insert 
	map.put("abc", 1);
	map.put("def", 3);
	
	//size
	
	map.put("abc", 4);
	
	System.out.println(map.size());
	
	//presence
	if(map.containsKey("abc")) {
		System.out.println("map has "+map.get("abc"));
	}
	if(map.containsKey("abc1")) {
		System.out.println("map has abc1");
		}
	
	//get value
	int v=map.get("abc");
	System.out.println(v);
	
	
	int v1=0;
	if(map.containsKey("abc")){
		v1=map.get("abc");
	}
	System.out.println(v1);
	
	//remove
//	map.remove("abc");
//	if(map.containsKey("abc"))
//	{
//		System.out.println("map has abc");
//	}
	//iterator
	Set<String> keys = map.keySet();
	
	for(String key:keys) {
		System.out.println(key);
	}
	
}
}
