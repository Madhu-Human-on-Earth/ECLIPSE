package recurssion;

import java.util.Arrays;

public class removedupliarrconse {

	public static void main(String[] args) {

		int[] arr= {1,1,2,2,3,3,4,4,5,5,6};
		int[] arr1=recdpl(arr);
		for(int I:arr1)
		{
			System.out.println(I);
		}
	}

	public static int[] recdpl(int[] arr) {
	    if (arr.length == 0) {
	        return new int[0];
	    }
	    int j = 0;
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[j] != arr[i]) {
	            arr[++j] = arr[i];
	        }
	    }
	    return  Arrays.copyOfRange(arr, 0, j+1);
	
	}

	}


