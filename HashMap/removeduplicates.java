package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,3,2,2,3,1,6,2,5};
ArrayList<Integer> output=removeDuplicates(arr);
System.out.println(output);
	}

	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> out=new ArrayList<>();
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				
				continue;
			}
			else {
				out.add(arr[i]);
				map.put(arr[i], true);
			}
		}
		return out;
	}

}



//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
//
//        int[] result = removeDuplicates(arr);
//        System.out.println(Arrays.toString(result));
//    }
//
//    private static int[] removeDuplicates(int[] arr) {
//        if (arr.length <= 1) {
//            return arr; // No duplicates to remove
//        }
//
//        int uniqueIndex = 0; // Index for storing unique elements
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != arr[uniqueIndex]) {
//                uniqueIndex++;
//                arr[uniqueIndex] = arr[i];
//            }
//        }
//
//        // Create a new array with only unique elements
//        int[] result = new int[uniqueIndex + 1];
//        System.arraycopy(arr, 0, result, 0, uniqueIndex + 1);
//
//        return result;
//    }
//}

//Apologies for the confusion. Let me explain the line `System.arraycopy(arr, 0, result, 0, uniqueIndex + 1);` in more detail.
//
//In the given line, `System.arraycopy()` is a built-in method in Java that allows you to copy elements from one array to another. Here's the breakdown of the parameters used in the method:
//
//- `arr`: The source array from which elements will be copied.
//- `0`: The starting index in the source array from where the copying should begin.
//- `result`: The destination array where the elements will be copied.
//- `0`: The starting index in the destination array where the elements should be copied.
//- `uniqueIndex + 1`: The number of elements to be copied from the source array to the destination array.
//
//In the context of removing duplicates from a sorted array, after identifying the last unique element's index (`uniqueIndex`), we create a new array called `result` to store only the unique elements. 
//
//To copy the unique elements from the original sorted array (`arr`) to the `result` array, we use `System.arraycopy()`. The `0` index indicates that we start copying from the beginning of the source array (`arr`), and the `0` index in the destination array (`result`) indicates that we start copying from the beginning of the `result` array. The parameter `uniqueIndex + 1` specifies the number of elements to be copied, which corresponds to the number of unique elements found in the original array.
//
//By using `System.arraycopy()`, the unique elements are effectively copied from the original array to the `result` array, which will then contain only the unique elements.
//
//I hope this clarifies the usage of `System.arraycopy()` in the given context.

