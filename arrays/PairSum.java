package arrays;

public class PairSum {

	public static void main(String[] args) {
int[] arr= {2,8,10,5,-2,5}; 
int x=pairsum(arr, 10);
System.out.println(x);
	}

	private static int pairsum(int[] arr, int i) {
		int c=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]+arr[k]==i)
				{
					c++;
				}
			}
		}
		return c;
	}

}
