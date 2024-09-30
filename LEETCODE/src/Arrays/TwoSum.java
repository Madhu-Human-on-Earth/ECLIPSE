package Arrays;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr=new int[] {3,2,4};
		int[] arr1=twosum(arr,10);
		//arr1=twosum(arr,6);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" ");
			
		}
		

	}

//	private static int[]twosum(int[] arr, int t) {
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=1;j<arr.length;j++)
//			{
//				if((i!=j) && arr[i]+arr[j]==t)
//				{
//					return new int[] {i,j};
//				}
//				
//			}
//		}
//		return new int[] {-1,-1};
//		
//	}
	private static int[] twosum(int[] arr, int t) {
	HashMap<Integer,Integer> map=new HashMap<>();
	
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(t-arr[i]))
		{
			return new int[] {map.get(t-arr[i]),i};
		}
		else {
			map.put(arr[i], i);
		}
	}
	return new int[] {-1,-1};
	
	}
}
