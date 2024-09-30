package Arrays2TwoDArray;

public class Print_Like_a_Wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] arr=	{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
	int rows=arr.length;
	int col=arr[0].length;
	
	for(int i=0;i<col;i++)
	{
		//check the col is even or odd
		
		if(i%2==0)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
		}
		
		else {
			for(int j=rows-1;j>=0;j--)
			{
			System.out.print(arr[j][i]+" ");
			}
		}
	}
	}

}
