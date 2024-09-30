package Arrays;

import java.util.Arrays;

public class Merge2SortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,2};
			int[] arr2= {3,4};
			
			mergeSortedAray(arr1,arr2);
			

	}

	private static void mergeSortedAray(int[] arr1, int[] arr2) {
		int i=0;
		int j=0;
		int k=0;
		int [] merge=new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] <= arr2[j])
			{
				merge[k]=arr1[i];
				k++;
				i++;
			}
			else {
				merge[k]=arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length)
		{
			merge[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length)
		{
			merge[k]=arr2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(merge));
		
//		for(int h=0;h<merge.length;h++)
//		{
//			System.out.print(Arrays.toString(merge[h]));
//		}
		
		//find the median of the array
		
		int median=merge.length/2;
		
		if(merge.length%2==0)
		{
	System.out.println((merge[median-1]+merge[median])/2.0);
		}
		else {
			System.out.println(merge[median]);
		}
		
	}

}
