
public class MatrixRotataion {


    public static void rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check if the matrix is square
        if (rows != cols) {
            System.out.println("The matrix is not square. Rotation is not possible.");
            return;
        }

        // Perform layer-by-layer rotation
        for (int layer = 0; layer < rows / 2; layer++) {
            int first = layer;
            int last = rows - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;

                // Save top element
                int top = matrix[first][i];

                // Move left element to top
                matrix[first][i] = matrix[last - offset][first];

                // Move bottom element to left
                matrix[last - offset][first] = matrix[last][last - offset];

                // Move right element to bottom
                matrix[last][last - offset] = matrix[i][last];

                // Move top element to right
                matrix[i][last] = top;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 13, 9, 5, 1},
            {5, 6, 7, 8, 14, 10, 6, 2},
            {9, 10, 11, 12, 15, 11, 7, 3},
            {13, 14, 15, 16, 16, 12, 8, 4}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}
