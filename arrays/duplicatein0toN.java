package arrays;

import java.util.ArrayList;
import java.util.List;

public class duplicatein0toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 7, 2, 5, 4, 7, 1, 3, 6};
		List<Integer> missingNumbers = findMissingNumbers(arr);
		System.out.println(missingNumbers);

//int[] arr= {0,3,1,5,4,3,2};
//System.out.println(duplicate(arr));st
	}

	//private static int findMissingNumbers(int[] arr) {
	public	static List<Integer> findMissingNumbers(int[] arr) {
		    List<Integer> missingNumbers = new ArrayList<>();
		    boolean[] present = new boolean[arr.length+1]; // to include 0 to n-1
		    
		    for (int i = 0; i < arr.length; i++) {
		        present[arr[i]] = true;
		    }
		    
		    for (int i = 0; i < present.length; i++) {
		        if (!present[i]) {
		            missingNumbers.add(i);
		        }
		    }
		    
		    return missingNumbers;
		}

	}
	    
//		int res=0;
//		for(int i=0;i<arr.length;i++){
//		    res=res^arr[i];
//		}
//		        for(int i=0;i<=arr.length-2;i++){
//		    res=res^i;
//		}
//		        return res;
//		          
//		    }
	

