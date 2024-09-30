package Arrays2TwoDArray;

public class print2doversingleloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] mat = { { 1, 2, 3 },
                 { 4, 5, 6 },
                 { 7, 8, 9 } };

 // Dimensions of the matrix
 int N = mat.length;
 int M = mat[0].length;
 
 
 for(int i=0;i<N*M;i++)
 {
	 int rows=mat.length;
	 int col=mat[0].length;
	 //find row and col index
	 int row=i/col;
	 int colum=i%col;
	 System.out.print(mat[row][colum]+" ");
 }
	}

}
