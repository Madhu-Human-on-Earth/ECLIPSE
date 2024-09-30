import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Permute {

    // Recursive function to generate permutations
    static void generatePermutations(List<Integer> arr, int currentIndex) {
        // Base case: if currentIndex reaches the end of the list, print the permutation
        if (currentIndex == arr.size() - 1) {
            System.out.println(Arrays.toString(arr.toArray()));
            return;
        }

        for (int i = currentIndex; i < arr.size(); i++) {
            // Swap the elements at currentIndex and i
            Collections.swap(arr, i, currentIndex);
            
            // Recursively generate permutations for the remaining elements
            generatePermutations(arr, currentIndex + 1);
            
            // Swap back to backtrack and try other possibilities
            Collections.swap(arr, currentIndex, i);
        }
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3);
        generatePermutations(inputList, 0);
    }
}
