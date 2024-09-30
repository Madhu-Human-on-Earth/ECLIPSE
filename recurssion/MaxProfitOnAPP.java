package recurssion;

import java.util.Arrays;

public class MaxProfitOnAPP {

	public static void main(String[] args) {
		int[] arr= {30,20,53,14};
		System.out.println(maxprofit(arr));
	}

	private static int maxprofit(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		
		int[] profit=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			profit[i]=(arr.length-i)*arr[i];
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int k:profit)
		{
			if(max<k)
			{
				max=k;
			}
		}
		return max;
	}

}
