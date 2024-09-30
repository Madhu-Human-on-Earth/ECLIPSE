package arrays;

public class SecondMaximum {
	public static void main(String[] args) {
		int[] arr= {};
		
		int L=Integer.MIN_VALUE;
		int SL=Integer.MIN_VALUE;
		
		if(arr.length==0)
		{
			System.out.println(L);
			System.exit(0);
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>L)
			{
				SL=L;
				L=arr[i];
				
			}
			else if(arr[i] > SL && arr[i]!=L) {
				SL=arr[i];
			}
		}
		System.out.println(SL);
		
	}
	
	

}
