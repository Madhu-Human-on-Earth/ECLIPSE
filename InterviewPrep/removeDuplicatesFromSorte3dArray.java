package InterviewPrep;

public class removeDuplicatesFromSorte3dArray {

	public static void main(String[] args) {

int[] nums= {1,1,2};


	System.out.println(removeDuplicates(nums));


	}


	
	    public static int removeDuplicates(int[] nums) {
	        if(nums.length == 0)
	            return 0;
	        
	        int NewIndex = 1; 

	        for(int i = 0; i < nums.length - 1; i++) {
	            
	            if(nums[i] < nums[i + 1]){ 
	              nums[NewIndex] = nums[i + 1];
	              NewIndex++;
	            }
	        }
	        return NewIndex;
	    }
	}
