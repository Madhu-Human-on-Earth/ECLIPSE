package arrays;

public class signchangesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,4,3};
		int sum=0;
	
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				arr[i]=-arr[i];
			}
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
