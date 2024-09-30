package cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDissapearedValues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 3, 2, 7, 8};
		    List<Integer> disappearedValues = sort(arr);
		    System.out.println("Disappeared values: " + disappearedValues);
	}
//	public static void sort(int[] arr)   //int
//	{
	public static List<Integer> sort(int[] arr) {
	    int i = 0;
	    while (i < arr.length) {
	        int correct = arr[i] - 1;

	        if (arr[i] != arr[correct]) {
	            swap(arr, i, correct);

	        } else {
	            i++;
	        }

	    }

	    List<Integer> ans = new ArrayList<>();
	    for (int in = 0; in < arr.length; in++) {
	        if (arr[in] != in + 1) {
	            ans.add(in + 1); // add the disappeared value (in + 1)
	        }
	    }

	    return ans;
	}

		
		
	
	
	
	private static void swap(int[] arr, int i, int correct) {
	    if (i == correct) {
	        return;
	    }
	    arr[i] ^= arr[correct];
	    arr[correct] ^= arr[i];
	    arr[i] ^= arr[correct];
	}
	
	
}


