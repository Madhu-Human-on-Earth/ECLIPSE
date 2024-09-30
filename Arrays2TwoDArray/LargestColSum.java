package Arrays2TwoDArray;

public class LargestColSum {

	public static void main(String[] args) {

	int[][] arr= {{4,2},{1,2},{3,4},{5,6},{7,8}};
	int lar=0;
	for(int i=0;i<arr[0].length;i++)
	{
		int sum=0;
		
		for(int j=0;j<arr.length;j++)
		{
			
			sum+=arr[j][i];
		
		}
		if(sum>lar)
		{
			lar=sum;
		}
	
	}
	System.out.print(lar+" ");
	}
}

