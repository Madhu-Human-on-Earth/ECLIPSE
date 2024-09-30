package recurssion;

public class IsSorted {

	public static void main(String[] args) {

		int[] arr= {1,2,30,4,5};
		
		if(arr.length==1)
		{
			System.out.println(true);
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				System.out.println(false);
				System.exit(i);;
			}
			
		}
		System.out.println(true);
	}

}
