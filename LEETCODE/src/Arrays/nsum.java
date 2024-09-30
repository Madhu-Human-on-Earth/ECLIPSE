package Arrays;
import java.util.Arrays;
public class nsum {


	    public static void main(String[] args) {
	        int[] nums = {-1, 2, 1, -4, 3, 0};
	        int target = 5;
	        int n = 4;
	        
	        Solution solution = new Solution();
	        int closestSum = solution.nSumClosest(nums, target, n);
	        
	        System.out.println("Closest " + n + "Sum to " + target + ": " + closestSum);
	    }
}
	    

	    class Solution {
	        public int nSumClosest(int[] nums, int target, int n) {
	            Arrays.sort(nums);
	            int closestSum = Integer.MAX_VALUE;
	            
	            return nSumClosestHelper(nums, target, n, 0, closestSum);
	        }
	        
	        private int nSumClosestHelper(int[] nums, int target, int n, int startIndex, int closestSum) {
	            if (n == 2) {
	                return twoSumClosest(nums, target, startIndex, closestSum);
	            }
	            
	            int result = Integer.MAX_VALUE;
	            for (int i = startIndex; i < nums.length - (n - 1); i++) {
	                if (i > startIndex && nums[i] == nums[i - 1]) {
	                    continue; // Skip duplicates to avoid duplicates in the result
	                }
	                
	                int currentSum = nums[i] + nSumClosestHelper(nums, target - nums[i], n - 1, i + 1, closestSum);
	                if (Math.abs(currentSum - target) < Math.abs(result - target)) {
	                    result = currentSum;
	                }
	            }
	            
	            return result;
	        }
	        
	        private int twoSumClosest(int[] nums, int target, int startIndex, int closestSum) {
	            int left = startIndex;
	            int right = nums.length - 1;
	            int result = Integer.MAX_VALUE;
	            
	            while (left < right) {
	                int currentSum = nums[left] + nums[right];
	                if (currentSum == target) {
	                    return currentSum; // Found an exact match, return the sum
	                }
	                
	                if (Math.abs(currentSum - target) < Math.abs(result - target)) {
	                    result = currentSum;
	                }
	                
	                if (currentSum < target) {
	                    left++;
	                } else {
	                    right--;
	                }
	            }
	            
	            return result;
	        }
	    

	}

	

