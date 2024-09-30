package Arrays2;

public class SelectionSort {

	public static void main(String[] args) {
int[] arr= {2,13,4,1,3,6,28};
selectionSort(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}

	}

	private static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i],minIndex=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					minIndex=j;
				}
				
			}
			//swap
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}

}
