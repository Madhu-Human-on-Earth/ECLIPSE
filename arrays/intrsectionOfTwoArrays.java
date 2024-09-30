package arrays;

public class intrsectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {2,6,1,2};
		int[] arr2= {1,2,3,4,2};
		intersection(arr1,arr2);
		

	}

	private static void intersection(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int n1=arr1.length;
		int n2=arr2.length;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					arr2[j]=Integer.MAX_VALUE;
					System.out.println(arr1[i]+" ");
					
				}
			}
		}
	}
}
