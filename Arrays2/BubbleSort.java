package Arrays2;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[]= {-2,45,0,11,-9};
		bubblesort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void bubblesort(int[] array) {
int size=array.length;
		 for (int step = 0; step < size - 1; step++) {
			 for (int i = 0; i < size - step - 1; i++) {
			 // To sort in descending order, change > to < in this line.
			 if (array[i] > array[i + 1]) {
			 // swap if greater is at the rear position
			 int temp = array[i];
			 array[i] = array[i + 1];
			 array[i + 1] = temp;
			 }
			 }
			 }

	}

}
