package Arrays2;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr= {9,5,1,4,3};
		insertionsort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertionsort(int[] arr) {

		int key, j;
		
		for(int i=1;i<=arr.length-1;i++)
		{
			key=arr[i];
			j=i;
//compare key with each element on left of it until an element smaller then it is found
			
			while(j>0 && arr[j-1] > key)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=key;
			
		}
	}

}
