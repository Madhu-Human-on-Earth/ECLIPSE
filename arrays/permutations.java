package arrays;

import java.util.Scanner;

public class permutations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permutation(s.toCharArray(),0);
	}

	private static void permutation(char[] charArray,int fi) {
		// TODO Auto-generated method stub
		if(fi==charArray.length-1)
		{
			System.out.println(charArray);
			return;
		}
		for(int i= fi;i<charArray.length;i++) {
			
			swap(charArray,i,fi);
			permutation(charArray, 1+fi);
			swap(charArray,i,fi);
		}
	}

	private static void swap(char[] charArray, int i, int fi) {
		// TODO Auto-generated method stub
		char temp=charArray[i];
		charArray[i]=charArray[fi];
		charArray[fi]=temp;
	}
}


//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> permutations = new ArrayList<>();
//        generatePermutations(nums, 0, permutations);
//        return permutations;
//    }
//
//    private void generatePermutations(int[] nums, int start, List<List<Integer>> permutations) {
//        if (start == nums.length - 1) {
//            List<Integer> permutation = new ArrayList<>();
//            for (int num : nums) {
//                permutation.add(num);
//            }
//            permutations.add(permutation);
//            return;
//        }
//
//        for (int i = start; i < nums.length; i++) {
//            swap(nums, start, i);
//            generatePermutations(nums, start + 1, permutations);
//            swap(nums, start, i);
//        }
//    }
//
//    private void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//}
