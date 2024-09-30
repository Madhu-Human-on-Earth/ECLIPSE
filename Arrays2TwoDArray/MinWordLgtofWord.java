package Arrays2TwoDArray;

import java.util.Scanner;

public class MinWordLgtofWord {

//o(n)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        // Split the input string into words
        String[] words = s.split(" ");
        
        // Find the word with minimum length
        String minWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minWord.length()) {
                minWord = words[i];
            }
        }
        
        // Print the word with minimum length
        System.out.println("The word with minimum length is: " + minWord);
    }
}
