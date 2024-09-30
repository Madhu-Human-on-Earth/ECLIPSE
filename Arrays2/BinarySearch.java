package Arrays2;

public class BinarySearch {

	public static void main(String[] args) {
int [] arr= {1,2,3,4,5,6,7};
int x=binary(arr,9);
System.out.println(x);
	}

	public static int binary(int[] arr, int i) {

		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==i)
			{
				return mid;
			}
			else if(arr[mid] > i)
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			start++;
			end--;
		}
		return -1;
	}

}
