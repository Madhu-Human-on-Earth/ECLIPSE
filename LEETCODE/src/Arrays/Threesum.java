package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Threesum {

	public static void main(String[] args) {
		int[] nums = {0,0,0};
        
		List<List<Integer>> result = threeSum(nums);
        
		for (List<Integer> triplet : result) {
			System.out.println(triplet);
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
				
				while (lo < hi) {
					if (nums[lo] + nums[hi] == sum) {
						res.add(Arrays.asList(nums[lo], nums[hi], nums[i]));
						
						while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
						while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
						lo++;
						hi--;
					} else if (nums[lo] + nums[hi] < sum) {
						lo++;
					} else {
						hi--;
					}
				}
			}
		}
		return res;
	}
}
