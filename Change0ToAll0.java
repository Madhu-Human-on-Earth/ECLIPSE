public class Change0ToAll0 {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 1, 0}
        };
        int[][] arrp = new int[arr.length][arr[0].length]; // Fix: Use arr[0].length to get the number of columns
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < arr.length; k++) {
                        arrp[k][j] = 0; // Fix: Set entire column to 0
                    }
                    for (int k = 0; k < arr[i].length; k++) {
                        arrp[i][k] = 0; // Fix: Set entire row to 0
                    }
                } 
                
                else {
                    arrp[i][j] = arr[i][j]; // Fix: Copy original value to arrp
                }
            }
        }

        // Copy values from arrp back to arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arrp[i][j];
            }
        }

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
