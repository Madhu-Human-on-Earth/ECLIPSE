package premium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityGreaterThanNdivk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		ArrayList<Integer> res=majorityNdivK(arr,k);
System.out.println(res);
	}

	private static ArrayList<Integer> majorityNdivK(int[] arr, int k) {
		HashMap<Integer,Integer> map =new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);	
				}
			else {
				map.put(arr[i], 1);
			}
		}
		
		ArrayList<Integer> res=new ArrayList<>();
		for(int key:map.keySet()) {
			if(map.get(key)>arr.length/k) {
				res.add(key);
			}
		}
		return res;
		
		
	}

}
