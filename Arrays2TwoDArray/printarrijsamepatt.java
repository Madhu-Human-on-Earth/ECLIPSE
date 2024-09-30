package Arrays2TwoDArray;

import java.util.Arrays;

public class printarrijsamepatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		int n = arr.length;

		for (int i = 0; i < n; i++) {
		  for (int j = 0; j <= i; j++) {
		    System.out.print(Arrays.toString(arr[i]) + " ");
		  }
		  System.out.println();
		}

	}

}
