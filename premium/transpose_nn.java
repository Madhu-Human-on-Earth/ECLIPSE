package premium;
//n*n
public class transpose_nn {
public static void main(String[] args) {
	 int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8,9}
	        };

	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        transpose(matrix);

	        System.out.println("\nTransposed Matrix:");
	        printMatrix(matrix);
}

private static void transpose(int[][] matrix) {
	// TODO Auto-generated method stub
	  int numRows = matrix.length;
      int numCols = matrix[0].length;

      for (int i = 0; i < numRows; i++) {
          for (int j = i + 1; j < numCols; j++) {
              // Swap the elements matrix[i][j] and matrix[j][i]
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
          }
      }
	
}

private static void printMatrix(int[][] matrix) {
	// TODO Auto-generated method stub
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
}
