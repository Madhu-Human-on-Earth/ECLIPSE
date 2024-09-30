package HashMap;

import java.util.HashMap;

public class intersectionof2arrays {
	public static void main(String[] args) {
		int[] arr1= {2,6,8,5,4,3};
		int[] arr2= {2,3,4,7};
		intersection(arr1,arr2);
	}

	private static void intersection(int[] arr1, int[] arr2) {
		if(arr1.length==0 ||arr2.length==0) {
			System.out.println("No common elemnets!!!");
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			}
			else {
				map.put(arr1[i],1);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i])) {
				int fre=map.get(arr2[i]);
				if(fre>0) {
					System.out.print("{ "+arr2[i]+" }");
				}
				else {
					map.put(arr2[i], fre-1);
				}
			}
		}
		
	}
}
