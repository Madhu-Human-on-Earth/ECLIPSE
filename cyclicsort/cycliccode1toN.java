package cyclicsort;

import java.util.Arrays;
//Cyclic Sort   ..
//generally, it was in ascending order...
public class cycliccode1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {5,4,3,2,1};
sort(arr);
System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr)   //int
	{
		int i=0;
		while(i<arr.length)
		{
			int correct=arr[i]-1;
			
			if(arr[i]!=arr[correct])
			{
				swap(arr,i,correct);
				
			}
			else {
				i++;
			}
		}
//		//first miss
//		for(int ind=0;i<arr.length;i++)
//		{
//			if(arr[ind]!=ind)
//			{
//				return ind;
//			}
//		
//		}
//		return -1;
//	}
	}
	
	
	private static void swap(int[] arr, int i, int correct) {
	    if (i == correct) {
	        return;
	    }
	    arr[i] ^= arr[correct];
	    arr[correct] ^= arr[i];
	    arr[i] ^= arr[correct];
	}
	
	
}
