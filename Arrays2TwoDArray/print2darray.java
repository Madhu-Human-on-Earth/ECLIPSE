package Arrays2TwoDArray;

import java.util.Scanner;

public class print2darray {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input from the user for number of rows and columns
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = input.nextInt();
        
        // Take input from the user for the matrix
        int[][] matrix = new int[n][m];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Print each row of the input matrix n times, next row n-1 times, and so on
        for (int i = 0; i < n; i++) {
            int count = n - i;
            for (int j = 0; j < count; j++) {
                for (int k = 0; k < m; k++) {
                    System.out.print(matrix[i][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
