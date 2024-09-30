package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Removeduplicate {
	
	
	
	
//	Certainly! Here's an explanation of each step in the code:
//
//	1. Define a 2D array `input` that contains the input arrays.
//	   ```java
//	   int[][] input = {
//	       {1, 1, 2}, {1, 2, 1}, {1, 1, 2}, {1, 2, 1}, {2, 1, 1}, {2, 1, 1}
//	   };
//	   ```
//
//	2. Create a `HashSet` called `set` to store unique lists of integers.
//	   ```java
//	   HashSet<List<Integer>> set = new HashSet<>();
//	   ```
//
//	3. Iterate over the `input` array using a for-each loop.
//	   ```java
//	   for (int[] arr : input) {
//	       // Code for each iteration...
//	   }
//	   ```
//
//	4. Inside the loop, convert each inner array `arr` to a `List<Integer>`.
//	   ```java
//	   List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
//	   ```
//
//	   - `Arrays.stream(arr)` converts the `arr` array to an `IntStream`.
//	   - `.boxed()` converts the `IntStream` to a `Stream<Integer>`.
//	   - `.toArray(Integer[]::new)` converts the `Stream<Integer>` to an array of `Integer`.
//
//	5. Add the `list` to the `set` using the `add()` method.
//	   ```java
//	   set.add(list);
//	   ```
//
//	   The `HashSet` ensures that only unique lists are stored, and lists with the same contents are considered equal.
//
//	6. Create an `ArrayList` called `output` and initialize it with the contents of the `set`.
//	   ```java
//	   List<List<Integer>> output = new ArrayList<>(set);
//	   ```
//
//	   This step ensures that the order of appearance is preserved.
//
//	7. Create a 2D array `result` with dimensions `[output.size()][ ]`.
//	   ```java
//	   int[][] result = new int[output.size()][ ];
//	   ```
//
//	8. Iterate over the elements in the `output` list using a regular for loop.
//	   ```java
//	   for (int i = 0; i < output.size(); i++) {
//	       // Code for each iteration...
//	   }
//	   ```
//
//	9. Retrieve each sublist from the `output` list.
//	   ```java
//	   List<Integer> sublist = output.get(i);
//	   ```
//
//	10. Convert each sublist to an `int` array using the `mapToInt()` and `toArray()` methods.
//	   ```java
//	   result[i] = sublist.stream().mapToInt(Integer::intValue).toArray();
//	   ```
//
//	   This step converts each element of the sublist from `Integer` to `int` and assigns it to the corresponding row in the `result` array.
//
//	11. Print the `result` array using `Arrays.deepToString(result)`.
//	   ```java
//	   System.out.println(Arrays.deepToString(result));
//	   ```
//
//	   This step prints the 2D array as a string representation.
//
//	When you run this code, it will output:
//	```
//	[[1, 1, 2], [1, 2, 1], [2, 1, 1]]
//	```
//
//	This output represents the unique arrays from the input array, without any duplicates.
//	
//	
//	
//	
	
	
	
	
	
	    public static void main(String[] args) {
	        int[][] input = {
	                {1, 1, 2}, {1, 2, 1}, {1, 1, 2}, {1, 2, 1}, {2, 1, 1}, {2, 1, 1}
	        };

	        HashSet<List<Integer>> set = new HashSet<>();

	        for (int[] arr : input) {
	            List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
	            set.add(list);
	        }

	        List<List<Integer>> output = new ArrayList<>(set);

	        int[][] result = new int[output.size()][];
	        for (int i = 0; i < output.size(); i++) {
	            List<Integer> sublist = output.get(i);
	            result[i] = sublist.stream().mapToInt(Integer::intValue).toArray();
	        }

	        System.out.println(Arrays.deepToString(result));
	    }
	}


