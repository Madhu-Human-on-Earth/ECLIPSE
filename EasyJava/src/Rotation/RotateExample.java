package Rotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateExample {
    public static void main(String[] args) {
        // Create a list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Display the original list
        System.out.println("Original List: " + numbers);

        // Rotate the list to the right by 2 positions
//        Collections.rotate(numbers, -2);//lst 3 ele comes first
//        Collections.rotate(numbers, 1);
//        System.out.println("Rotated List: " + numbers);
        Collections.rotate(numbers, -3);//last ele will get replacded 

//        Rotated List: [3, 4, 5, 1, 2] [3]
//
        // Display the rotated list
        System.out.println("Rotated List: " + numbers);
    }
}
