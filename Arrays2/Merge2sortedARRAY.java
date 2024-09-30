package Arrays2;
//not sorted..it can be any 
public class Merge2sortedARRAY {

	public static void main(String[] args) {

		int[] arr1= {1,3,4,7,11};
		int[] arr2= {2,4,6,13};
		int[] arr3=new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				arr3[k++]=arr1[i++];	
			}
			else
			{
				arr3[k++]=arr2[j++];
			}
		}
		//sort remaining elements 
		while(i<arr1.length)
		{
			arr3[k++]=arr1[i++];
		}
		
		while(j<arr2.length)
		{
			arr3[k++]=arr2[j++];
		}
		for(int h=0;h<arr3.length-1;h++)
		{
			System.out.print(arr3[h]+" ");
		}
	}

}
