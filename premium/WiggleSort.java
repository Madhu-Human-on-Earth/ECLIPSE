package premium;

import java.util.Arrays;

public class WiggleSort {
	


   public static void wiggleSort(int[] nums) {
	   
	   for(int i=0;i<nums.length-1;i++) {
		   
		   if(i%2==0) {
			   //even
			   if(nums[i] > nums[i+1]) {
				   swap(nums,i,i+1);
			   }
		   }
		   else {
			   if(nums[i]<nums[i+1]) {
				   swap(nums,i,i+1);
			   }
		   }
	   }
	   
	  
  }

    private static void swap(int[] nums, int i, int j) {
	int temp=nums[i];
	nums[i]=nums[j];
	nums[j]=temp;
	
}

	public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 1, 6, 4 };
        System.out.println("Original array: " + Arrays.toString(nums));

        wiggleSort(nums);
        System.out.println("Wiggle sorted array: " + Arrays.toString(nums));
    }
}

