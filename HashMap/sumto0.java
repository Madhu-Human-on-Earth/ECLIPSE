package HashMap;

import java.util.HashMap;

public class sumto0 {
	public static void main(String[] args) {
		int[] arr= {2,1,-2,2,3};
		int sol=sum(arr);
		System.out.println(sol);
	}

	private static int sum(int[] arr) {
		int count=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int val=-arr[i];
			if(map.containsKey(val)) {
				count+=map.get(val);
			}
			
			map.put(arr[i], map.getOrDefault(map.get(arr[i]), 0)+1);
			
		}
		
		return count;
	}

}
